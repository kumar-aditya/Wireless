import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.json.*;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();  
		Gson gson = new Gson();
		int cust_id = 0;
		String cust_type;
		if(request.getParameter("cust_id") == null)
		{
			cust_id = 0;
			cust_type = "new";
		}
		else
			cust_type = "registered";
		
		Date date = new Date();
		DateFormat inFormat = new SimpleDateFormat("yyyy-mm-dd");
		DateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy");
		cust_id = Integer.parseInt(request.getParameter("cust_id"));  
		String fname = request.getParameter("firstname");  
		String lname = request.getParameter("lastname");  
		String street = request.getParameter("streetname");
		int zip = Integer.parseInt(request.getParameter("zipcode"));		
		String city = request.getParameter("city");		
		String state = request.getParameter("state");
		String country = request.getParameter("country");			

		//TODO Write code for proper State ID		
		int stateid = 0; 
		
		String email = request.getParameter("email");
		Date dob = null;
		try {
			dob = inFormat.parse(request.getParameter("dob"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long contact = Long.parseLong(request.getParameter("contact_number"));
		String order_type = request.getParameter("order_type");
		String plan = request.getParameter("plan");
		
		
		
		Address billingAddr = new Address(street, zip, city,state, stateid, country);
		Address connAddr = new Address(street, zip, city, state, stateid, country);
		CustomerDetails customerdetails = new CustomerDetails(cust_type, cust_id, fname, lname, billingAddr, connAddr, email, contact, outFormat.format(dob));
		
		Quantity qty = new Quantity(1,1);		
		Services services = new Services("b2003","pi_vi_250_250_225",qty);
		
		ContractDetails contractdetails = new ContractDetails("", "", "", "", "", 0, "null");		
		OrderDetails orderdetails = new OrderDetails(outFormat.format(date), outFormat.format(date), services);
		System.out.println(outFormat.format(date));
		// convert java object to JSON format,
		// and return as JSON formatted string
		OrderingJSON orderJson = new OrderingJSON(customerdetails, orderdetails, contractdetails);
		String json = gson.toJson(orderJson);		
		
		System.out.println(json);
		RESTClient client = new RESTClient();	
		
		client.insert(json);		
		
		//TODO Redirect to order summary page.
		 RequestDispatcher rd = request.getRequestDispatcher("order_summary.jsp");
		 rd.forward(request, response);
	}		
}