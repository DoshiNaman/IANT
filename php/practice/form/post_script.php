<?php

if(isset($_POST['submit'])){
echo $_POST['name']."<br/>";
echo $_POST['age']."<br/>";
}
else{
    echo "<script> alert('data not set');
    window.location.href='get_form.html'; </script>";
}

?>
