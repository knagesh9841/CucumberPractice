package com.crm.qa.testdata;

public class Customer {
	
	  public String firstName;
	  public String lastName;
	  public String age;
	  public String webSite;
	  public Address address;
	  public PhoneNumber phoneNumber;	
	  public String interest;
	  public String note;
	  
	  public class Address {
		  public String street;
		  public String secondaryAddress;
		  public String city;
		  public String zipCode;
		  public String state;
		  public String country;
	  }

	  public class PhoneNumber {
		  public String home;
		  
	  }

}
