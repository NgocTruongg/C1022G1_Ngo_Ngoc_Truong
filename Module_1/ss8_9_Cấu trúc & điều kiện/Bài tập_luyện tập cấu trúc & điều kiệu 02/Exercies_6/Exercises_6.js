function result() {
    let a1 = document.getElementById('a1').value;
    let b1 = document.getElementById('b1').value;
    if (a1 == 0 && b1 == 0) {
        document.getElementById('result1').innerHTML= 'Phương trình có vô số nghiệm.';
    } else if (a1 != 0 && b1 != 0) {
        document.getElementById('result1').innerHTML= 'Phương trình có nghiệm là:' + (-b1) /a1;
    } else {
        document.getElementById('result1').innerHTML= 'Phương trình vô nghiêm.'
    }
}