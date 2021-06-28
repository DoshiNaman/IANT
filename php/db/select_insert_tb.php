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

        $sql1="SELECT username,password from login where username='Naman' AND password='12345'";
        $result=mysqli_query($conn,$sql1);       
        if(mysqli_num_rows($result) > 0){
            echo "Data is alerady";
        }
        else{
            $sql="insert into login values('','Naman','12345')";
            if(mysqli_query($conn,$sql)){
                echo "new record created successfully";
            }   
            else{
                echo "Error : ". $sql . "<br>" . mysqli_error($conn);
            }
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
        $sql = "insert into login values('','Naman','12345')";
        // use exec() because no results are returned
        $conn->exec($sql);
        echo "new data created successfully<br>";
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
        $sql="insert into login values('','Naman','12345')";
        if($conn->query($sql) === TRUE){
            echo "Table create successfully";
        }
        else{
            echo "Error creating table : ".$conn->error;
        }
    }
    $conn->close();
?>