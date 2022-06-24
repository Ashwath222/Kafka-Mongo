package com.ashwath.connection;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.ashwath.model.IncidentData;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDb {

	private static CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
    private static CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
    
    private static String uriString = "mongodb+srv://m001-student:m001-mongodb-basics@sandbox.29k5s.mongodb.net/?retryWrites=true&w=majority";

	public MongoDb() {
	}
    
    public static MongoCollection<IncidentData> getMongoCollection() {
        
        MongoClient mongoClient = MongoClients.create(uriString);
        
        MongoDatabase database = mongoClient.getDatabase("json_mongo").withCodecRegistry(pojoCodecRegistry);
        MongoCollection<IncidentData> collection = database.getCollection("inspection_data",IncidentData.class);
        
        return collection;
    }

}
