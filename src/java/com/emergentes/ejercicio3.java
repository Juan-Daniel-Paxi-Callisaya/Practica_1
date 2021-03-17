package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio3", urlPatterns = {"/ejercicio3"})
public class ejercicio3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ano = request.getParameter("ano");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ejercicio3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Ejercicio 3</h1>");
            out.print("<form action='salida3' method='post'>");
            out.println("<p> Utilizando un solo Servlet calcular la edad de una persona a partir de su año de nacimiento doGet(HttpServletRequest request, HttpServletResponse response) </p>");
            out.println("<label>Año de nacimiento:</label>");
            out.println("<input type='numer' name='ano'>");
            out.println("<input type='submit' value=' calcular edad'>");
           
            out.println("<br><br>");

            out.println("<br><br>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
