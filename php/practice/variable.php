<?php

$a=56;
echo $a;
//check datatype
echo gettype($a);
//set datatype
settype($a,"string");
echo gettype($a);

echo $a;

//mearge two string with concatation
$txt1="Hello";
$txt2="WORLD";

echo "<br/>".$txt1." ".$txt2;

//ternary operator
echo $a>40?"Grater":"Lesser";

?>
