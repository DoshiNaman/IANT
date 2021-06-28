<?php

echo " <form action='' method='POST'>
    <input type='text' name='text' placeholder='enter name'/>
    <input type='submit' value='submit' name='submit'/>
    </form>";
if(isset($_POST['submit'])){
    setcookie("name1",$_POST['text'],time()+6);
    if(isset($_COOKIE['name1'])){
        echo "cookie set".$_COOKIE['name1'];
    }
    else{
        echo "cookie not set";
    }
}
?>
