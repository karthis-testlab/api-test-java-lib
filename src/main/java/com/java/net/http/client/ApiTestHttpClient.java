package com.java.net.http.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiTestHttpClient {

	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClient.newBuilder()
		                                  .version(Version.HTTP_1_1)
		                                  .build();
		
		HttpRequest request = HttpRequest.newBuilder()
		                                     .GET()
		                                     .uri(URI.create("https://www.google.com/"))
		                                     .build();
		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println("Status Code: "+response.statusCode());
			System.out.println("Status Line: "+response.version());
			System.out.println("Headers: "+response.headers().allValues("Content-Type"));
			System.out.println("Body: "+response.body());
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}