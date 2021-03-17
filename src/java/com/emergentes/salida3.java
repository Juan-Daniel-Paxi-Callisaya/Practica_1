package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida3", urlPatterns = {"/salida3"})
public class salida3 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ano = request.getParameter("ano");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<h1><center>Ejercicio 3</h1>");
            out.println("<p> Utilizando un solo Servlet calcular la edad de una persona a partir de su año de nacimiento doGet(HttpServletRequest request, HttpServletResponse response) </p>");
            out.println("<label>Año de nacimiento:</label>" + ano);
            out.println("</head>");
            out.println("<br><br>");
            out.println("<body>");
            out.println("edad: " + (2021 - Integer.parseInt(ano)));
            out.println("<br><br>");

            out.println("</body>");
            out.println("</html>");

        }
    }

}
