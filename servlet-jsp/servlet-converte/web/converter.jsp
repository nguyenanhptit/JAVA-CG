<%--
  Created by IntelliJ IDEA.
  User: nguyenanh
  Date: 4/10/19
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter </title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency converter</h2>
<form method="get" action="./convert">
    <label>Rate: </label><br>
    <input type="text" name="rate" placeholder="rate"><br>
    <label>USD: </label><br>
    <input type="text" name="usd" placeholder="usd"><br>
    <input type="submit" id="submit" value="Converter">
</form>
</body>
</html>
