<?php

#Numeric array

$myFA=array(4,7,3,9,56,23);
$mySA=array();
$mySA[0]="NAMAN";
$mySA[1]="SHAIL";
$mySA[2]="JAY";
$mySA[3]="DRASHTI";

echo $myFA[4];
echo "<br/>".$mySA[0];
echo "<br/>";
for($i=0;$i<4;$i++){
    echo "<br/>".$mySA[$i];
}

#Associtive Array

$myAA=array("car1"=>"BMW","car2"=>"FORD","car3"=>"MAZDA");
$myAAA=array();
$myAAA["v1"]=3;
$myAAA["v2"]=7;
$myAAA["v3"]=334;
$myAAA["v4"]=789;


echo "<br/>".$myAA["car2"];
echo "<br/>".$myAAA["v3"];

foreach($myAA  as $v1=>$k1){
    echo "<br/> key :". $v1 ." value :". $k1 ;
}

#multidimensional array

$mD=array(
    "fad"=>array(3,78,56,5),
    "sad"=>array(3,76,5),
    "tad"=>array(36)
);

echo $mD['fad'][1];

for($i=0;$i<4;$i++){
    echo "<br/>".$mD['fad'][$i];
}


#print_r

$mystr="HELLO WORLD THIS IS PROGRAMMING";
$ff=explode(' ',$mystr);
print_r($ff);

#array_push

array_push($myFA,70,9);
echo "<br/>";
print_r($myFA);

#ARRAY_POP

array_pop($myFA);
echo "<br/>";
print_r($myFA);

#array_key_exist

if(array_key_exists("car24",$myAA)){ echo "<br/> exist";}
else{echo "<br/> not exist";}

#array_merge

print_r(array_merge($myFA,$myAA));

#count

echo "<br/> count : ". count($myFA,1);

#is_array

$f=56;

if(is_array($f)){ echo "<br/> array";}
else{echo "<br/> not array";}

#cuurent

echo "<br/>".current($myFA);
next($myFA);
echo "<br/>".current($myFA);
prev($myFA);
echo "<br/>".current($myFA);

#in_array

if(in_array(109,$myFA)){echo "<br/> found";}
else{echo "<br/> not found";}

#array_search
echo "<br/>".array_search("BMW",$myAA);

#is_set
$gg="TEST";
if(isset($gg)){echo "<br/> set";}
else{echo "<br/> not set";}

#shuffle
shuffle($myFA);
print_r($myFA);

#arraysum
echo "<br/>".array_sum($myFA);
#array_flip
print_r(array_flip($myAA));

?>
