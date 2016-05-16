<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 14.05.2016
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department add</title>
</head>
<body>
department-add<br>

<c:url var="addUrl" value="/and/department/add" />

<form:form modelAttribute="depatr" method="post" action="${saveUrl}">

<table>
    <tr>
        <td><form:label path="name">Department name:</form:label></td>
        <td><form:input path="name"/></td>
    </tr>
</table>

    <input type="submit" value="Add">
</form:form>
<br>
<c:url var="mainUrl" value="/and/home/index" />
<p>Return to <a href="${mainUrl}">Main List</a></p>
</body>
</html>
