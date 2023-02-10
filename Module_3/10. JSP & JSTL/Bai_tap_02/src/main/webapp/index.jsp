<%--
  Created by IntelliJ IDEA.
  User: K7
  Date: 2/10/2023
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<form class="text-center" action="/calculator" method="post">
    <div class="mb-3">
        <label for="first"> Nhập giá trị đầu tiên</label>
        <input type="number"  name="a1" id = "first">
    </div>

    <div>
        <p class="me-2">Nhập phép tính
        <select name="operators">
            <option value="cong">Cộng</option>
            <option value="tru">Trừ</option>
            <option value="nhan">Nhân</option>
            <option value="chia">Chia</option>
        </select>
        </p>
    </div>

    <div class="mb-3">
        <label for="second"> Nhập giá trị thứ hai</label>
        <input type="number" name="a2" id="second">
    </div>
    <input class="col-3" type="submit" value="Kết quả">
</form>

<p class="text-center">${result}</p>

<scrip src="js/bootstrap.js"></scrip>

</body>
</html>