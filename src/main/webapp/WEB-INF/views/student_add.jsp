<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="Login" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 04.09.18
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie nowego ucznia</title>
</head>
<body>
    <fieldset>
        <legend>Dodaj nowego ucznia</legend>
        <form:form method="post" modelAttribute="student">
            Imię: <form:input path="firstName"/><br/>
            Nazwisko: <form:input path="lastName"/><br/>
            Email: <form:input path="email"/>
            Login: <form:input path="address"/><br/>
            Hasło: <form:password path="password"/><br/>

            <input type="submit" value="Wyślij">

        </form:form>
    </fieldset>
</body>
</html>
