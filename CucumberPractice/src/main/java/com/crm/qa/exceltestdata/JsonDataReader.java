package com.crm.qa.exceltestdata;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.crm.qa.testdata.Customer;
import com.google.gson.Gson;

public class JsonDataReader {
	
	private final String customerFilePath = System.getProperty("user.dir")+"//src//main//java//com//crm//qa//testdata//Customer.json";
	private List<Customer> customerList;
	
	public JsonDataReader(){
		customerList = getCustomerData();
	}
	
	private List<Customer> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerFilePath));
			Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
			return Arrays.asList(customers);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
		
	public final Customer getCustomerByName(String customerName){
		for(Customer customer : customerList) {
			if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
		}
		return null;
	}

}
