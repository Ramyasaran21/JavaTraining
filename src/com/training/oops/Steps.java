package com.training.oops;

public class Steps {
	
	public void TestCase1() {
		BasePage basepage = new BasePage();
		
		basepage.Createpage("");
		basepage.Createpage("Login");
		basepage.Createpage("Ramya");
		basepage.Createpage(null);
		
	}

}
//In loginpage create a constructor print a line loginpage created
//in step class ,write a method  name testcase1 ,creaate an object for basepage and involve the create login page method