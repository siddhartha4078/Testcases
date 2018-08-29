package com.oyi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Print_Response_Header {
	

		@Test
		public void ResponseHeader()
		{
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.get("/Hyderabad");

			Headers allHeaders = response.headers();
			 
			// Iterate over all the Headers
			for(Header header : allHeaders)
			{
				System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
			}
		}
		}
		
		
