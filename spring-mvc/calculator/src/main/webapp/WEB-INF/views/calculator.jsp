<%--
  Created by IntelliJ IDEA.
  User: nguyenanh
  Date: 4/10/19
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Discount</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" >
</head>
<body>
<h2>  Calulator </h2>
<form method="post" action="/calculator">
    number1:
    <input type="number"name="number1" placeholder="insert number1">
    <br>
    number2:
    <input type="number"name="number2" placeholder="insert number2">
    <br>
    Select operator:
    <select name="operator" >
        <option value="add">+</option>
        <option value="sub">-</option>
        <option value="multi">*</option>
        <option value="div">/</option>
    </select>

    <input type="submit" id="submit" value="Submit">
</form>
Result: ${result}
</body>
</html>