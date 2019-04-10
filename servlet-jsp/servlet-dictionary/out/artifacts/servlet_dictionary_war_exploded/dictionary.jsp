<%--
  Created by IntelliJ IDEA.
  User: nguyenanh
  Date: 4/10/19
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" >
</head>
<body>
    <h2> Dictionary </h2>
    <form method="post" action="./translate">
        <input type="text"name="inserttext" placeholder="insert text">
        <input type="submit" id="submit" value="Search">
    </form>
</body>
</html>
