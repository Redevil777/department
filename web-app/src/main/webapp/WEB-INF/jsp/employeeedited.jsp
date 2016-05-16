<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 16.05.2016
  Time: 2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee edited</title>
</head>
<body>
<p>You edited employee with id ${id} at <%= new java.util.Date() %></p>

<c:url var="mainUrl" value="/and/home/index" />
<c:url var="back" value="/and/employee/all"/>
<a href="${back}">Back</a>
<p>Return to <a href="${mainUrl}">Main list</a> </p>

</body>
</html>
