package com.ashwath.demo;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.ashwath.connection.MongoDb;
import com.ashwath.model.IncidentData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class JsonConsumer {

	public static void main(String[] args) {
		
		String boostrapServers = "127.0.0.1:9092";
        String groupId = "JSON-mongo-application";
        String topic = "json-mongo";
        
        JSONParser parser =new JSONParser();
        
        //get the collection to operate on
        MongoCollection<IncidentData> collection = MongoDb.getMongoCollection();
        
        
        
        
        int count=0;
        
        Logger log = LoggerFactory.getLogger(JsonConsumer.class.getSimpleName());
        
        log.info("In the consumer");
        
        // create consumer configs
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, boostrapServers);
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        
        //create a consumer 
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);	

        //get a reference to the current thread
        final Thread mainThread = Thread.currentThread();
        
        //adding a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
        	public void run() {
        		log.info("Detected a shutdown");
        		consumer.wakeup();
        		
				//join the main thread to continue execution in the main thread
        		try {
					mainThread.join();
					
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
        });
        
        try {
			
        	//subscribing our consumer to the topic
        	consumer.subscribe(Arrays.asList(topic));
        	
        	while(true) {
				log.info("Polling");
        		ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
				
				 for(ConsumerRecord<String, String> record :records) {
					 
						 IncidentData data = new ObjectMapper().readValue(record.value(), IncidentData.class);
						 collection.insertOne(data);
					 
					 log.info(" "+(++count));
				 }
        	
        	}
		} catch (WakeupException e) {
			log.info("Wakeup exception encountered");
		}catch (Exception e) {
			log.info("Unexpected exception" +e);
		} finally {
			consumer.close();
			log.info("The consumer is now closed");
		}
	}

}
