package com.onebill.test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.delete;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class TestMock {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
	}

	@Test
	public void testfetchCompanyInfo() {
		get("/CustomizePlan/company");

	}

	@Test
	public void tetsfetchProductsInfo() {
		get("/CustomizePlan/products");
	}

	@Test
	public void testfetchPlansInfo() {
		get("/CustomizePlan/plans");
	}

	@Test
	public void testfetchChargesInfo() {
		get("/CustomizePlan/charges");
	}

	@Test
	public void testfetchChargeInfo() {
		get("/CustomizePlan/charges/1");
	}

	@Test
	public void testfetchPlanInfo() {
		get("/CustomizePlan/plans/netLine");
	}

	@Test
	public void testfetchbundelsInfo() {
		get("/CustomizePlan/bundels");
	}

	@Test
	public void testfetchProductInfo() {
		get("/CustomizePlan/products/Airtel Bank");
	}

	@Test
	public void testfetchbundelInfo() {
		get("/CustomizePlan/bundels/Airtel Selected");
	}
	@Test
	public void  testremoveBundel() {
		delete("/CustomizePlan/bundels/14");
	}
	
	@Test
	public void testremovePlan() {
		delete("/CustomizePlan/plans/10");
	}
	
	@Test
	public void testremoveProduct() {
		delete("/CustomizePlan/products/16");
	}
	
	@Test
	public void testremoveCharges() {
		delete("/CustomizePlan/charges/10");
	}
	
	@Test
	public void testremoveCompany() {
		delete("/CustomizePlan/company/16");
	}
	
	
}
