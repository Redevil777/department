<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 16.05.2016
  Time: 1:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee deleted</title>
</head>
<body>
<h1>Employee delete</h1>

<p>You deleted employee with id ${id} at <%= new java.util.Date()%> </p>

<c:url var="mainUrl" value="/and/home/index" />
<c:url var="allempl" value="/and/employee/all"/>
<a href="${allempl}">Back</a>
<p><a href="${mainUrl}">Main List</a></p>
</body>
</html>
