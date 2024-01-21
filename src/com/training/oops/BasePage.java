package com.training.oops;

public class BasePage {

	public static void main(String[] args) {
		Steps stpe = new Steps();
		
		stpe.TestCase1();
	}
	
public LoginPage Createpage(String pagename) {
	
	LoginPage loginpage;
	if(pagename == ""||  pagename==null)
	{
		loginpage=null;
	}
	else {
		loginpage = new LoginPage();
	}
		
	
	
	
	return loginpage;
	
	}
	
}

// method - createPage input - SString, if string  is not empty return loginpage object else null
