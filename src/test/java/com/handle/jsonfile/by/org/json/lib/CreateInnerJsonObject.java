package com.handle.jsonfile.by.org.json.lib;

import org.json.JSONObject;

public class CreateInnerJsonObject {

	public static void main(String[] args) {
		
		JSONObject parent = new JSONObject();
		parent.put("name", "Joey");
		parent.put("age", 30);
		parent.put("isActive", true);
		
		JSONObject child = new JSONObject();
		child.put("street", "123 Elm st");
		child.put("city", "Metropolis");
		child.put("state", "NY");
		child.put("zipcode", "1001");
		
		parent.put("address", child);

	}

}