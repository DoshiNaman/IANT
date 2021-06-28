<?php
session_start();
if($_SESSION['usere']!=="" and $_SESSION['userp']!==""){
            echo "SESSION IS STORED ! USER EMAIL IS : ".$_SESSION['usere'];
}
else{
    echo "SESSION NOT STORED";
}
?>
