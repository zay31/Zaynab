<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Page title -->
    <title>WESTGATE HOTEL</title>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <!--<link rel="shortcut icon" type="image/ico" href="favicon.ico" />-->

    <!-- Vendor styles -->
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
    <!-- App styles -->
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/pe-icon-7-stroke.css" />
    <link rel="stylesheet" href="fonts/pe-icon-7-stroke/css/helper.css" />
    <link rel="stylesheet" href="styles/style.css">

</head>
<body class="landing-page">

<!-- Simple splash screen-->
<div class="splash"> <div class="color-line"></div><div class="splash-title"><h1>WESTGATE HOTEL</h1><p>We are having some technical problem.Sorry for the inconvenient. </p><div class="spinner"> <div class="rect1"></div> <div class="rect2"></div> <div class="rect3"></div> <div class="rect4"></div> <div class="rect5"></div> </div> </div> </div>
<!--[if lt IE 7]>
<p class="alert alert-danger">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <img class="logo" src="images/landing/logo.png">
			
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a class="current" href="#page-top">Home</a></li>
				<li><a class="page-scroll" href="#components">Rooms</a></li>
				<li><a class="page-scroll" href="#about">About Us</a></li>
				<li><a  href="Myreservation.php">MY Reservation</a></li>
                <div class="btn-group">
                    <button data-toggle="dropdown" class="btn btn-primary">Services <span class="caret"></span></button>
                    <ul class="dropdown-menu">
					    <li><a class="active" href="services.html">Services</a></li>
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
				       
                <li><a href="landing_page_bl.php" >Sign Out</a></li>	
               
			
        </div>
		
    </div>
</nav>

<section id="page-top"  style="padding-top:5%">
 <div class="slideshow-container">

<div class="mySlides">
<div class="numbertext">1 / 3</div>
  <img src="images/landing/1520.jpg">
 
</div>

<div class="mySlides">
<div class="numbertext">2 / 3</div>
  <img src="images/landing/1920.jpg">
 
</div>

<div class="mySlides">
<div class="numbertext">3 / 3</div>
  <img src="images/landing/850.jpg">

</div>
</br>
<div style="text-align:center">
  <span style="display:none;" class="dot"></span> 
  <span style="display:none;" class="dot"></span> 
  <span style="display:none;" class="dot"></span> 
</div>

</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2500); // Change image every 2.5 seconds
}
</script>
     
	<div class="Check Availability">
		        <div class="row">
					<div class="col-md-12 col-sm-12">
					     <div class="awe-calendar-wrapper col-md-3 col-sm-3">
						 <input type="text" class="form-control" placeholder="Check-In" id="start">
						 <i class="calendar"></i>
						 </div>
                     					 
						 <div class="awe-calendar-wrapper col-md-3 col-sm-3">
						 <input type="text" class="form-control" placeholder="Check-Out" id="end">
						 <i class="calendar"></i>
						 </div>

						
						<div>
					    <select class="js-source-states col-md-2 col-sm-2">
                                    <option>Adults</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
									<option>5</option>
									<option>6</option>
                         </select>
						 </div>
						 <div>
								<select class="js-source-states col-md-2 col-sm-2">
                                    <option>Children</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
									<option>4</option>
                                </select>
								</div>

                                <div>
                                <select class="js-source-states col-md-2 col-sm-2">
                                    <option>Rooms</option>
                                    <option>Deluxe Sea View</option>
                                    <option>Deluxe Garden View</option>
                                    <option>Presidential Suite</option>
                                    <option>Executive Lounge</option>
                                </select>
                                </div>
					        <div class="availability col-md-2 col-sm-1">
							  <button type="button" class="btn btn-primary" onclick="alert('Room is available, sign In to continue')">Check Availability     </button>
							</div>
					</div>
				
				</div>
       


</section>

