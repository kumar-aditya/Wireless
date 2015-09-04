$(document).ready(function(){

//get the form data and then serialize that
//dataString = $("#someform").serialize();

//get the form data using another method
dataString = $("#someform").serialize();
	
//make the AJAX request, dataType is set to json
//meaning we are expecting JSON data in response from the server

dataString="test";

$.ajax({
    type: "POST",
    url: "ProfileServlet",
    data: dataString,
    dataType: "json",
    
    //if received a response from the server
    success: function( data, textStatus, jqXHR) {    	
    	str = JSON.stringify(data);    	
		var jsonObj = JSON.parse(str);
		var jsonObj1 = jsonObj.customerdetails;
		var jsonObj2 = jsonObj1.connectionaddress;
		document.getElementById("cust_id").value = (jsonObj1.customerid);
		
		document.getElementById("firstname").value = (jsonObj1.fname);
		document.getElementById("lastname").value = (jsonObj1.lname);
		document.getElementById("email").value = (jsonObj1.email);
		
		document.getElementById("streetname").value = (jsonObj2.streetname);
		document.getElementById("zipcode").value = (jsonObj2.zipcode);
		document.getElementById("city").value = (jsonObj2.city);
		document.getElementById("state").value = (jsonObj2.state);
		
		document.getElementById("contact_number").value = (jsonObj1.contactnumber);
		document.getElementById("dob").value = (jsonObj1.dateofbirth);
		//document.getElementById("firstname").value = reuqest.getParameter("order_name");
		//document.getElementById("firstname").value = reuqest.getParameter("plan_type");
    },
    
    //If there was no response from the server
    error: function(jqXHR, textStatus, errorThrown){
         console.log("Something really bad happened " + textStatus);
          $("#Divdetails").html(jqXHR.responseText);
          console.log(errorThrown);
    },
    
    //capture the request before it was sent to server
    beforeSend: function(jqXHR, settings){
        //adding some Dummy data to the request
        //settings.data += "&dummyData=whatever";
        //disable the button until we get the response
        $('#mySubmit').attr("disabled", true);
    },
    
    //this is called after the response or error functions are finished
    //so that we can take some action
    complete: function(jqXHR, textStatus){
        //enable the button
        $('#mySubmit').attr("disabled", false);
    }
});
});