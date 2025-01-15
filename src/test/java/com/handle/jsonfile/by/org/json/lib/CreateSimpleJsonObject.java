package com.handle.jsonfile.by.org.json.lib;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class CreateSimpleJsonObject {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "John Doe");
		map.put("age", 30);
		JSONObject obj = new JSONObject(map);
		System.out.println(obj.toString());

	}

}