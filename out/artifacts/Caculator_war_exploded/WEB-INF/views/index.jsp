<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/12/2019
  Time: 7:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form method="post" action="/index">
    <input type="number" name="number1">
    <input type="number" name="number2"><br><br>
    <input type="submit" name="caculate" value="Addition(+)">
    <input type="submit" name="caculate" value="Subtraction(-)">
    <input type="submit" name="caculate" value="Multiplication(x)">
    <input type="submit" name="caculate" value="Division(/)">

    <p>Result Division: ${result} </p>


</form>
</body>
</html>
