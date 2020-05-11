<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Page title -->
    <title>WESTGATE Hotel</title>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <!--<link rel="shortcut icon" type="image/ico" href="favicon.ico" />-->

    <!-- Vendor styles -->
    <link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.css" />
    <link rel="stylesheet" href="vendor/metisMenu/dist/metisMenu.css" />
    <link rel="stylesheet" href="vendor/animate.css/animate.css" />
    <link rel="stylesheet" href="vendor/bootstrap/dist/css/bootstrap.css" />

    <!-- App styles -->
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/pe-icon-7-stroke.css" />
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/helper.css" />
    <link rel="stylesheet" href="styles/style.css">
    <link rel="stylesheet" type = "text/css" href="styles/style2.css">

 
</head>
<body class="blank login">

<!-- Simple splash screen-->
<div class="splash"> <div class="color-line"></div><div class="splash-title"><h1>Homer - Responsive Admin Theme</h1><p>Special Admin Theme for small and medium webapp with very clean and aesthetic style and feel. </p><div class="spinner"> <div class="rect1"></div> <div class="rect2"></div> <div class="rect3"></div> <div class="rect4"></div> <div class="rect5"></div> </div> </div> </div>
<!--[if lt IE 7]>
<p class="alert alert-danger">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<div class="color-line"></div>

<div class="back-link">
    <a href="landing_page_bl.php" class="btn btn-primary">HOME</a>
</div>

<div class="login-container">
    <div class="row">
        <div class="col-md-12">
            <div class="text-center m-b-md">
                <h2><strong>WESTGATE HOTEL</strong></h2>
                <small>Login to our site</small>
            </div>
            <div class="hpanel">
                <div class="panel-body">
                        <form action="login.php" id="loginForm" method="post">
                            <div class="form-group">
                                <label class="control-label" for="username">Email</label>
                                <input type="text" placeholder="example@gmail.com" title="Please enter you email" required="" value="" name="emaillog" id="username" class="form-control">
                                <br/>
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="password">Password</label>
                                <input type="password" title="Please enter your password" placeholder="******" required="" value="" name="passwrd" id="password" class="form-control">
                                <br/>
                            </div>
                            <div class="checkbox">
                                <input type="checkbox" class="i-checks" checked>
                                     Remember login
                                <p class="help-block small">(if this is a private computer)</p>
                            </div>
                            <button class="btn btn-success btn-block" name="login_btn">Login</button>
                            <a class="btn btn-default btn-block" href="Register_Westgate.php">Register</a>
                        </form>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12 text-center">
            <strong>Welcome</strong> to our login page <br/> 2018 Copyright WESTGATE HOTEL
        </div>
    </div>
</div>

<?php
   
   
   if(isset($_POST['login_btn'])){
    
    if(!empty($_POST['emaillog']) && !empty($_POST['passwrd'])){

        $lmail=$_POST['emaillog'];
        $pass=$_POST['passwrd'];

        include ('database.php');

        $sql =("SELECT FROM registration WHERE Email='".$lmail."' AND Password='".$pass."'");
        
      /*  $numrow=mysqli_num_row($sql); 
        if($numrow!=0){
            while($row=mysqli_fetch_assoc($sql)){
                $dbemail =$row['Email'];
                $dbpass =$row['Password'];
            }


            if($lmail == $dbemail && $dbpass == $passwrd){
            */
             $result = mysqli_query($conn,$sql);

             if (mysqli_num_row($result) == 1){
                $_SESSION['Email'] = $lmail;
                $_SESSION['sucess']="You are now login";

             header ('Location: landing_page.php');
            }

            }else
            {
            echo "Invalid email or password";
            }
    }
   


?>

<!-- Vendor scripts -->
<script src="vendor/jquery/dist/jquery.min.js"></script>
<script src="vendor/jquery-ui/jquery-ui.min.js"></script>
<script src="vendor/slimScroll/jquery.slimscroll.min.js"></script>
<script src="vendor/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="vendor/metisMenu/dist/metisMenu.min.js"></script>
<script src="vendor/iCheck/icheck.min.js"></script>
<script src="vendor/sparkline/index.js"></script>

<!-- App scripts -->
<script src="scripts/homer.js"></script>

</body>
</html>