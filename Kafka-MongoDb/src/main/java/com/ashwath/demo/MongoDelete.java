package com.ashwath.demo;

import com.ashwath.connection.MongoDb;
import com.ashwath.model.IncidentData;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

public class MongoDelete {

	public static void main(String[] args) {
		
		MongoCollection<IncidentData> collection = MongoDb.getMongoCollection();
		
		//demo to showcase the deletion operation in mongoDb
		System.out.println(collection.deleteOne(Filters.eq("incidentID", 898651)));

	}

}
