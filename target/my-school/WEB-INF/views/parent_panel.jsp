<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 05.09.18
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 Witaj ${nameOfLoginUser} w panelu rodzica:
 <form:form action="${pageContext.request.contextPath}/logout" method="POST">
     <input type="submit" value="Logout" />
 </form:form>

</body>
</html>
