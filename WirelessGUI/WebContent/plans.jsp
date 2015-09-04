<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Twenty Fifteen">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Plan</title>

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
    <style>
    span.tab{
    padding: 0 6%; /* Or desired space*/
}
</style>
 <script src="js/pcatjson.js"></script>
    <script type="text/javascript">

    

   
    
  /* function step1()
   {
   document.getElementById("framework").innerHTML="";
   document.getElementById("framework").innerHTML=document.getElementById("step-1").innerHTML;
   }
   function step2()
   {
    document.getElementById("framework").innerHTML="";
   document.getElementById("framework").innerHTML=document.getElementById("step-2").innerHTML;
   }
   function step3()
   {
    document.getElementById("framework").innerHTML="";
   document.getElementById("framework").innerHTML=document.getElementById("step-3").innerHTML;
   }*/
    
</script>
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
            <a href="index.jsp" class="logo"> <span class="lite"><img alt="" src="img/t15.png"></span></a>
            <!--logo end-->
       <div class="top-nav notification-row">             
                    <!-- user login dropdown start-->
                    <br><li class="dropdown">
                    
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
                             <span class="username"><% String firstName= session.getAttribute("rep_username").toString();
     out.println(firstName);%></span> <b class="caret"></b>
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
          <section class="wrapper">
		  <div class="row"><br>
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa fa-bars"></i> Plans</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.jsp">Home</a></li>
						<li><i class="fa fa-square-o"><a href="order_type.jsp"></i>Order Selection</a></li>
            <li><i class="fa fa-circle-o"></i>Plan selection page</li>
					</ol>
				</div>
			</div>
              <div id="wizard" class="swMain">
                <br>
                <br>
                <span class="tab"></span>
                <center>
            <form id="planform">
            <%String value=(String)session.getAttribute("location");  %>
            
     <a href="#step-1" onclick="withequip('<%=value%>',this.name)" id="plan_equip" name="equipment">
            <img src="img/equip.png" onmouseover="this.src='img/equipclick.png'" onmouseout="this.src='img/equip.png'" width="250px" height="110px" />
        </a>
        <span class="tab"></span>
      <a href="#step-2" onclick="individual_plan('<%=value%>',this.name)" id="indi_plan" name="data">
            <img src="img/ind.png" onmouseover="this.src='img/indclick.png'" onmouseout="this.src='img/ind.png'" width="250px" height="110px" />
        </a>
        <span class="tab"></span>
      <a href="#step-3" onclick="group_plan('<%=value%>',this.name)" id="grp_plan" name="familyplan">
            <img src="img/group.png" onmouseover="this.src='img/groupclick.png'" onmouseout="this.src='img/group.png'" width="250px" height="110px"/>
         </a>
         </form><br>
         </center>
    <div id="framework">
    <script>
    document.getElementById("framework").innerHTML='<center><object height="700" width="1300" type="text/html" ></object></center>';
    </script>
  </div>
    <div id="step-1" style="display:none;" name="abcd"> 
        <h2 class="StepTitle">Step 1</h2>
        <table cellspacing="3" cellpadding="3" align="center">
            <tr>
                  <td align="center" colspan="3">&nbsp;</td>
            </tr>        
                                                      
       </table>               
    </div>
     <div id="step-2" style="display: none;" name="abcd"> 
        <h2 class="StepTitle">Step 2</h2>
        <table cellspacing="3" cellpadding="3" align="center">
            <tr>
                  <td align="center" colspan="3">&nbsp;</td>
            </tr>        
                                                  
       </table>               
    </div>
    <div id="step-3" style="display: none;" name="abcd"> 
        <h2 class="StepTitle">Step 3</h2>
        <table cellspacing="3" cellpadding="3" align="center">
            <tr>
                  <td align="center" colspan="3">&nbsp;</td>
            </tr>        
                                                  
       </table>               
    </div>

  
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
