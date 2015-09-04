/*function purchase()
 {
 location.href="checkplan";
 }
 */

// PLAN WITH EQUIPMENT
function withequip(value, order_name) {
	// document.getElementById("framework").innerHTML="reached here";
	// document.getElementById("framework").innerHTML=document.getElementById("step-1").innerHTML;

	// var value="<%= session[\"location\"].ToString() %>";
	console.log(value);
	console.log(order_name);
	var plan_type;
	// get the form data and then serialize that
	dataString = $("#someform").serialize();
var ordername=order_name+"&d=data";
	// get the form data using another method

	// make the AJAX request, dataType is set to json
	// meaning we are expecting JSON data in response from the server

	dataString="&pService="+ordername;
	console.log(dataString);
	//dataString = value;
	$
			.ajax({
				type : "POST",
				url : "pcatServlet_bundle",
				data : dataString,
				dataType : "json",

				
				// if received a response from the server
				success : function(data, textStatus, jqXHR) {

					
					if(data != "")
				{
						
					str = JSON.stringify(data);
					
					var jsonObj = JSON.parse(str);
					//alert ( jsonObj.Product_Details[0].Product_ID.value)
					var jsonObj1 = jsonObj.Bundle_Details;
					// alert(jsonObj1[0].product_name);
					var i = 0;
					document.getElementById("framework").innerHTML = "";
					for (i = 0; i < jsonObj1.length; i++) {
						
						var newbt = document.createElement("input");
						newbt.setAttribute("id", jsonObj1[i].Bundle_Id.value);
						newbt.setAttribute("name", jsonObj1[i].Bundle_Desc.value);
						newbt.setAttribute("type", "image");
						newbt.setAttribute("src", "img/"+jsonObj1[i].Bundle_Id.value+".png");
						newbt.setAttribute("width", "250px");
						newbt.setAttribute("height", "500px");
						newbt.setAttribute("padding","105px");
						var bt_text = document
								.createTextNode(jsonObj1[i].Bundle_Desc.value);
						newbt.appendChild(bt_text);
						document.getElementById("framework").appendChild(newbt);

					}

					$(document.body)
							.on(
									'click',
									'input',
									function() {
										console.log(this.id);
										plan_type = this.id;
										str = JSON.stringify(data);
										var jsonObj = JSON.parse(str);
										var jsonObj1 =jsonObj.Bundle_Details;
										// alert ('button ' + this.id + '
										// clicked');
										var i = 0;
										for (i = 0; i < jsonObj1.length; i++) {
											// $("p").remove();
											if (this.name == jsonObj1[i].Bundle_Desc.value) {
												console.log("aa" + this.id);
												pur = "purchase(" + order_name
														+ "," + plan_type
														+ ");";
												console.log(pur);
												document
														.getElementById("framework").innerHTML = "<div class=\"wrapper\" margin:left=\"100px\">PRODUCT NAME : "
														+ jsonObj1[i].Bundle_Id.value
														+ "<br>"
														+ "DEVICE : "
														+ jsonObj1[i].Bundle_Desc.value
														+ "<br>"
														+ "COST : "
														+ jsonObj1[i].Bundle_Cost.value
														+ "<br/>"
														+ "<input type=\"image\"id=\"purch\"src=\"img\/purchase.png\" width=\"250px\" height=\"100px\">";

												document
														.getElementById("purch").onclick = function() {
													location.href = "cust_reg_form.jsp?order_name="
															+ order_name
															+ "&plan_type="
															+ plan_type;
												};

											}
										}

									});
				}
					else
						{
						document.getElementById("framework").innerHTML="Product Service is not working as expected";
						}

				},

				// If there was no resonse from the server
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("Something really bad happened " + textStatus);
					
					$("#framework").html(jqXHR.responseText);
				},

				// capture the request before it was sent to server
				beforeSend : function(jqXHR, settings) {
					// adding some Dummy data to the request
					// settings.data += "&dummyData=whatever";
					// disable the button until we get the response
					$('#plan_equip').attr("disabled", true);
				},

				// this is called after the response or error functions are
				// finsihed
				// so that we can take some action
				complete : function(jqXHR, textStatus) {
					// enable the button
					$('#plan_equip').attr("disabled", false);
				}

			});
}


