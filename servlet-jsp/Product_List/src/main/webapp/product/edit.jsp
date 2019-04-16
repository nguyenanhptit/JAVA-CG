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
                <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
            </tr>

            <tr>
                <td>Color:</td>
                <td><input type="text" name="color" id="color" value="${requestScope["product"].getColor()}"></td>
            </tr>

            <tr>
                <td>Price:</td>
                <td><input type="number" name="price" id="price" value="${requestScope["product"].getPrice()}"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>


        </table>
    </fieldset>
</form>

</body>
</html>