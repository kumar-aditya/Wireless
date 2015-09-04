package com.json;
public class ContractDetails {

	String contractid;
	String modeltype;
	String classofservice;
	String fromdate;
	String todate;
	int discountpercentage;
	String change;
	
	public ContractDetails(String contractid, String modeltype,
			String classofservice, String fromdate, String todate,
			int discountpercentage, String change) {
		super();
		this.contractid = contractid;
		this.modeltype = modeltype;
		this.classofservice = classofservice;
		this.fromdate = fromdate;
		this.todate = todate;
		this.discountpercentage = discountpercentage;
		this.change = change;
	}
	
}
