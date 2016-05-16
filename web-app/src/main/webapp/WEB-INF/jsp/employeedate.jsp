<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 17.05.2016
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee by date</title>
</head>
<body>
<h2>Employee by date</h2>
<br>
<br>
<table style="border: 1px solid; width: 500px; text-align:center" border="1">

    <tr>
        <td>№</td>
        <td>First name</td>
        <td>Last name</td>
        <td>Middle Name</td>
        <td>Salary</td>
        <td>Department</td>
    </tr>


    <c:forEach items="${employee}" var="employee">

        <tr>
            <td><c:out value="${employee.id}" /></td>
            <td><c:out value="${employee.fname}" /></td>
            <td><c:out value="${employee.lname}" /></td>
            <td><c:out value="${employee.mname}" /></td>
            <td><c:out value="${employee.salary}" /></td>
            <td>
                <c:forEach items="${department}" var="department">
                <c:choose>
                    <c:when test="${department.id == employee.dep_id }">
                        <c:out value="${department.name}" />
                    </c:when>
                </c:choose>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
<br><br>
<c:url var="back" value="/and/employee/all"/>
<p><a href="${back}">Back</a> </p>
<c:url var="mainUrl" value="/and/home/index" />
<p>Return to <a href="${mainUrl}">Main List</a></p>
</body>
</html>
