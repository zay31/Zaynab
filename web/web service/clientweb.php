<?php
require_once('dbconn.php');
require ('lib/nusoap.php');



$client=new nusoap_client("http://localhost/westgate/Homer/serviceweb.php?wsdl"); //create a instance for nusoap client

?>

<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		
		<form class = "form-inline" action="clientweb.php"  method="POST">
			<div class="form-group">
				<label for="name">UPDATE</label><br/>
				      <input type="integer" name="bookingNo" class="form-control"  placeholder="ID" required/><br/>
				       <input type="date" name="checkIn" class="form-control"  placeholder="change check in date" required/><br/>

				      <input type="date" name="checkOut" class="form-control"  placeholder="change check out date" required/><br/>

				      <input type="integer" name="adult" class="form-control"  placeholder="change number of adult" required/><br/>

				      <input type="integer" name="child" class="form-control"  placeholder="change number of children" required/><br/>

				      <input type="text" name="roomtype" class="form-control"  placeholder="change roomtype" required/>


				 
            </div>
            <button type="submit" name="submit" class="btn btn-default">Submit</button>
  </form>
  <p>&nbsp;</p>
  <h3>
  	<?php

		if(isset($_POST['submit']))
		{
			$bookingNo=$_POST['bookingNo'];
			$checkin=$_POST['checkIn'];
			$checkout=$_POST['checkOut'];
			$adult=$_POST['adult'];
			$child=$_POST['child'];
			$roomtype=$_POST['roomtype'];

			$array=array(
				"bookingNo"=>$bookingNo,
				"checkIn"=>$checkin,
				"checkOut"=>$checkout,
				"adult"=>$adult,
				"child"=>$child,
				"roomtype"=>$roomtype
			);
			
			$data = json_encode($array);

			print_r($data);
			exit;
			

			// $response= $client ->call('reservation',array("bookingNo"=>$bookingNo));

			if (empty($data)){
				echo "no data";
			}
			else{
				//echo $response;
				echo "Successfull";
			}
				

}
?>
</h3>
</div>
</body>
</html>