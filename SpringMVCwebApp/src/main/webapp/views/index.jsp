<%@page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Hello Java Servlet, JSP and POJO</h2>
    <form action="add">
        <label for="num1">Enter 1st Num </label>
        <input type="text" id="num1" name="num1"><br>
        <label for="num2" >Enter 2nd Num </label>
        <input type="text" id="num2" name="num2">
        <input type="submit" value="submit">
    </form>
    <br>
<%--    asking for the addMe controller--%>
    <form action="addMe">
        <label for="myID">Enter Id </label>
        <input type="text" id="myID" name="myID"><br>
        <label for="myName">Enter Name </label>"<br>
        <input type="text" id="myName" name="myName"><br>
        <input type="submit" value="submit">
    </form>

</body>
</html>
<%--index.jsp for home page--%>