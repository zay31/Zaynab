<?php


 
    $host = "localhost";
$dbname = "westgate"; 
$username = "root"; 
 $password = "";


 try {
    $conn = new PDO('mysql:host=localhost;dbname=westgate', $username, $password);
} catch (PDOException $e) {
    print "Error!: " . $e->getMessage() . "<br/>";
    die();
}


    ?>