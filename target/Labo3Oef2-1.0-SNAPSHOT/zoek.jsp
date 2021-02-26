<%--
  Created by IntelliJ IDEA.
  User: stijn
  Date: 23/02/2021
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Info</title>
</head>
<body>
<p>Zoek gegevens van volgende student:</p>
<form action="StudentInfo" method="get">
    <p><label>Naam: <input type="text" name="naam" id="naam"></label></p>
    <p><label>Voornaam: <input type="text" name="voornaam" id="voornaam"></label></p>
    <p><input type="submit" value="Zoek"></p>
</form>
</body>
</html>
