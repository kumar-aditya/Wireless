<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Creative - Bootstrap 3 Responsive Admin Template">
<meta name="author" content="GeeksLabs">
<meta name="keyword"
	content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
<link rel="shortcut icon" href="img/favicon.png">

<title>Order Confirmation</title>

<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap theme -->
<link href="css/bootstrap-theme.css" rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link href="css/elegant-icons-style.css" rel="stylesheet" />
<link href="css/font-awesome.min.css" rel="stylesheet" />
<!-- Custom styles -->
<link href="css/style.css" rel="stylesheet">
<link href="css/style-responsive.css" rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
</head>

<body>
	<!-- container section start -->
	<section id="container" class="">
		<!--header start-->

		<header class="header dark-bg">
			<div class="toggle-nav">
				<div class="icon-reorder tooltips"
					data-original-title="Toggle Navigation" data-placement="bottom"></div>
			</div>

			<!--logo start-->
			<a href="index.jsp" class="logo"> <span class="lite"><img
					alt="" src="img/t15.jpg"></span></a>
			<!--logo end-->
			<div class="top-nav notification-row">
				<!-- user login dropdown start-->
				<li class="dropdown"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#"> <span class="profile-ava">
							<img alt="" src="img/avatar1_small.jpg">
					</span> <span class="username"><% String firstName= session.getAttribute("rep_username").toString();
     out.println(firstName);%></span> <b class="caret"></b>
				</a>
					<ul class="dropdown-menu extended logout">
						<div class="log-arrow-up"></div>
						<li class="eborder-top"><a href="#"><i
								class="icon_profile"></i> My Profile</a></li>
						<li><a href="login.html"><i class="icon_key_alt"></i> Log
								Out</a></li>
					</ul></li>
				<!-- user login dropdown end -->
				</ul>
				<!-- notificatoin dropdown end-->
			</div>
		</header>
		<!--header end-->
		<!--main content start-->
		<section class="wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h3 class="page-header">
						<i class="fa fa fa-bars"></i> Order Confirmation
					</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.jsp">Home</a></li>
						<li><i class="fa fa-square-o"></i>Order Confirmation</li>
					</ol>
				</div>
			</div>
			<!-- page start-->
			<form class="form-validate form-horizontal " id="register_form"
				method="get" action="RegistrationServlet">
				
				<div class="form-group ">
									<%String cust_type=(String)request.getAttribute("cust_type");System.out.println(cust_type);System.out.println(cust_type);
									if(cust_type.equals("new")){%><div class="col-lg-10"><input hidden name="cust_id" value=<%= request.getAttribute("cust_id")%>> </div>
									<%} if(cust_type.equals("old")){ System.out.println("i am inside old if");%>
									<label for="cust_id" class="control-label col-lg-2">Customer ID </label>
									<label><div class="col-lg-10">
									<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" name="cust_id" id="cust_id"><%= request.getAttribute("cust_id")%></textarea>
									</div></label>
									<%}%>
				</div>
				<div class="form-group ">
					<label for="ordertype" class="control-label col-lg-2">Order
						Type </label> <label><div class="col-lg-10"><input hidden name="cust_type" value=<%= request.getAttribute("cust_type")%>>
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="order_type" name="order_type" ><%=request.getAttribute("order_type") %></textarea>
										</div></label>
				</div>
				<div class="form-group ">
					<label for="plan" class="control-label col-lg-2">Plan Name
					</label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="plan" name="plan" ><%=request.getAttribute("plan") %></textarea>
										</div></label>
				</div>
				<div class="form-group ">
					<label for="firstname" class="control-label col-lg-2">First
						name </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="firstname" name="firstname" ><%=request.getAttribute("firstname") %></textarea>
										</div><label>
				</div>
				<div class="form-group ">
					<label for="lastname" class="control-label col-lg-2">Last
						name </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="lastname" name="lastname" ><%=request.getAttribute("lastname") %></textarea>
										</div><label></label></label>
				</div>
				<div class="form-group ">
					<label for="dob" class="control-label col-lg-2">Date Of
						Birth </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="dob" name="dob" ><%=request.getAttribute("dob") %></textarea>
										</div></label>
				</div>
				
				<div class="form-group ">
					<label for="email" class="control-label col-lg-2">Email ID
					</label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="email" name="email" ><%=request.getAttribute("email") %></textarea>	
										</div></label>
				</div>
				<div class="form-group ">
					<label for="contact_number" class="control-label col-lg-2">Contact Number
					</label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="contact_number" name="contact_number" ><%=request.getAttribute("contact_number") %></textarea>	
										</div></label>
				</div> 
				
				
				
						
				<div class="form-group ">
					<label for="streetname" class="control-label col-lg-2">Street
						Name </label> <label><div class="col-lg-10">
											  <textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="streetname" name="streetname" ><%=request.getAttribute("streetname") %></textarea>	
										</div></label>
				</div>
				<div class="form-group ">
					<label for="city" class="control-label col-lg-2">City </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="city" name="city" ><%=request.getAttribute("city") %></textarea>	
										</div></label>
				</div>
				<div class="form-group ">
					<label for="state" class="control-label col-lg-2">State </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="state" name="state" ><%=request.getAttribute("state") %></textarea>	
										</div></label>
				</div>
				<div class="form-group ">
					<label for="zipcode" class="control-label col-lg-2">Zip
						Code </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="zipcode" name="zipcode" ><%=request.getAttribute("zipcode") %></textarea>	
										</div></label>
				</div>
				
				<div class="form-group ">
					<label for="country" class="control-label col-lg-2">Country </label> <label><div class="col-lg-10">
											<textarea readonly style="overflow:hidden;resize:none" class=" form-control" rows="1" cols="100" id="country" name="country" ><%=request.getAttribute("country") %></textarea>	
										</div></label>
				</div>
				
				<div class="form-group">
					<div align="right"><button type="submit"value="checkout">
						<a href="check_form_json"><img src="img/checkout.png"
							onmouseover="this.src='img/checkout.png'"
							onmouseout="this.src='img/checkoutunclicked.png'" width="200px"
							height="50px" /></a>
					</div>
				</div>
			</form>

			<!-- page end-->
		</section>
		<!--main content end-->
	</section>
	<!-- container section end -->
	<!-- javascripts -->
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- nice scroll -->
	<script src="js/jquery.scrollTo.min.js"></script>
	<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
	<!--custome script for all page-->
	<script src="js/scripts.js"></script>


</body>
</html>
