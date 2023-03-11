<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculadora de IMC</h1>
<form action="hello-servlet" method="get">
    <table>
        <tr>
            <td><label for="weight">Digite seu peso:</label></td>
            <td><input type="text" name="weight" id="weight"/></td>
        </tr>
        <tr>
            <td><label for="height">Digite sua altura :</label></td>
            <td><input type="text" name="height" id="height"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
        </tr>
    </table>
    <h2>O seu indice de massa corporal é: ${imc}</h2>
</form>
</body>
</html>