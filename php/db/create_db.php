<?php
//mysqli obj

$server="localhost";
$user="root";
$pass="";

//create conn
$conn=new mysqli($server,$user,$pass);

//check conn
if($conn->connect_error){
    die("Connection failed".$conn->connect_error);
}
else{
    $sql="CREATE DATABASE todo1";
    if($conn->query($sql) === TRUE){
        echo "Databse create successfully";
    }
    else{
        echo "Error creating database : ".$conn->error;
    }
}

$conn->close();

?>