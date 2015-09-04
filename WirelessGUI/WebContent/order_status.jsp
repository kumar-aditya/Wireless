<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Order Status</title>

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
      <script src="js/jquery-1.9.1.js"></script>
      <script src="js/order_status.js"></script>
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
      <!--header start-->
      
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
            </div>

            <!--logo start-->
            <a href="index.html" class="logo"> <span class="lite"><img alt="" src="img/t15.png"></span></a>
            <!--logo end-->
            		   <div class="top-nav notification-row">
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
                            <span class="username"><% String firstName= session.getAttribute("rep_username").toString();
     out.println(firstName);%></span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="profile.html"><i class="icon_profile"></i> My Profile</a>
                            </li>
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->
      <!--main content start-->
          <section class="wrapper"><br>
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa fa-bars"></i> Order Status</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.jsp">Home</a></li>
						<li><i class="fa fa-square-o"></i>Order Status</li>
					</ol>
				</div>
			</div>
              <!-- page start-->
          
              <form class="form-validate form-horizontal "  id="register_form" method="" action="order_type.jsp">
              	<div class="form-group">
              		<label for="custid" class="control-label col-lg-2">Customer ID </label>
              		<input type="text" id="custid" readonly>
              	</div>
              	<div class="form-group ">
              		<label for="firstname" class="control-label col-lg-2">First name </label>
              		              		<input type="text" id="firstname" readonly>
              		
              	</div>
              	<div class="form-group ">
              		<label for="lastname" class="control-label col-lg-2">Last name </label>
              		              		<input type="text" id="lastname" readonly>
              		
              	</div>
              	<div class="form-group ">
              		<label for="plan" class="control-label col-lg-2">Plan Name </label>
              		              		<input type="text" id="plan" readonly>
              		
              	</div> 
              	<div class="form-group ">
              		<label for="orderno" class="control-label col-lg-2">Order Number </label>
              		              		<input type="text" id="orderno" readonly>
              		
              	</div>
              	<div class="form-group ">
              		<label for="orderdate" class="control-label col-lg-2">Order Date </label>
              		              		<input type="text" id="orderdate" readonly>
              		
              	</div>              
              	<div class="form-group ">
              		<label for="duedate" class="control-label col-lg-2">Due Date </label>
              		              		<input type="text" id="duedate" readonly>
              		
              	</div>              	
              	<div class="form-group ">
              		<label for="status" class="control-label col-lg-2">Status </label>
              		              		<input type="text" id="status" readonly>
              		
              	</div>
              	<div class="form-group">
                	<div align="center">                                             
                    	<button type="submit" class="btn btn-primary">BACK</button>
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
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script><!--custome script for all page-->
    <script src="js/scripts.js"></script>


  </body>
</html>
