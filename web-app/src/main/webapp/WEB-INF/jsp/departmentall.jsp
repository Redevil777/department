<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 14.05.2016
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all department</title>
</head>
<body>

<c:url var="addUrl" value="/and/department/all" />


<c:choose>
    <c:when test="${empty departments}">
        There are currently no departments in the list.
        <br>
        <a href="<spring:url value='/and/department/add' ></spring:url>"
           title="department-add">Add department</a>

    </c:when>
    <c:otherwise>
        All departments.

        <br><br>
        <table style="border: 1px solid; width: 500px; text-align:center">



            <tr>
                <td>№</td>
                <td>Name</td>
            </tr>


            <c:forEach items="${departments}" var="department">

                <c:url var="deleteUrl" value="/and/department/delete?id=${department.id}" />
                <c:url var="editUrl" value="/and/department/edit?id=${department.id}" />
                <c:url var="averageSalary" value="/and/department/avg?id=${department.id}" />
                <c:url var="empDep" value="/and/department/employee?id=${department.id}"/>
                <tr>
                    <td><c:out value="${department.id}" /></td>
                    <td><c:out value="${department.name}" /></td>
                    <td><a href="${editUrl}">Edit</a> </td>
                    <td><a href="${deleteUrl}">Delete</a></td>
                    <td><a href="${averageSalary}">Average salary</a> </td>
                    <td><a href="${empDep}">Show employees</a> </td>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>


<c:url var="mainUrl" value="/and/home/index" />
<p>Return to <a href="${mainUrl}">Main List</a></p>
</body>
</html>
