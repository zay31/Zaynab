<?php
  include 'database.php';

 


      if(isset($_POST['submit'])){
        
        
           $transport =$_POST['transport'];
           $person=$_POST['person'];
           $timein=$_POST['timein'];
            $timeout=$_POST['timeout'];

           
           $sql="INSERT INTO transportbooking (typetransport, numofperson, timein, timeout) VALUES ('$transport', '$person', '$timein', '$timeout')";
           $result = mysqli_query($conn, $sql);
           
         }

    else {

      echo "Error";
    }



         
       
     
    
    header('location:transport.php');

   
    mysql_close();

?>