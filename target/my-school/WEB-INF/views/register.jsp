<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 04.09.18
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rejestracja Użytkownika</title>
</head>
<body>
    <form:form method="post" modelAttribute="user">
        <fieldset>
            <legend>Podaj dane uzytkownika</legend>
        </fieldset>
            <div>
                Login <form:input path="login"/>
            </div>
            <div>
                Password <form:password path="password"/>
            </div>
            <div>
                Email: <form:input path="email"/>
            </div>
            <div>
                Imie: <form:input path="firstName"/>
            </div>
            <div>
                Nazwisko: <form:input path="lastName"/>
            </div>
        <fieldset>
            <span>
                <input type="reset" value="Wyczyść"/>
            </span>
            <span>
                <input type="submit" value="Wyślij"/>
            </span>
        </fieldset>
    </form:form>
</body>
</html>
