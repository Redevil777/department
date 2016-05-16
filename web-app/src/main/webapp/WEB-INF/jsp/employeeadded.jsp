<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 15.05.2016
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee added</title>
</head>
<body>
<p>You have added a new employee at <%= new java.util.Date()%></p>

<c:url var="mainUrl" value="/and/home/index" />
<c:url var="back" value="/and/employee/add"/>
<a href="${back}">Back</a>
<p>Return to <a href="${mainUrl}">Main List</a></p>
</body>
</html>
