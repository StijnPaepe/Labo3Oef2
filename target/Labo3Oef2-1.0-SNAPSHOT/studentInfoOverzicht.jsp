<%@ page import="domain.model.Student" %>
<%@ page import="db.StudentDB" %>
<%@ page import="java.util.ArrayList" %>
<%! StudentDB studentDB = new StudentDB();

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Info: Overzicht</title>
</head>
<body>

<% ArrayList<Student> studenten = studentDB.getStudenten();
    if(studenten.size() == 0) {
%>
<p>Er zijn geen studenten om te tonen.</p>
<% } else {
%>
<table>
    <tr>
        <th>Naam</th>
        <th>Voornaam</th>
        <th>Leeftijd</th>
        <th>Studierichting</th>
    </tr>
    <%
        for(Student student : studenten) {
    %>
    <tr>
        <td><%=student.getNaam()%></td>
        <td><%=student.getVoornaam()%></td>
        <td><%=student.getLeeftijd()%></td>
        <td><%=student.getStudierichting()%></td>
    </tr>
    <%}%>
</table>
<%}%>
</body>
</html>
