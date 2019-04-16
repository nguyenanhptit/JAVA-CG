<%--
  Created by IntelliJ IDEA.
  User: nguyenanh
  Date: 4/15/19
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Product</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>

<p>
    <a href="/products">Back to product list</a>
</p>

<form method="post">
    <fieldset>
        <legend> Product info</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["product"].getName()}</td>
            </tr>

            <tr>
                <td>Color:</td>
                <td>${requestScope["product"].getColor()}</td>
            </tr>

            <tr>
                <td>Price:</td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/customers">Back to products list</a>
                </td>
            </tr>


        </table>
    </fieldset>
</form>

</body>
</html>