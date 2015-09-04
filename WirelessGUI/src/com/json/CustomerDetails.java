package com.json;

public class CustomerDetails {
	
	private String customertype;
	private int customerid;	
	private String fname;
	private String lname;		
	private Address connectionaddress;
	private Address billingaddress;
	private String email;
	private long contactnumber;
	private String dateofbirth;
	
	public CustomerDetails(String customertype, int customerid,
			String fname, String lname, Address billingaddress, 
			Address connectionaddress, String email, long contactnumber,
			String dateofbirth) {
		super();
		this.customertype = customertype;
		this.customerid = customerid;
		this.fname = fname;
		this.lname = lname;
		this.connectionaddress = connectionaddress;
		this.billingaddress = billingaddress;
		this.email = email;
		this.contactnumber = contactnumber;
		this.dateofbirth = dateofbirth;
	}	
}
