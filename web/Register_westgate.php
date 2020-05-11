<!DOCTTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    
    <title>WESTGATE HOTEL</title>

  

    
    <link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.css" />
    <link rel="stylesheet" href="vendor/metisMenu/dist/metisMenu.css" />
    <link rel="stylesheet" href="vendor/animate.css/animate.css" />
    <link rel="stylesheet" href="vendor/bootstrap/dist/css/bootstrap.css" />
    <link rel="stylesheet" href="vendor/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css" />
    <link rel="stylesheet" href="vendor/bootstrap-datepicker-master/dist/css/bootstrap-datepicker3.min.css" />
    <link rel="stylesheet" href="vendor/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" />
    <link rel="stylesheet" href="vendor/clockpicker/dist/bootstrap-clockpicker.min.css" />
    <link rel="stylesheet" href="vendor/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css" />
	 <link rel="stylesheet" href="vendor/select2-3.5.2/select2.css" />
    <link rel="stylesheet" href="vendor/select2-bootstrap/select2-bootstrap.css" />
    
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/pe-icon-7-stroke.css" />
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/helper.css" />
    <link rel="stylesheet" href="styles/style.css">
	<link rel="stylesheet" type = "text/css" href="styles/style2.css">
<title>Reservation</title>

<?php
   include ("php/registrationform.php");
   
?>

</head>
<body class="landing-page register" >
<div>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <img class="logo" src="images/landing/logo.png">
			
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a  href="landing_page_bl.php">Home</a></li>
				   <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-primary">Services <span class="caret"></span></button>
                    <ul class="dropdown-menu">
					    <li><a href="services.html">Services</a></li>
                        <li><a href="Galllery.html">Gallery</a></li>
                        <li><a href="Food and beverages.html">Food And Beverages</a></li>
                        <li><a href="Restaurant&Bar.html">Restaurant and Bar </a></li>						
                        <li><a href="fitness.html">Fitness</a></li>
                        <li><a href="family&pets.html">Family and Pets</a></li>
						<li><a href="parking.html">Parking</a></li>
                        <li><a href="transport.html">Transport</a></li>						
                        <li><a href="Spa.html">Spa</a></li>						
                    </ul>
                </div>
				       
                <li><a href="login.php" >Sign In</a></li>	
               
			
        </div>
		
    </div>
</nav>


<div class="bg-agile"  style="padding-top:10%">
	<div class="registration">
			<div class="book-form agileits-login">
							
				<form action="Register_westgate.php" method="post">
							
				    <h1>WestGate Hotel</h1>
					<h2>Create Your Account</h2>
				    
                    <table>
                        <tr>
                            <td>
                                <div class="form-group"><label for="name">First name</label> <input type="text" style="border-color:" id="name" name="name" placeholder="Enter your name" class="form-control" required>
                                </div>
                            </td>
                            <td>
                                <div class="form-group"><label for="last_name">Last name</label> <input type="text" id="last_name" placeholder="Enter your last name" class="form-control" name="last_name">
                                </div>
                            </td>
                        </tr>
						<tr>
                            <td>
                                <div class="form-group"><label for="email">Email</label> <input type="email" id="email" placeholder="example@gmail.com" class="form-control" name="email">
                                </div>
                            </td>
                            <td>
                                <div class="form-group"><label for="number">Phone number</label> <input type="text" id="number" placeholder="Phone number" class="form-control" name="number">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group"><label for="Password">Password</label> <input type="password" id="password" placeholder="....." class="form-control" name="pwd">
                                </div>
                            </td>
                            <td>
                                <div class="form-group"><label for="password">Confirm password</label> <input type="password" id="password" placeholder="....." class="form-control" name="pwrd">
                                </div>
                            </td>
                        </tr>
						
								
							
                        <tr>
                            <td>
                                <div>
					               <button class="btn w-xs btn-primary" name="register" type="submit"><strong>Register</strong></button>
						        </div>
                            </td>
                        </tr>
					</table>
                </form>
								</div>
					</div>
		    </div>

	
   </div>
</div>

<footer>
    <p align="center">WESTGATE HOTEL 	&copy Copyright  2018 </p>
</footer>
<script src="vendor/jquery/dist/jquery.min.js"></script>
<script src="vendor/jquery-ui/jquery-ui.min.js"></script>
<script src="vendor/slimScroll/jquery.slimscroll.min.js"></script>
<script src="vendor/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="vendor/metisMenu/dist/metisMenu.min.js"></script>
<script src="vendor/iCheck/icheck.min.js"></script>
<script src="vendor/sparkline/index.js"></script>
<script src="vendor/xeditable/bootstrap3-editable/js/bootstrap-editable.min.js"></script>
</body>
</html>