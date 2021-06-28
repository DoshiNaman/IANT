<!DOCTYPE html>
<html lang="en">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Session Ex Naman Doshi</title>
</head>
<body>
    <div class="container">
<form action="" method="POST">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1"name="pass">
  </div>
  <button type="submit" class="btn btn-primary" name="submit" value="submit">Submit</button>
  <button type="submit" class="btn btn-primary" value="next" name="next">NEXT</button>
  <button type="submit" class="btn btn-primary" value="del" name="del">DEL</button>
</form>
</div>
</body>
</html>




<?php

session_start();

if(isset($_POST['submit'])){
    if($_POST['email']!="" and $_POST['pass']!=""){
        $_SESSION['usere']=$_POST['email'];
        $_SESSION['userp']=$_POST['pass'];
        if(isset($_SESSION['usere']) and isset($_SESSION['userp'])){
            echo "SESSION IS STORED ! USER EMAIL IS : ".$_SESSION['usere'];
        }
        else{
            echo "SESSION NOT STORED";
        }
    }
    else{
        echo "<script>alert('info missing!')</script>";
    }
}

if(isset($_POST['next'])){
    //if($_POST['email']!="" and $_POST['pass']!=""){
        $_SESSION['usere']=$_POST['email'];
        $_SESSION['userp']=$_POST['pass'];
        echo"<script>window.location.href='sess1.php';</script>";
    //}
    //else{
    //    echo "<script>alert('info missing!')</script>";
    //}
}

if(isset($_POST['del'])){
    session_destroy();
    echo"<script>alert('seesion destroyed!');
    </script>";
}


?>
