<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 06.09.18
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj nauczyciela</title>
</head>
<body>
<form:form method="post" modelAttribute="teacher">


    <fieldset>
        <legend>Podaj dane uzytkownika</legend>

        <div>
            Login: <form:input path="login"/>
        </div>
        <div>
            Hasło: <form:password path="password"/>
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
        <div>
            Adres: <form:input path="address"/>
        </div>
        <div>
            Płaca: <form:input path="payForHour"/>
        </div>
            <form:errors path="*"/>
        </div>
    </fieldset>
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
