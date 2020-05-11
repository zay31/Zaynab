<?php

	//require nusoap library
	require_once("lib/nusoap.php");

	//wsdl for existing webservice
	$wsdl="http://currencyconverter.kowabunga.net/converter.asmx?wsdl";

	//instantiate client object
	$client = new nusoap_client($wsdl,true);

	//get error
	$error = $client->getError();

	//check for constructor error
	if($error){
		echo "<h2>Constructor Error</h2><pre>".$error."</pre>";
	}

	//set timezone
	date_default_timezone_set("Indian/Mauritius");

	//date timezone
	$date = date("Y-m-d");

	//check if values have been  passed as parameter in URL
	if(isset($_GET['amount'])){

		//capture amount from url
		$amount = $_GET['amount'];

		//check if amount is not blank
		if($amount >0){
			//parameter to pass to function
			$parameter=array("CurrencyFrom"=>"USD","CurrencyTo"=>"MUR","RateDate"=>$date,"Amount"=>$amount);

			//call function and result in result
			$result=$client->call("GetConversionAmount",$parameter);

			//var_dump($result);

			//check for fault
			if ($client->fault){
				//output fault
				
				
				echo "<h2>Fault</h2><pre>".print_r($result)."</pre>";
				}else{
				//get error
					$error = $client->getError();

						if($error){
					//output error message
							echo"<h2>Error</h2><pre>".$error."</pre>";
						}else{
					//output result to 2dp
							echo "<center><h4>".$amount." USD is Rs ".(round($result["GetConversionAmountResult"],2))."</h4><center><br/>";
			
		            }	
			}
			//check if amount is blank or less than 0
			}elseif ( (strlen($amount)==0)||($amount <0) ){
				//output invalid message
				echo "<center><h4>Invalid amount</h4></center>";
			
		}

		
	 }

?>




