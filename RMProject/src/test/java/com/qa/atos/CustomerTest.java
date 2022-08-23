package com.qa.atos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	RoyalMail r = new RoyalMail();//the class we are testing
	RoyalMail x;

	@BeforeAll //JUNIT4 - BeforeClass
	public static void start() {
		System.out.println("Before All");
		//connecting to a database
	}

	@BeforeEach //JUNIT4 - Before
	public void setUp() {
		r = new RoyalMail("x", "g", 44, "erdington");
		r.setFirstname("Ash");
		r.setSecondname("g");
		r.setPhoneNumber(044);
		r.setAddress("erdington");
		System.out.println("Before Each");
		//initialise test data
	}

	@Test
	public void testGetFirstname() {
		//test if your method does what you expect it to, you need assertions
		Assertions.assertEquals("x",r.getFirstname());
		Assertions.assertNotEquals(null, r.getFirstname());
		System.out.println("Test");
	}
	@Test
	public void testGetSecondname() {
		//test if your method does what you expect it to, you need assertions
		Assertions.assertEquals("g",r.getSecondname());
		Assertions.assertNotEquals(null, r.getSecondname());
		System.out.println("Test2");
	}
	
	@Test
	public void testGetPhoneNumber() {
		Assertions.assertEquals(044,r.getPhoneNumber());
		Assertions.assertNotEquals(0, r.getPhoneNumber());
		System.out.println("Test 3");
	}
	
	@Test
	public void testGetAddress() {
		Assertions.assertEquals("erdington",r.getAddress());
		Assertions.assertNotEquals(null, r.getAddress());
		System.out.println("Test 4");
	}
	
	@Test
	public void testTostring() {
		String out = "Customer [Firstname=x, Secondname=g, PhoneNumber=044, Address=erd]";
		Assertions.assertEquals(out, r.toString());
		System.out.println("Test 3");
	}

	//2 records
	//create test - passed in 1 record
	//read test - 2 record outputs
	
	@AfterEach //JUNIT4 - After
	public void clean() {
		System.out.println("After Each");
		//clear any data
	}

	@AfterAll //JUNIT4 - AfterClass
	public static void stop() {
		System.out.println("After all");
		//closing connection
	}
}
