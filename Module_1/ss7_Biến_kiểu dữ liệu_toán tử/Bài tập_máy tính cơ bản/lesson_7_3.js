function Add() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) + Number(number2);
    document.getElementById("result").innerHTML = result
}

function minus() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) - Number(number2);
    document.getElementById("result").innerHTML = result
}
function multip() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) * Number(number2);
    document.getElementById("result").innerHTML = result
}
function divide() {
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) / Number(number2);
    document.getElementById("result").innerHTML = result
}
function divide2(){
    let number1 = document.getElementById("number1").value;
    let number2 = document.getElementById("number2").value;
    let result = Number(number1) % Number(number2);
    document.getElementById("result").innerHTML = result
}