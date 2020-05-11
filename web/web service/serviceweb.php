<?php
require_once('dbconn.php');
 require_once('lib/nusoap.php'); 
 $server = new nusoap_server();
    function reservation($id,$checkin,$checkout,$adult,$child,$roomtype){
      global $conn;
 		$sql = "UPDATE booking SET checkin = '$checkin', checkout = '$checkout', adult='$adult', child='$child', roomtype= '$roomtype' WHERE  bookingNo= '$id'";
      // prepare sql and bind parameters
        $stmt = $conn->prepare($sql);
        $stmt->bindParam('bookingNo', $id);
        $stmt->bindParam('checkin', $checkin);
        $stmt->bindParam('checkout', $checkout);
        $stmt->bindParam('adult', $adult);
        $stmt->bindParam('child', $child);
        $stmt->bindParam('roomtype', $roomtype);
      //$result = $sql->fetchAll();
        // insert a row
        $stmt->execute();

        // $data = $stmt->fetchAll(PDO::FETCH_ASSOC);
        $data="Update Success!";
        return json_encode($data);
        $conn = null;
    }
$server->configureWSDL("booksServer", "urn:booking");
$server->register("eBookData",
      array("id" => "xsd:integer"),  //parameter
      array("data" => "xsd:string"),  //output
      'urn:reserve',   //namespace
      'urn:book#editData' //soapaction
      );  
$server->service(file_get_contents("php://input"));
?>