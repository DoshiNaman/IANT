<?php

$i=1;
while($i<10){
    echo $i."<br/>";
    if($i==7)break;
    $i++;
}

$i=1;
do{
    echo $i."<br/>";
    $i++; 
}while($i>10);

for($i=1;$i<15;$i++){
    if($i==7)continue;
    echo $i;    
}

?>
