package com.tourism.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void check()
	{
		Reporter.log("check",true);
	}
	
	@Test
	public void find()
	{
		Reporter.log("find",true);
	}
	
	@Test
	public void search()
	{
		Reporter.log("search",true);
	}



}
