<?php
require 'lib/nusoap.php';


$client=new nusoap_client("http://localhost//westgate/Homer/service.php?wsdl"); //create a instance for nusoap client

?>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Currency Converter</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<h2>Soap Currency Converter Web service</h2>
		<form class = "form-inline" action="" method="POST">
			<div class="form-group">
				<label for="name">Currency</label>
				      <input type="text" name="name" class="form-control"  placeholder="Enter the restaurant you wish to go" required/>

				 
            </div>
            <button type="submit" name="submit" class="btn btn-default">Submit</button>
  </form>
  <p>&nbsp;</p>
  <h3>
  	<?php

		if(isset($_POST['submit']))
		{
			$name=$_POST['name'];

			$response= $client ->call('restaurant',array("name"=>$name));

			if (empty($response))
				echo "no restaurant";
			else
				echo $response;

}
?>
</h3>
</div>
</body>
</html>