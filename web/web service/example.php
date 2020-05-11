<?php
require_once('lib/nusoap.php'); 

require_once('dbconn.php');
 $server = new nusoap_server();
/* Fetch 1 book data */
function fetchBookingData($room_type){
  //$conn=getdb();
  global $conn;
  $sql = "SELECT * FROM roomtype where room_type = :room_type"; 
  // prepare sql and bind parameters
    $stmt = $conn->prepare($sql);
    $stmt->bindParam(':room_type', $room_type);
    // insert a row
    $stmt->execute();
    $data = $stmt->fetch(PDO::FETCH_ASSOC);
    return json_encode($data);
    $conn = null;
}
$server->configureWSDL('booksServer', 'urn:book');
$server->register('fetchBookingData',
      array('room_type' => 'xsd:string'),  //parameter
      array('data' => 'xsd:string'),  //output
      'urn:book',   //namespace
      'urn:book#fetchBookingData' //soapaction
      );  
$server->service(file_get_contents("php://input"));
?>