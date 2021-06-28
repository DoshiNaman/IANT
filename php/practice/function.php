<?php

function myf1(){echo "<br/> NO RETURN NO PARAM";}
function myf2(){return "<br/> RETURN NO PARAM";}
function myf3($a=1){echo "<br/> NO RETURN  PARAM : ".$a;}
function myf4($a,$b){echo "<br/> RETURN PARAM : ";
return $a+$b;}

myf1();
echo myf2();
myf3(78);
echo myf4(78,56);
echo myf3();#defualt val

function dc(){echo "<br/> dynamic";}
$s="dc";
$s();

echo "<br>";
echo strtolower("NAMAN ");
echo "<br>";
echo strtoupper("naman ");
echo "<br>";
echo lcfirst("NAMAN ");
echo "<br>";
echo ucfirst("naman ");
echo "<br>";
echo ucwords("hello how are you?");
echo "<br>";
echo substr_replace("Hello World","NAMAN",6);
echo "<br>";
echo chr(52);
echo "<br>";
echo ord("h");
echo "<br>";
echo strcmp("NAMAN","NAMAN");
echo "<br>";
print_r(str_split("NAMAN"))
  
?>
