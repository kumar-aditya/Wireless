package com.json;
public class OrderDetails {

	String dateofbooking;
	String duedate;
	public Services[] services = new Services[1];
	
	public OrderDetails(String dateofbooking, String duedate, Services services) {
		super();
		this.dateofbooking = dateofbooking;
		this.duedate = duedate;
		this.services[0] = services;
	}		
}
