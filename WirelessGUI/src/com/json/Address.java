package com.json;
public class Address {
	
	private String streetname;
	private int zipcode;
	private String city;
	private String state;
	private int stateid;
	private String country;
	
	public Address(String streetname, int zipcode, String city,
			String state, int stateid, String country) {
		super();
		this.streetname = streetname;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.stateid = stateid;
		this.country = country;
	}
	
	
}
