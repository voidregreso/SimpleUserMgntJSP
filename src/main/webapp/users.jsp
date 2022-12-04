<%--
  Created by IntelliJ IDEA.
  User: PuertoVallarta
  Date: 12/3/2022
  Time: 11:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<body>
<h2>Users list</h2>

<c:forEach items="${model}" var="user">
<div id="user" style="display: inline">
    <a href='showuser?id=${user.name}'>${user.name} - ${user.phone}</a>
    <a href="deluser?name=${user.name}"><input type="submit" value="delete"></a>
</div>
<p>

    </c:forEach>
    <br>
<form action="adduser.jsp">
    <input type="submit" value="add new user">
</form>
</body>
</html>
