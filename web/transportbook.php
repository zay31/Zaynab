<!DOCTYPE html>
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
  <link href="https://fonts.google.com/specimen/Roboto?selection.family=Roboto" rel="stylesheet/>
<meta name="viewport" content="width=device-width, initial-scale=1">




<?php
  include 'database.php';
?>

</head>
<body background="images/landing1/booking.jpg">

<br><br><br><br>
<div class="Transportbook" >
<div class="bg-agile"  >
  
          
              
  <form action="booking.php" id="transportform" method="POST">
     <div class="row">
      <div class="col-25">
        <label for="transport">Type of transport</label>
      </div>
    <div class="col-75">
        <select id="trans" name="transport" required>
          <option selected hidden>Transport type</option>
          <option value="Seat in coach">Seat in coach</option>
          <option value="Private Car">Private Car</option>
          <option value="Airport Taxi">Airport Taxi</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="person">No. of persons</label>
      </div>
      <div class="col-75">
        <select value="numofperson" id="per" name="person"  required>
          <option selected hidden>Choose No. of person</option>
          <option >1</option>
          <option >2</option>
          <option >3</option>
          <option >4</option>
          <option >5</option>
          <option >6</option>
          <option >7</option>
          <option >8</option>
          <option >9</option>
          <option >10</option>
        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="time_in">Time IN</label>
      </div>
      <div class="col-75">
        <input type="time" id="time" name="timein"  required>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="time_out">Time OUT</label>
      </div>
      <div class="col-75">
        <input type="time" id="time" name="timeout" required>
      </div>
    </div>
   
      <br>
    <div class="row">
     <button class="btn w-xs btn-primary" name="submit"  type="submit" ><strong>BOOK NOW</strong></button>
    </div>
  </form>
</div>
</div>
</div>
</div>



</body>
</html>
