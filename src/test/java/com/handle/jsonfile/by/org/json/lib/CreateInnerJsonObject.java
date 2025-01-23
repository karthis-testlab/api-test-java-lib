package com.handle.jsonfile.by.org.json.lib;

import org.json.JSONObject;

public class CreateInnerJsonObject {

	public static void main(String[] args) {
		
		// Main JSON Object
		JSONObject parent = new JSONObject();
		parent.put("name", "Joey");
		parent.put("age", 30);
		parent.put("isActive", true);
		
		// Nested JSON Object for the address
		JSONObject child = new JSONObject();
		child.put("street", "123 Elm st");
		child.put("city", "Metropolis");
		child.put("state", "NY");
		child.put("zipcode", "1001");
		
		parent.put("address", child);
		
		// Print the JSON Object
	   //  Using toString(4) for pretty printing with indentation
		System.out.println(parent.toString(4));

	}

}