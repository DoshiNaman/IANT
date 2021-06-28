<?php//pop
    $server="localhost";
    $user="root";
    $pass="";
    $db="todo";
    //create conn
    $conn=mysqli_connect($server,$user,$pass,$db);
    //check conn
    if(!$conn)
    {
        die("Connection failed".mysqli_connect_error());
    }
    else
    {
        $sql="CREATE TABLE login ( id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, username VARCHAR(30) NOT NULL, password VARCHAR(30) NOT NULL )";
        if(mysqli_query($conn,$sql)){
            echo "Table create successfully";
        }
        else{
            echo "Error creating table : ".mysqli_error($conn);
        }
    }
    mysqli_close($conn);
?>





<?php//pdo
    $servername = "localhost";
    $username = "root";
    $password = "";
    $db="todo"
    try {
        $conn = new PDO("mysql:host=$servername", $username, $password,$db);
        // set the PDO error mode to exception
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $sql = "CREATE TABLE login ( id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, username VARCHAR(30) NOT NULL, password VARCHAR(30) NOT NULL )";
        // use exec() because no results are returned
        $conn->exec($sql);
        echo "Table created successfully<br>";
    } catch(PDOException $e) {
        echo $sql . "<br>" . $e->getMessage();
    }
    $conn = null;
?>





<?php//oop
    $server="localhost";
    $user="root";
    $pass="";
    $db="todo";
    //create conn
    $conn=new mysqli($server,$user,$pass,$db);
    //check conn
    if($conn->connect_error){
        die("Connection failed".$conn->connect_error);
    }
    else{
        $sql="CREATE TABLE login ( id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, username VARCHAR(30) NOT NULL, password VARCHAR(30) NOT NULL )";
        if($conn->query($sql) === TRUE){
            echo "Table create successfully";
        }
        else{
            echo "Error creating table : ".$conn->error;
        }
    }
    $conn->close();
?>