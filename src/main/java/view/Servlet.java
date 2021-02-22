package view;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/studentInfoOverzicht")
class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getParameter("naam");
        request.getParameter("voornaam");
        request.setAttribute("naam", "voornaam");
        request.getRequestDispatcher("gevonden.jsp").forward(request,response);
    }
}
