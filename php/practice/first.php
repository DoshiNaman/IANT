<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MY First PHP Program</title>
</head>
<body>
<?php 
  $a=74;
  $b=56;
  if($a>$b){
  echo"nAman dOSHI"; 
  }
  else{
      echo'<br/> How\'s your day programmer ?';
  }
  //userdefine constant
  define("myc",22);
  echo myc;
  //magic constatant
  echo __LINE__;
  echo "<br>".__FILE__." Hii";
?>
</body>
</html>
