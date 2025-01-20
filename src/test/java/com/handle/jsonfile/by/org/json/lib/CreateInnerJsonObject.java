package com.handle.jsonfile.by.org.json.lib;

import org.json.JSONObject;

public class CreateInnerJsonObject {

	public static void main(String[] args) {
		
		JSONObject parent = new JSONObject();
		parent.put("name", "Joey");
		parent.put("age", 30);
		parent.put("isActive", true);
		
		JSONObject child = new JSONObject();

	}

}