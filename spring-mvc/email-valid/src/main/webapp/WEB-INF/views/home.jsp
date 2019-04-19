<%--
  Created by IntelliJ IDEA.
  User: nguyenanh
  Date: 4/18/19
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email validate</title>
</head>
<body>
<h1>Email validate</h1>
<h3 style="color: blueviolet">${message} </h3>
<form action="/validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit" value="validate">
</form>
</body>
</html>
