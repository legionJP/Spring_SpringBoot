<%@page language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h2> Result is: <%=session.getAttribute("result")%> </h2>

<!--- JSTL Way --->

<h2> Result is : ${result} </h2>
</body>
</html>