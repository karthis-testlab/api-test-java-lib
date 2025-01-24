package com.handle.jsonfile.by.org.json.lib;

import org.json.JSONObject;

public class CreateInnerJsonObject {

	public static void main(String[] args) {
		
		// Main JSON Object
		JSONObject personJson = new JSONObject();
		
		// Nested JSON Object for the address
		JSONObject addressJson = new JSONObject();
		addressJson.put("street", "123 Elm st");
		addressJson.put("city", "Metropolis");
		addressJson.put("state", "NY");
		addressJson.put("zipcode", "1001");
		
		// Adding nested JSON object to the main JSON object
		personJson.put("name", "Joey");
		personJson.put("age", 30);
		personJson.put("isActive", true);		
		personJson.put("address", addressJson);
		
		// Print the JSON Object
		// Using toString(4) for pretty printing with indentation
		System.out.println(personJson.toString(5));

	}

}