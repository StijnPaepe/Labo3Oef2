<%@ page import="domain.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: stijn
  Date: 22/02/2021
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Student student = (Student) request.getAttribute("student"); %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Info</title>
</head>
<body>
<p Je vroeg naar volgende gegevens:
<%= student.getNaam()%>
<%= student.getVoornaam()%>
(<%= student.getLeeftijd()%> jaar):
<%= student.getStudierichting()%>
</p>

</body>
</html>