//INDIVIDUAL PLAN
function individual_plan(value, order_name) {
	// document.getElementById("framework").innerHTML="reached here";
	// document.getElementById("framework").innerHTML=document.getElementById("step-1").innerHTML;

	// var value="<%= session[\"location\"].ToString() %>";
	console.log(value);
	console.log(order_name);
	var plan_type;
	// get the form data and then serialize that
	dataString = $("#someform").serialize();


	
	// get the form data using another method

	// make the AJAX request, dataType is set to json
	// meaning we are expecting JSON data in response from the server

	dataString="&pService="+order_name;
	console.log(dataString);
	
	//dataString = value;
	$
			.ajax({
				type : "POST",
				url : "pcatServlet",
				data : dataString,
				dataType : "json",

				
				// if received a response from the server
				success : function(data, textStatus, jqXHR) {

					// if(data.success){
					/*
					 * $("#myDiv").html(""); console.log( data ); str =
					 * JSON.stringify(data);
					 * 
					 * $("#myDiv").append(str); var obj=JSON.parse(str);
					 * $("#myDiv").append(obj.name);
					 */
					// }
					// display error message
					/*
					 * else { $("#ajaxResponse").html("<div><b>Data Receiving
					 * Error</b></div>"); }
					 */

					// document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
					// document.getElementById("myDiv").innerHTML="In ajax";
					if(data != "")
				{
						
					str = JSON.stringify(data);
					
					var jsonObj = JSON.parse(str);
					//alert ( jsonObj.Product_Details[0].Product_ID.value)
					var jsonObj1 = jsonObj.Product_Details;
					// alert(jsonObj1[0].product_name);
					var i = 0;
					document.getElementById("framework").innerHTML = "";
					for (i = 0; i < jsonObj1.length; i++) {
						
						var newbt = document.createElement("input");
						newbt.setAttribute("id", jsonObj1[i].Product_ID.value);
						newbt.setAttribute("name", jsonObj1[i].Product_Name.value);
						newbt.setAttribute("type", "image");
						newbt.setAttribute("src", "img/"+jsonObj1[i].Product_ID.value+"unclicked.png");

						var bt_text = document
								.createTextNode(jsonObj1[i].Product_Name.value);
						newbt.appendChild(bt_text);
						document.getElementById("framework").appendChild(newbt);

					}

					$(document.body)
							.on(
									'click',
									'input',
									function() {
										console.log(this.id);
										plan_type = this.id;
										str = JSON.stringify(data);
										var jsonObj = JSON.parse(str);
										var jsonObj1 =jsonObj.Product_Details;
										// alert ('button ' + this.id + '
										// clicked');
										var i = 0;
										for (i = 0; i < jsonObj1.length; i++) {
											// $("p").remove();
											if (this.name == jsonObj1[i].Product_Name.value) {
												console.log("aa" + this.id);
												pur = "purchase(" + order_name
														+ "," + plan_type
														+ ");";
												console.log(pur);
												document
														.getElementById("framework").innerHTML = "<div class=\"wrapper\" margin:left=\"100px\">PRODUCT NAME : "
														+ jsonObj1[i].Product_ID.value
														+ "<br>"
														+ "DEVICE : "
														+ jsonObj1[i].Product_Description.value
														+ "<br>"
														+ "COST : "
														+ jsonObj1[i].Cost.value
														+ "<br/>"
														+ "<input type=\"image\"id=\"purch\"src=\"img\/purchase.png\">";

												document
														.getElementById("purch").onclick = function() {
													location.href = "cust_reg_form.jsp?order_name="
															+ order_name
															+ "&plan_type="
															+ plan_type;
												};

											}
										}

									});
				}
					else
						{
						document.getElementById("framework").innerHTML="Product Service is not working as expected";
						}

				},

				// If there was no resonse from the server
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("Something really bad happened " + textStatus);
					
					$("#framework").html(jqXHR.responseText);
				},

				// capture the request before it was sent to server
				beforeSend : function(jqXHR, settings) {
					// adding some Dummy data to the request
					// settings.data += "&dummyData=whatever";
					// disable the button until we get the response
					$('#plan_equip').attr("disabled", true);
				},

				// this is called after the response or error functions are
				// finsihed
				// so that we can take some action
				complete : function(jqXHR, textStatus) {
					// enable the button
					$('#plan_equip').attr("disabled", false);
				}

			});
}