<section id="components" class="bg-light">
    <div class="container">
        <div class="row">
            <div class="col-lg-12"><br/>
                <h2><span class="text-success">Rooms</h2>
                
            </div>
        </div>
        <div class="row m-t-md">
            <div class="col-md-6">
                <h4 class="m-t-xxxl">Deluxe Garden View</h4>
                <p>Our 30 Deluxe rooms with garden view are located on the ground, first and second floors and are all 39m2. They are decorated in warm colors and with natural materials, giving them a welcoming and convivial feel. Each room boasts a private furnished balcony that opens out onto a tropical garden.</p>
				<h5>Facilities</h5>
				<ul>
				   <li>King size bed</li>
				   <li>Air Conditioning</li>
				   <li>LCD flat-screen TV</li>
				   <li>Wi-Fi</li>
				</ul>  
				   
				</p>
            </div>
            <div class="col-md-6">
                <img src="images/landing/gardenview.jpg" class="img-responsive">
            </div>
        </div>
        <div class="row m-t-xl">
            <div class="col-md-6">
                <img src="images/landing/seaview1.jpg" class="img-responsive">
            </div>
            <div class="col-md-6">
                <h4 class="m-t-xxl">Deluxe Sea View</h4>
                <p>Our 12 Deluxe rooms with sea views all measure 39m2 and are located on the ground, first and second floors. They are decorated in ochre and warm orange tones and furnished with wood, raffia and rattan. Each room boasts a private furnished balcony offering sweeping views over the sea: the perfect setting for a holiday escape.</p>
				<h5>Facilities</h5>
				<ul>
				   <li>King size bed</li>
				   <li>Air Conditioning</li>
				   <li>Mini bar with soft drinks and beer (replenished once a day)</li>
				   <li>LCD flat-screen TV</li>
				   <li>Wi-Fi</li>
				   <li>Bathroom with separate shower and toilet</li>

				</ul>
            </div>
        </div>
        <div class="row  m-t-xl">
            <div class="col-md-6">
                <h4 class="m-t-xxl">Presidential Suite</h4>
                <p>Gather family or friends for the vacation of a lifetime at this expansive residence. Sleeping six comfortably, this suite also boasts a lounge, a kitchen and two swimming pools, all just a minute from Bambou Beach.</p>
				<ul>
				   <li>Two King Size Beds And Two Queen Size Beds And One Rollaway</li>
				   <li>Air Conditioning</li>
				   <li>Mini bar with soft drinks and beer</li>
				   <li>LCD flat-screen TV</li>
				   <li>Wi-Fi</li>
				   <li>Three full Bathrooms And Three Outdoor Showers</li>
                   <li>Panorama Of The Ocean And Lagoon</li>
				   
				</ul>
            </div>
            <div class="col-md-6">
                <img src="images/landing/presidential.jpg" class="img-responsive">
            </div>
        </div>
        <div class="row m-t-xl">
            <div class="col-md-6"><br/><br/><br/>
                <img src="images/landing/Executive-Suite.jpg" class="img-responsive">
            </div>
            <div class="col-md-6">
                <h4 class="m-t-xxl">Executive Lounge</h4>
                <p>The Executive King Suite with 78sqm is furnished with a Separate Living Room, spacious Work Desk and access to the Premier Lounge. The Premier Lounge Benefits include Buffet Breakfast and Pre-Dinner Cocktail at Premier Club Lounge for 2 pax, Broadband Internet Access in Room, Wireless Internet available at Premier Club lounge, Late Check-Out until 1500hrs -subject to availability.</p>
				<ul>
				   <li>King size bed</li>
				   <li>Air Conditioning</li>
				   <li>Mini bar with soft drinks and beer (replenished once a day)</li>
				   <li>LCD flat-screen TV</li>
				   <li>Wi-Fi</li>
				   <li>Bathroom with separate shower and toilet</li>
				</ul>
            </div>
        </div>
    </div>
</section>

<section id="about">
    <div class="container">
	    <div class="row">
            <div class="col-lg-12"><br/>
                
            <h2><span class="text-success">About</span> Us</h2>

            <p>WESTGATE HOTEL is located at the most attractive part of Bar, nearby the promenade along the sea shore, and is surrounded by lush vegetation, museum complex and sport terraines.</p>
            <p>Rooms and apartments are comfortable and contemporarily designed, with exceptional views of the marina, beach and sea, palace and mountains at the town s hinterland. Hotel has 135 rooms, which offer modern comfort: mini bar, air conditioner, satelite & cable TV, safety deposit box, as well as all neccessary accesories and room service.</p>
            <p>Choose the bathroom you want: with bath tub and shower bath tub; only with bath tub or only with shower bath tub. Our restaurants offer specialties of national & international cuisine, various drinks, accompanied with good service. Lobby & Piano bar are pleasant spaces for rest, while having a drink and conversation with business partners or friends. You can enjoy and also have a drink or try some sweets or cakes at the Pool bar, from which you can go out to the pool and spacious terrace of the hotel</p>
            </div>
	    </div>
    </div>
