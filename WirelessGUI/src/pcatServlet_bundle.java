

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class pcatServlet_bundle
 */
@WebServlet("/pcatServlet_bundle")
public class pcatServlet_bundle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pcatServlet_bundle() {
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
		
		//String st = request.getParameter("pstate");
				String service = request.getParameter("pService");
				String dat = request.getParameter("d");
				//String str = st+"&" +service;
				String str; 
				String loc;

		    	HttpSession sess = request.getSession();
		    	loc = (String)sess.getAttribute("location");
		    	//str = loc + "&" + "data" ;
				
		    	str=loc + "&" +service + "&" + dat;
		    
		    	System.out.println("data "+ str);
				
				// /location/data
				String pList = "";
			    RestClientPcat rs=new RestClientPcat();
			   
			    System.out.println( "pList "+ pList);
			    PrintWriter out=null;
				try {
					out = response.getWriter();
					   pList = rs.callPCatURL(str);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			    out.println( pList );
			    out.flush();
		
	}

}
