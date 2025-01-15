package com.handle.jsonfile.by.org.json.lib;

import org.json.JSONObject;

public class ReadValueSimpleJsonObject {
	
	public static void main(String[] args) {
		String jsonString = "{\"name\":\"John Doe\",\"age\":30,\"email\":\"john.doe@example.com\"}";
		JSONObject json = new JSONObject(jsonString);
		System.out.println(json.get("name"));	
		System.out.println(json.get("age"));
		System.out.println(json.get("email"));
	}

}