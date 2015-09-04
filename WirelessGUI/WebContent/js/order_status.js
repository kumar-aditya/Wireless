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
		var jsonObj2 = jsonObj.orderhistory;
		document.getElementById("custid").value = (jsonObj1.customerid);
		document.getElementById("firstname").value = (jsonObj1.fname);
		document.getElementById("lastname").value = (jsonObj1.lname);
		document.getElementById("orderno").value = (jsonObj2[0].orderid);
		document.getElementById("orderdate").value = (jsonObj2[0].dateoforder);
		document.getElementById("status").value = (jsonObj2[0].orderstatus);
		document.getElementById("duedate").value = (jsonObj2[0].duedate);
		document.getElementById("plan").value = (jsonObj2[0].services[0].servicename);
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