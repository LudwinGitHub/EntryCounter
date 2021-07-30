<%--
  Created by IntelliJ IDEA.
  User: supra
  Date: 29/07/2021
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Visits counter</title>
</head>
<body>
<h1>
  You have visited this page <%= request.getAttribute("numberOfVisits") %> times;
</h1>
<a href="remove">Counter reset</a>
</body>
</html>
