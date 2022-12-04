<%--
  Created by IntelliJ IDEA.
  User: PuertoVallarta
  Date: 12/3/2022
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<body>
<a href='users'> <- Go back to users list</a>
<h2>Hello ${model.name}, your phone number is: ${model.phone}!</h2>
<h3>Friends</h3>
<c:forEach items="${model.friends}" var="name">
<a href='showuser?id=${name}'>${name}</a><p>
    </c:forEach>
</body>
</html>

