public class Customer {
	
	private String lineofbusiness;
	private CustomerDetails cust_det;		
	private String email;
	private String contactnumber;
	private String dateofbirth;
	
	public Customer(CustomerDetails cust_det,
			String email, String contactnumber, String dateofbirth) {
		super();
		this.lineofbusiness = "vzw";
		this.cust_det = cust_det;
		this.email = email;
		this.contactnumber = contactnumber;
		this.dateofbirth = dateofbirth;
	}
	
	
	
}