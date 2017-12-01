<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 02.12.2017
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>users</title>
</head>

<body>
<c:forEach var="user" items="${users}">
    <c:out value="${user.id}"/>
    <c:out value="${user.login}"/>
    <c:out value="${user.password}"/>
</c:forEach>
</body>
</html>