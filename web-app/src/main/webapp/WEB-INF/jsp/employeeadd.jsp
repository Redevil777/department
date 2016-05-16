<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 15.05.2016
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee add</title>
</head>
<body>

<h2>Add employee</h2>
<c:url var="addUrl" value="/and/employee/add" />

<form:form modelAttribute="employee" method="post" action="${saveUrl}">

    <table>
        <tr>
            <td><form:label path="fname" >First name:</form:label></td>
            <td><form:input path="fname"/></td>
        </tr>
        <tr>
            <td><form:label path="lname">Last name:</form:label></td>
            <td><form:input path="lname"/></td>
        </tr>
        <tr>
            <td><form:label path="mname">Middle name:</form:label></td>
            <td><form:input path="mname"/></td>
        </tr>
        <tr>
            <td><form:label path="birthday">Birthday:</form:label></td>
            <td><input data-format="yyyy-MM-dd" type="date" name="birthday"></td>
        </tr>
        <tr>
            <td><form:label path="salary">Salary:</form:label></td>
            <td><form:input path="salary"/></td>
        </tr>
        <tr>
            <td>Department:</td>
            <td>
                <form:select path="dep_id">
                    <c:forEach items="${department}" var="department">
                        <option value="${department.id}">
                        <c:out value="${department.name}" />
                        </option>
                    </c:forEach>
                </form:select>
            </td>
        </tr>
    </table>

    <input type="submit" value="Add">
</form:form>

<br>
<c:url var="mainUrl" value="/and/home/index" />

<p>Return to <a href="${mainUrl}">Main list</a> </p>
</body>
</html>
