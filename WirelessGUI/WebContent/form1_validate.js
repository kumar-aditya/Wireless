function validate() {
	
	var cust_id=document.registration.cust_id;
	var cust_type=document.registration.cust_type;
	
	var firstname=document.registration.firstname;
	var lastname=document.registration.lastname;
	var streetname=document.registration.streetname;
	var zipcode=document.registration.zipcode;
	var city=document.registration.city;
	var state=document.registration.state;
	
	
	var email=document.registration.email;
	var dob=document.registration.dob;
	var ssn=document.registration.ssn;
	var plan=document.registration.plan;
	var order_type=document.registration.order_type;
	var contact_number=document.registration.contact_number;
	var number= /^[0-9]+$/;
	var letters = /^[a-zA-Z]*$/;
	
		
    if (firstname.value == 0) 
    {
    	window.alert("Please enter your First name.");
        firstname.focus();
        return false;
    }
  if (!firstname.value.match(letters)) 
    {
    	window.alert("Please enter valid First name.");
        firstname.focus();
        return false;
    }
        
    if (lastname.value== 0) 
    {
    	window.alert("Please enter your Last name.");
        lastname.focus();
        return false;
    }
 if (!lastname.value.match(letters)) 
    {
    	window.alert("Please enter valid Last name.");
        lastname.focus();
        return false;
    }
 else if (dob.value == 0) 
 {
 	window.alert("Please enter your Date of Birth.");
     dob.focus();
     return false;
 }
 else if (email.value == 0) 
 {
 	window.alert("Please enter your email.");
     email.focus();
     return false;
 }
 if (email.value.indexOf("@", 0) < 0)
 {
     window.alert("Please enter a valid e-mail address.");
     email.focus();
     return false;
     
 }
 if (email.value.indexOf(".", 0) < 0)
 {
     window.alert("Please enter a valid e-mail address.");
     email.focus();
     return false;
     
 }
 
 else if (contact_number.value == 0) 
 {
 	window.alert("Please enter your Contact number.");
 	contact_number.focus();
     return false;
 }
 else if(!contact_number.value.match(number))
 	{
 	window.alert("Please enter Valid Contact number.");
 	contact_number.focus();
     return false;
 	}
 else if(contact_number.value.length!=10)
	{
	window.alert("Please enter 10 digit Contact number.");
	contact_number.focus();
 return false;
	}
 
    else if (streetname.value == 0) 
    {
    	window.alert("Please enter your Street name.");
        streetname.focus();
        return false;
    }
    else if (city.value == 0) 
    {
    	window.alert("Please enter your City.");
        city.focus();
        return false;
    }
    else if (state.value == 0) 
    {
    	window.alert("Please enter your State.");
        state.focus();
        return false;
    }
    else if (zipcode.value == 0) 
    {
    	window.alert("Please enter your Zipcode.");
        zipcode.focus();
        return false;
    }
    else if(!zipcode.value.match(number))
    	{
    	window.alert("Please enter Valid  Zipcode.");
        zipcode.focus();
        return false;
    	}
    else if(zipcode.value.length!=6)
	{
	window.alert("Please enter 6 digit Zipcode number.");
	zipcode.focus();
    return false;
	}
     
 
  
   
    else if (ssn.value == 0)
    {
    	window.alert("Please enter your SSN.");
        ssn.focus();
        return false;
    }
    else if(!ssn.value.match(number))
	{
	window.alert("Please enter Valid SSN number.");
    ssn.focus();
    return false;
	}
    
    else if(ssn.value.length!=9)   
	{
	window.alert("Please enter 9 digit SSN number.");
    ssn.focus();
    return false;
	}
    
    else {
 
        document.location.href="new_cust_ssn?ssn="+ssn.value+"&&firstname="+firstname.value+"&&lastname="+lastname.value+
                                "&&streetname="+streetname.value+"&&zipcode="+zipcode.value+"&&city="+city.value+"&&state="+state.value+
                                "&&country=United States Of America &&email="+email.value+"&&dob="+dob.value+"&&ssn="+ssn.value+
                                "&&plan="+plan.value+"&&order_type="+order_type.value+"&&contact_number="+contact_number.value+
                                "&&cust_id="+cust_id.value+"&&cust_type="+cust_type.value; 
//alert("SUCCESS")
    }
}