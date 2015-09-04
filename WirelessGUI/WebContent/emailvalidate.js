function emailvalidate(){
	var mail=document.validatecustomer.mail;
	var location=document.validatecustomer.location;
	
	if (mail.value == 0) 
    {
    	window.alert("Please enter your email.");
    	return false;
    }
	else if (mail.value.indexOf("@", 0) < 0)
    {
        window.alert("Please enter a valid e-mail address.");
    	return false;

    }
	else if (mail.value.indexOf(".", 0) < 0)
    {
        window.alert("Please enter a valid e-mail address.");
    	return false;

    }
    else if(location.value=="--select--"){
    	window.alert("please select the location");
    	return false;

    }
    else{
  //alert("inside email else validate");
	//document.location.href="CustomerLogEmail";
    	 document.location.href="CustomerLogEmail?mail="+mail.value+"&&location="+location.value;
    }
}