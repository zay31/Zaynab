<?php
    
   $dbserver="localhost";
   $username="root";
   $password="";
   $dbname="westgate";

   $conn  = mysqli_connect($dbserver,$username,$password,$dbname);

   if(!$conn)
   {
   	die("Connection failed:" .mysqli_connect_error());
   }
   else{
   	echo"Connected successfully";
   }
   

?>