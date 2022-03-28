package com.TestProject.stepdefinition;

import com.TestProject.baseclass.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks1 extends Baseclass {
	//Baseclass b=new Baseclass();
	long startTime;
	@Before
	public void beforemethod() {
		long startTime = System.currentTimeMillis();
		System.out.println("process startTime:"+startTime);
		//b.browserlaunch("https://testproject.io/");
		
	}
	
	@After
	public void aftermethod() {
		long endTime = System.currentTimeMillis();
		System.out.println("process startTime:"+(endTime-startTime));
	}

}
