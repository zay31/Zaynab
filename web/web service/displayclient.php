<?php
  //ini_set('display_errors', true);
  
  //error_reporting(E_ALL);
  require_once('lib/nusoap.php');
  
  $error  = '';
  
  $result = array();
  $response = '';
  $wsdl = "http://localhost/westgate/Homer/example.php?wsdl";
  
  if(isset($_POST['sub'])){
    $bookingNo = trim($_POST['bookingNo']);
    if(!$bookingNo){
      $error = 'Cannot be left blank.';
    }
    if(!$error){
      //create client object
      $client = new nusoap_client($wsdl, true);
      $err = $client->getError();
      if ($err) {
        echo '<h2>Constructor error</h2>' . $err;
          exit();
      }
      try {
        $result = $client->call('fetchBookingData', array($bookingNo));
        $result = json_decode($result);
        }catch (Exception $e) {
          echo 'Caught exception: ',  $e->getMessage(), "\n";
       }
    }
  }
?>

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<div class='row'>
   <form class="form-inline" method = 'post' name='form1'>
     <?php if($error) { ?>  
       <div class="alert alert-danger fade in">
         <a href="#" class="close" data-dismiss="alert">&times;</a>
         <strong>Error!</strong> <?php echo $error; ?> 
         </div>
   <?php } ?> 
     <div class="form-group">
       <label for="email">Booking ID:</label>
       <input type="text" class="form-control" name="bookingNo" id="bookingNo" placeholder="Enter Booking ID">
     </div>
     <button type="submit" name='sub' class="btn btn-default">Fetch Booking Information</button>
   </form>
  </div>
 
   
  </div>
  <h2>Book Information</h2>
<table class="table">
  <thead>
    <tr>
      <th>Check In</th>
      <th>Check Out</th>
      <th>Adult</th>
      <th>Child</th>
      <th>Room Type</th>
    </tr>
  </thead>
  <tbody>
  <?php if($result){ 
         ?>
        <tr>
          <td><?php echo $result->checkIn; ?></td>
          <td><?php echo $result->checkOut; ?></td>
          <td><?php echo $result->adult; ?></td>
          <td><?php echo $result->child; ?></td>  
          <td><?php echo $result->roomtype; ?></td>
        </tr>
             <?php 
      }
     else {  ?>
      <tr>
          <td colspan='5'>Enter ISBN and click on Fetch Book Information button</td>
        </tr>
    <?php } ?>
  </tbody>

</table>
</body>
</html>