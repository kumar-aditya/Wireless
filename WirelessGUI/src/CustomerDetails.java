
public class CustomerDetails {
	
	private String customertype;
	private String customerid;	
	private String fname;
	private String lname;		
	private Address connectionaddress;
	private Address billingaddress;
	
	public CustomerDetails(String customertype,
			String customerid, String fname, String lname,
			Address connectionaddress, Address billingaddress) {
		
		super();		
		this.customertype = customertype;
		this.customerid = customerid;
		this.fname = fname;
		this.lname = lname;
		this.connectionaddress = connectionaddress;
		this.billingaddress = billingaddress;
	}
}
