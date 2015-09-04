import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.json.*;
 
public class RESTClient {

	//TODO change URL to server IP Address 
    private static final String insertURL = "http://192.168.1.19:8080/OrderManagement/rest/om/submitorder";
    private static final String checkURL = " http://192.168.1.19:8080/OrderManagement/rest/om/profilePull/email/";
    public void insert(String input) {
        try {
            URL insertUrl = new URL(insertURL);           
            HttpURLConnection httpConnection = (HttpURLConnection) insertUrl.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");                
            OutputStream outputStream = httpConnection.getOutputStream();
            outputStream.write(input.getBytes());
            outputStream.flush();
            
            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                    + httpConnection.getResponseCode());
            }

            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                    (httpConnection.getInputStream())));
            String output;
            System.out.println("Output from Server:\n");
            while ((output = responseBuffer.readLine()) != null) {
                System.out.println(output);
            }
            httpConnection.disconnect();
          } catch (MalformedURLException e) {
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
         }
        }
    
    public String check(String input){
    	String output = "";
    	String profileResponse = "";
    	try {
    		 String url = checkURL + input;
    		 URL checkUrl = new URL(url);
    		 System.out.println(checkUrl);
    		 HttpURLConnection httpConnection = (HttpURLConnection) checkUrl.openConnection();
             httpConnection.setDoOutput(true);
             System.out.println("Inside GET");
             httpConnection.setRequestMethod("GET");
             System.out.println("GET Completed "+httpConnection.getRequestMethod());
             httpConnection.setRequestProperty("Content-Type", "application/json");  
             
            /* OutputStream outputStream = httpConnection.getOutputStream();
             outputStream.write(input.getBytes());
             outputStream.flush();           */  
             
             if (httpConnection.getResponseCode() != 200) {
                 throw new RuntimeException("Failed : HTTP error code : "
                     + httpConnection.getResponseCode());
             }

             BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(
                     (httpConnection.getInputStream()))); 
             
             System.out.println("Output from Server:\n");
             while ((output = responseBuffer.readLine()) != null) {
                 System.out.println(output);
                 profileResponse = profileResponse + output;
             }
             /*CustomerDetails cust = gson.fromJson(output, CustomerDetails.class);
             System.out.println(cust.toString());*/
             httpConnection.disconnect();
           } catch (MalformedURLException e) {
             e.printStackTrace();
           } catch (IOException e) {
             e.printStackTrace();
    	}
		return profileResponse;    	 
    }
}