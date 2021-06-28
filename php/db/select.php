<?php
    $server="localhost";
    $user="root";
    $pass="";
    $db="todo";
    //create conn
    $conn=mysqli_connect($server,$user,$pass,$db);
    //check conn
    if(!$conn)
    {
        die("Connection failed".mysqli_connect_error());
    }
    else
    {
        $sql="select username,password from login";
        $result=mysqli_query($conn,$sql);       
        if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
                echo "id : " .$row['id']. " Name : ".$row['username']." Key : ".$row['password'];
            }
        }
        else{
            echo"<script>alert('Username & Password not match');
            window.location.href='login.html';
            </script>";
        }
    }
    mysqli_close($conn);
?>