//Group PLAN
function group_plan(value, order_name) {
	// document.getElementById("framework").innerHTML="reached here";
	// document.getElementById("framework").innerHTML=document.getElementById("step-1").innerHTML;

	// var value="<%= session[\"location\"].ToString() %>";
	console.log(value);
	console.log(order_name);
	var plan_type;
	// get the form data and then serialize that
	dataString = $("#someform").serialize();

	// get the form data using another method

	// make the AJAX request, dataType is set to json
	// meaning we are expecting JSON data in response from the server

	dataString="&pService="+order_name;
	
	//dataString = value;
	$
			.ajax({
				type : "POST",
				url : "pcatServlet",
				data : dataString,
				dataType : "json",

				
				// if received a response from the server
				success : function(data, textStatus, jqXHR) {

					// if(data.success){
					/*
					 * $("#myDiv").html(""); console.log( data ); str =
					 * JSON.stringify(data);
					 * 
					 * $("#myDiv").append(str); var obj=JSON.parse(str);
					 * $("#myDiv").append(obj.name);
					 */
					// }
					// display error message
					/*
					 * else { $("#ajaxResponse").html("<div><b>Data Receiving
					 * Error</b></div>"); }
					 */

					// document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
					// document.getElementById("myDiv").innerHTML="In ajax";
					if(data != "")
				{
						
					str = JSON.stringify(data);
					
					var jsonObj = JSON.parse(str);
					//alert ( jsonObj.Product_Details[0].Product_ID.value)
					var jsonObj1 = jsonObj.Product_Details;
					// alert(jsonObj1[0].product_name);
					var i = 0;
					document.getElementById("framework").innerHTML = "";
					for (i = 0; i < jsonObj1.length; i++) {
						
						var newbt = document.createElement("input");
						newbt.setAttribute("id", jsonObj1[i].Product_ID.value);
						newbt.setAttribute("name", jsonObj1[i].Product_Name.value);
						newbt.setAttribute("type", "image");
						newbt.setAttribute("src", "img/"+jsonObj1[i].Product_ID.value+"unclicked.png");

						var bt_text = document
								.createTextNode(jsonObj1[i].Product_Name.value);
						newbt.appendChild(bt_text);
						document.getElementById("framework").appendChild(newbt);

					}

					$(document.body)
							.on(
									'click',
									'input',
									function() {
										console.log(this.id);
										plan_type = this.id;
										str = JSON.stringify(data);
										var jsonObj = JSON.parse(str);
										var jsonObj1 =jsonObj.Product_Details;
										// alert ('button ' + this.id + '
										// clicked');
										var i = 0;
										for (i = 0; i < jsonObj1.length; i++) {
											// $("p").remove();
											if (this.name == jsonObj1[i].Product_Name.value) {
												console.log("aa" + this.id);
												pur = "purchase(" + order_name
														+ "," + plan_type
														+ ");";
												console.log(pur);
												document
														.getElementById("framework").innerHTML = "<div class=\"wrapper\" margin:left=\"100px\">PRODUCT NAME : "
														+ jsonObj1[i].Product_ID.value
														+ "<br>"
														+ "DEVICE : "
														+ jsonObj1[i].Product_Description.value
														+ "<br>"
														+ "COST : "
														+ jsonObj1[i].Cost.value
														+ "<br/>"
														+ "<input type=\"image\"id=\"purch\"src=\"img\/purchase.png\">";

												document
														.getElementById("purch").onclick = function() {
													location.href = "cust_reg_form.jsp?order_name="
															+ order_name
															+ "&plan_type="
															+ plan_type;
												};

											}
										}

									});
				}
					else
						{
						document.getElementById("framework").innerHTML="Product Service is not working as expected";
						}

				},

				// If there was no resonse from the server
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("Something really bad happened " + textStatus);
					
					$("#framework").html(jqXHR.responseText);
				},

				// capture the request before it was sent to server
				beforeSend : function(jqXHR, settings) {
					// adding some Dummy data to the request
					// settings.data += "&dummyData=whatever";
					// disable the button until we get the response
					$('#plan_equip').attr("disabled", true);
				},

				// this is called after the response or error functions are
				// finsihed
				// so that we can take some action
				complete : function(jqXHR, textStatus) {
					// enable the button
					$('#plan_equip').attr("disabled", false);
				}

			});
}


