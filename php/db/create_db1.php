<?php
//mysqli procedural

$server="localhost";
$user="root";
$pass="";

//create conn
$conn=mysqli_connect($server,$user,$pass);

//check conn
if(!$conn){
    die("Connection failed".mysqli_connect_error());
}
else{
    $sql="CREATE DATABASE todo";
    if(mysqli_query($conn,$sql)){
        echo "Databse create successfully";
    }
    else{
        echo "Error creating database : ".mysqli_error($conn);
    }
}

mysqli_close($conn);

?>