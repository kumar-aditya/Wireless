package com.json;

public class OrderingJSON {

	String lineofbusiness;
	CustomerDetails customerdetails;
	OrderDetails orderdetails;
	ContractDetails[] contractdetails = new ContractDetails[1];
	
	public OrderingJSON(CustomerDetails customerdetails, OrderDetails order_det,
			ContractDetails contractdetails) {
		super();
		this.lineofbusiness = "vzw";
		this.customerdetails = customerdetails;
		this.orderdetails = order_det;
		this.contractdetails[0] = contractdetails;	
	}
}
