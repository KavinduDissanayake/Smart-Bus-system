<?php

include '../config.php';
header("Content-Type: application/json; charset=UTF-8");

$bus_tb_id= $_POST['bus_tb_id'];


$sql="UPDATE `bus_info` SET `isCompleteRoute`='Complete' WHERE `tb_id`='$bus_tb_id';";


if(mysqli_query($conn, $sql)){
    $myObj=new \stdClass();
    $myObj->success = 'true';
    $myJSON = json_encode($myObj);
    echo $myJSON;
} else{
    $myObj=new \stdClass();
    $myObj->success = 'false';
    $myJSON = json_encode($myObj);
    echo $myJSON;
}


mysqli_close($conn);
?>