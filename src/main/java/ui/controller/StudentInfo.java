package ui.controller;

import db.StudentDB;
import domain.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/StudentInfo")
public class StudentInfo extends HttpServlet {
    StudentDB studentDB = new StudentDB();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destination = "nietgevonden.jsp";
        String naam = request.getParameter("naam");
        String voornaam = request.getParameter("voornaam");
        Student student = studentDB.vindStudent(naam, voornaam);
        if(student != null){
            request.setAttribute("student", student);
            destination = "gevonden.jsp";
        }
        request.getRequestDispatcher(destination).forward(request, response);
    }
}
