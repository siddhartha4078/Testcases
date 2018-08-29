package com.oyi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Verify_ResponseStatus {
	

		@Test
		public void ResponseStatus()
		{
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.get("/Hyderabad");


			String statusLine = response.getStatusLine();
			Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");
		}
		}
		
