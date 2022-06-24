package com.ashwath.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
public class JsonProducer {

	public static void main(String[] args) {
		
		int count =0;
		//create Producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
		
		//create the logger
		Logger log = LoggerFactory.getLogger(JsonProducer.class.getSimpleName());
				
		//create Producer
		KafkaProducer<String, JSONObject> producer = new KafkaProducer<>(properties);
		
		JSONParser parser = new JSONParser(); 
		try {
			JSONArray array = (JSONArray) parser.parse(new FileReader("/home/costrategix/Documents/demo/src/main/resources/police_short.json"));
			
			//iterate over the json array and publish to the topic
			for (Iterator iterator = array.iterator(); iterator.hasNext();) {
				JSONObject object = (JSONObject) iterator.next();

				//create producer record
				ProducerRecord<String, JSONObject> record = new ProducerRecord<String, JSONObject>("json-mongo", object);
				
				//send the data
				producer.send(record);
				count++;
				
				//flush the data
				producer.flush();
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		producer.close();
		log.info(""+count);

	}

}
