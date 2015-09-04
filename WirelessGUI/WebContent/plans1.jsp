<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/jquery-1.9.1.js" type="text/javascript"></script>
<script type="text/javascript">

$(document).ready(function() {
	 
    //Stops the submit request
    $("#someform").submit(function(e){
           e.preventDefault();
    });
    
    //checks for the button click event
    $("#mySubmit").click(function(e){
           
    	 	 // $("#myDiv").append("asdfsadaasafsd");
            //get the form data and then serialize that
            dataString = $("#someform").serialize();
          
            //get the form data using another method
            var test_text = $("input#try").val();
            //dataString = "trya=" + test_text;
            dataString=test_text;
         //   $("#myDiv").append(test_text);
            //make the AJAX request, dataType is set to json
            //meaning we are expecting JSON data in response from the server
            $.ajax({
                type: "POST",
                url: "http://localhost:8080/SimpleRESTBasedCommunication/rest/server/postcheck",
                data: dataString,
                dataType: "json",
                
                //if received a response from the server
                success: function( data, textStatus, jqXHR) {
                    //our country code was correct so we have some information to display
                     //if(data.success){
                   /*  $("#myDiv").html("");
                     console.log( data );
                     str = JSON.stringify(data);
                     
                     $("#myDiv").append(str);
                     var obj=JSON.parse(str);
                     $("#myDiv").append(obj.name);
                 */    
                     //}
                     //display error message
                    /* else {
                         $("#ajaxResponse").html("<div><b>Data Receiving Error</b></div>");
                     }*/
                     
                     
                 	//document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
						//document.getElementById("myDiv").innerHTML="In ajax";
						 str = JSON.stringify(data);
						 
						var jsonObj = JSON.parse(str);
						var jsonObj1 = jsonObj.products;
						//alert(jsonObj1[0].product_name);
						var i = 0;
						for (i = 0; i < jsonObj1.length; i++) {
							//alert(jsonObj1[i].product_name);

							var newbt = document
									.createElement("button");
							newbt.setAttribute("id",
									jsonObj1[i].product_name);
							newbt.setAttribute("name",
									jsonObj1[i].product_name);
							newbt.setAttribute("type","button");
							var bt_text = document
									.createTextNode(jsonObj1[i].product_name);
							newbt.appendChild(bt_text);
							document.getElementById("myDiv")
									.appendChild(newbt);

							//document.getElementById("myDiv").innerHTML="<input type='button' value="+jsonObj1[i].product_name+">";
							// document.getElementById("myDiv").innerHTML=jsonObj1[i].product_name;
						}
                     
						
						$(document.body).on(
								'click',
								'button',
								function() {
									 str = JSON.stringify(data);
									var jsonObj = JSON.parse(str);
									var jsonObj1 = jsonObj.products;
									//alert ('button ' + this.id + ' clicked');
									var i=0;
									for(i=0;i<jsonObj1.length;i++)
										{
										//$("p").remove();
										  if(this.name==jsonObj1[i].product_name)
										{
											  
											  document.getElementById("Divdetails").innerHTML="PRODUCT NAME : "+jsonObj1[i].product_name+"<br>"+"DEVICE : "+jsonObj1[i].product_desc+"<br>"+"COST : "+jsonObj1[i].rate_value;
												/*var pa= document.createElement("p");
											 	var pa_text = document.createTextNode("uuu"+jsonObj1[i].product_name);
												pa.appendChild(pa_text);
												document.getElementById("Divdetails")
												.appendChild(pa);
												

												pa= document.createElement("p");
											 	pa_text = document.createTextNode(jsonObj1[i].device);
												pa.appendChild(pa_text);
												document.getElementById("Divdetails")
												.appendChild(pa);
												

												pa= document.createElement("p");
											 	pa_text = document.createTextNode(jsonObj1[i].details);
												pa.appendChild(pa_text);
												document.getElementById("Divdetails")
												.appendChild(pa);

												pa= document.createElement("p");
											 	pa_text = document.createTextNode(jsonObj1[i].cost);
												pa.appendChild(pa_text);
												document.getElementById("Divdetails")
												.appendChild(pa);*/
										}
										}
									//var newpara = document.createElement("p");
									 //alert("Enter");
									//var paratxt = document
									//		.createTextNode("Hello");

									//newpara.appendChild(paratxt);
								//	document.getElementById("Divdetails")
										//	.appendChild(newpara);

									//location.href="details.jsp";
									//$("#txtpara").text("Hello");
								});
                     
                },
                
                //If there was no resonse from the server
                error: function(jqXHR, textStatus, errorThrown){
                     console.log("Something really bad happened " + textStatus);
                      $("#Divdetails").html(jqXHR.responseText);
                },
                
                //capture the request before it was sent to server
                beforeSend: function(jqXHR, settings){
                    //adding some Dummy data to the request
                    //settings.data += "&dummyData=whatever";
                    //disable the button until we get the response
                    $('#mySubmit').attr("disabled", true);
                },
                
                //this is called after the response or error functions are finsihed
                //so that we can take some action
                complete: function(jqXHR, textStatus){
                    //enable the button
                    $('#mySubmit').attr("disabled", false);
                }
      
            });       
    });
 
});


</script>
</head>
<body>
	In here
	<form action="" id="someform" name="someform">
		<input type="text" name="try" id="try" />
		<input type="button" value="Send" id="mySubmit">
	</form>
	<div id="myDiv"></div>		
	<div id="Divdetails"></div>

</body>
</html>