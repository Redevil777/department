<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 15.05.2016
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edited department</title>
</head>
<body>
<p>You edited department with id ${id} at <%= new java.util.Date() %></p>

<c:url var="mainUrl" value="/and/home/index" />
<p>Return to <a href="${mainUrl}">Main list</a> </p>

</body>
</html>