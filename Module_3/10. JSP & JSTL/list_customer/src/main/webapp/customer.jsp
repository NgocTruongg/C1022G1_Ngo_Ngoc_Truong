<%--
  Created by IntelliJ IDEA.
  User: K7
  Date: 2/10/2023
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<style>--%>
<%--    tr, td {--%>
<%--        text-align: center;--%>
<%--    }--%>
<%--</style>--%>
<link rel="stylesheet" href="css/bootstrap.css">
<body>
<h1 class="text-center bg-danger">Danh Sách Khách Hàng</h1>
<table class="table text-center bg-danger-subtle">
   <div style="display: inline-block">
       <tr>
           <th>Tên</th>
           <th>Ngày Sinh</th>
           <th>Địa Chỉ</th>
           <th>Ảnh</th>
       </tr>
   </div>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dateOfBirthday}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" width="100px"></td>
        </tr>
    </c:forEach>
</table>
<scrip src="js/bootstrap.js"></scrip>
</body>
</html>