</section>

<section id="team">
    <div class="container">
        <div class="row text-center">
            <div class="col-md-6 col-md-offset-3">
                <h2><span class="text-success">Our team </span>support you</h2>
            </div>
        </div>

        <div class="row m-t-lg text-center">
            <div class="col-sm-4">
                <div class="team-member">
                    <img src="images/pic.jpg" class="img-circle img-small" alt="">
                    <h4><span>Ramjauny</span> Muzwaffar</h4>
                
					<p>Business magnate, investor,philanthropist, humanitarian, and principal founder of WESTGATE Hotel.</p>
                    
                </div>
            </div>
            <div class="col-sm-4">
                <div class="team-member">
                    <img src="images/zaynab.jpg" class="img-circle" alt="">
                    <h4><span>Bacsou</span> Zaynab</h4>
                    <p>Technology entrepreneur and philanthropist. She is known for co-founding and leading WESTGATE Hotel as its chairman and chief executive officer.</p>

                </div>
            </div>
            <div class="col-sm-4">
                <div class="team-member">
                    <img src="images/a3.jpg" class="img-circle img-small" alt="">
                    <h4><span>Paul</span> Allen</h4>
                    <p>Technology entrepreneur, investor, and philanthropist. He is best known as the founder, chairman, and CEO of Amazon.</p>

                </div>
            </div>
        </div>
        

    </div>
</section>

<section id="contact" class="bg-light">
    <div class="container">
        <div class="row text-center">
            <div class="col-md-6 col-md-offset-3">
                <h2><span class="text-success">Subscribe</span> to our newsletter</h2>
              
            </div>
        </div>

        <div class="row text-center m-t-lg">
            <div class="col-md-6 col-md-offset-4">
              <table>
                <form class="form-horizontal" role="form" method="post" action="#">
                   <tr><td> <div class="form-group">
                        <label for="email" class="col-sm-6 control-label">Email:</label>
                       </td>
					   <td>
                        <div class="col-sm-14">
                            <input type="email" class="form-control" id="email" name="email" placeholder="user@example.com" value="">
                        </div>
                    
					   </td></div>
                    <td><div class="form-group">
                        <div class="col-md-12">
                            <input id="submit" name="submit" type="submit" value="Subscribe" class="btn btn-success">
                        </div>
                    </td></div>
					</tr>
                </form>
              </table>
            </div>
        </div>


    </div>
</section>



<!-- Vendor scripts -->
<script src="vendor/jquery/dist/jquery.min.js"></script>
<script src="vendor/jquery-ui/jquery-ui.min.js"></script>
<script src="vendor/slimScroll/jquery.slimscroll.min.js"></script>
<script src="vendor/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="vendor/metisMenu/dist/metisMenu.min.js"></script>
<script src="vendor/iCheck/icheck.min.js"></script>
<script src="vendor/sparkline/index.js"></script>
<script src="vendor/moment/moment.js"></script>
<script src="vendor/xeditable/bootstrap3-editable/js/bootstrap-editable.min.js"></script>
<script src="vendor/select2-3.5.2/select2.min.js"></script>
<script src="vendor/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"></script>
<script src="vendor/bootstrap-datepicker-master/dist/js/bootstrap-datepicker.min.js"></script>
<script src="vendor/clockpicker/dist/bootstrap-clockpicker.min.js"></script>
<script src="vendor/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>
<!-- App scripts -->
<script src="scripts/homer.js"></script>

<!-- Local script for menu handle -->
<!-- It can be also directive -->
<script>
    $(document).ready(function () {
      $("#start").datepicker();
	   $("#end").datepicker();
	   $(".js-source-states").select2();
        // Page scrolling feature
        $('a.page-scroll').bind('click', function(event) {
            var link = $(this);
            $('html, body').stop().animate({
                scrollTop: $(link.attr('href')).offset().top - 50
            }, 500);
            event.preventDefault();
        });

        $('body').scrollspy({
            target: '.navbar-fixed-top',
            offset: 80
        });

    });
</script>
<footer>
    <p align="center">WESTGATE HOTEL 	&copy Copyright  2018 </p>
</footer>
</body>
</html>