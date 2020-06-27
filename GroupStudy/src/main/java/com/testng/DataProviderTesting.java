package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	
	@DataProvider
	public Object[][] getData() {				
		Object[][] abc =  new Object[][]{{"SAROWER","1234"},{"XYZ","1234"}};
		return abc;
		//return new Object[][]{{"zia@yahoo.com","1234"},{"hassan@gmail.com","789"}};		
	}
	
	@DataProvider
	public String[][] getStringData(){
		String[][] arrTest = {{"zia@yahoo.com","1234"},{"hassan@gmail.com","789"}};
		return arrTest;
	}
	
	@Test(dataProvider="getStringData")
	public void test1(String name, String value) {
		System.out.println(name+" "+value);
	}
	
	@Test(dataProvider="getData")
	public void test2(String parm1, String parm2) {
		System.out.println("Test2= "+parm1+" "+parm2);
	}
	
	@Test(enabled=false)
	public void test3() {
		System.out.println("Test3");
	}
	
	
}
