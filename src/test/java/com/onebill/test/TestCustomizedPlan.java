package com.onebill.test;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCustomizedPlan {
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testaddCompany() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("companyName", "Zelam"); 
		 requestParams.put("companyAddress", "goap");
		 requestParams.put("companyPhone", "878866942");
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());

		 Response response = request.post("/CustomizePlan/company");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testaddPlan() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("planName", "Virender"); 
		 requestParams.put("planDescription", "goa");
		 requestParams.put("startDate", "2020-12-12");
		 requestParams.put("productId", "1"); 


		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());

		 Response response = request.post("/CustomizePlan/plans");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 
		 System.out.println("Response body: " + response.body().asString());
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testaddProducts() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("productName", "nder"); 
		 requestParams.put("productDescription", "Netpost");
		 requestParams.put("companyId",1);
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.post("/CustomizePlan/products");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testaddBundel() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("bundelName", "nder"); 
		 requestParams.put("bundelDescription", "Netpost");
		 requestParams.put("PlanId", "1");
		 request.header("Content-Type", "application/json");
		 
		 request.body(requestParams.toJSONString());
		 Response response = request.post("/CustomizePlan/bundels");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testaddCharges() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("strategyCost", 585); 
		 requestParams.put("strategyName", "Wetpost");
		 requestParams.put("chargeDescription", "Wetpost offers");
		 requestParams.put("chargeType", "Recuring");
		 requestParams.put("validityInDays", 24);
		 requestParams.put("planId","1");
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.post("/CustomizePlan/charges");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
	
	//Update
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testUpdateBundel() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("bundelName", "Airtel"); 
		 requestParams.put("bundelDescription", "Netpost");
		 requestParams.put("bundelId", 2);
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/CustomizePlan/bundels");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testUpdateCompany() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("companyId", 1); 
		 requestParams.put("companyAddress", "Goa");
		 requestParams.put("companyPhone", 754236265);
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/CustomizePlan/company");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testUpdateproduct() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("companyId", 1); 
		 requestParams.put("productDescription", "LAN services");
		 requestParams.put("productName", "LAN");
		 requestParams.put("productId", 1);
		 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/CustomizePlan/products");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
		
	@SuppressWarnings("unchecked")
	@Test
	public void testUpdateplan() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("planId", 10); 
		 requestParams.put("planDescription", "LAN services");
		 requestParams.put("planName", "LAN");
		 requestParams.put("productId", 2);
		 requestParams.put("startDate", "2020-12-12"); 
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/CustomizePlan/plans");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testUpdateCharges() {
	
		 RequestSpecification request = RestAssured.given();

		 JSONObject requestParams = new JSONObject();
		 requestParams.put("strategyCost", 585); 
		 requestParams.put("strategyName", "Netpost");
		 requestParams.put("chargeDescription", "Netpost offers");
		 requestParams.put("chargeType", "Recuring");
		 requestParams.put("validityInDays", 24);
		 requestParams.put("planId","10");
		 requestParams.put("chargeId","2");
		 request.header("Content-Type", "application/json");
		 request.body(requestParams.toJSONString());
		 Response response = request.put("/CustomizePlan/charges");
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode,200);
		 System.out.println("Response body: " + response.body().asString());		
	}	
	
}
