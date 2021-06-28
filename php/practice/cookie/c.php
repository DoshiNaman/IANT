<?php
if(isset($_POST['logout'])){
    setcookie("user1","",time()-60);
}

if($_POST['name']!="" && $_POST['pass']!=""){

    setcookie("user1",$_POST['name']);
    if(isset($_COOKIE['user1'])){
    echo $_COOKIE['user1']." is logged";
    echo " <form action='' method='POST'>
    <input type='submit' value='logout' name='logout'/>
    </form>";
    }
    else{
        echo "<script>alert('logout!!')
        window.location.href='c.html';</script>";
    }

}
else{
    echo "<script> alert('something missing!');
    window.location.href='c.html'; </script>";
}



?>
