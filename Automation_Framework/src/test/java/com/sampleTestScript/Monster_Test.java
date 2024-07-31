package com.sampleTestScript;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class Monster_Test{
@Test
public void ts_test(){
	
	System.out.println("hi");
	String browsername = System.getProperty("bname");
	System.out.println(browsername);
	String username = System.getProperty("user");
	System.out.println(username);
		
}
}