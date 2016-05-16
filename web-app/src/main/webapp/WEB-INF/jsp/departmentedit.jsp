<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kobri
  Date: 15.05.2016
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department edit</title>
</head>
<body>
<c:url var="saveUrl" value="/and/department/edit?id=${depAtr.id}" />
<form:form modelAttribute="depAtr" method="POST" action="${saveUrl}">
    <table>
        <tr>
            <td><form:label path="id">Id:</form:label></td>
            <td><form:input path="id" disabled="true"/></td>
        </tr>

        <tr>
            <td><form:label path="name">Name:</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
    </table>
    <input type="submit" value="Save" />
</form:form>
</body>
</html>
