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
  <h2> Discount Calulator </h2>
  <form method="post" action="./calculator">
    Price:
    <input type="number"name="price" placeholder="insert price">
    <br>
    Price discount percent:
    <input type="number"name="discount" placeholder="discount">%
    <br>

    <input type="submit" id="submit" value="Submit">
  </form>
  </body>
</html>
