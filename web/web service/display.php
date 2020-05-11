<?php
require_once('dbconn.php');
 require_once('lib/nusoap.php'); 
 $server = new nusoap_server();
/* Fetch 1 book data */
function fetchBookingData($bookingNo){
  global $conn;
  $sql = "SELECT  checkIn, checkOut, adult, child, roomtype FROM booking where bookingNo = :bookingNo";
  // prepare sql and bind parameters
    $stmt = $conn->prepare($sql);
    $stmt->bindParam(":bookingNo", $bookingNo);
    // insert a row
    $stmt->execute();
    $data = $stmt->fetch(PDO::FETCH_ASSOC);
    return json_encode($data);
    $conn = null;
}
$server->configureWSDL("bookServer", "urn:bookserver");
$server->register("fetchBookingData",
      array("bookingNo" => "xsd:string"),  //parameter
      array("data" => "xsd:string"),  //output
      "urn:bookserver",   //namespace
      "urn:booking#fetchBookData" //soapaction
      );  
$server->service(file_get_contents("php://input"));
?>