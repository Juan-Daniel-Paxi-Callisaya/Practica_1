package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saludo de bienvenida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>PRACTICA Nº 1</center></h1>");
            out.println("<h1><center>Servlets</center></h1>");
            out.println("<br><br>");
            out.println("<a href='ejercicio1'> - Ejercicio N 1</a>");
            out.println("<br><br>");
            out.println("<a href='ejercicio2'> - Ejercicio N 2</a>");
            out.println("<br><br>");
            out.println("<a href='ejercicio3'> - Ejercicio N 3</a>");
            out.println("<br><br>");
            out.println("<a href='ejercicio4'> - Ejercicio N 4</a>");
            out.println("<br><br>");
            out.println("<a href='ejercicio5'> - Ejercicio N 5</a>");
            out.println("<br><br>");
            out.println("<a href='ejercicio6'> - Ejercicio N 6</a>");
            out.println("<br><br>");
            out.println("<a href='ejercicio7'> - Ejercicio N 7</a>");
            out.println("<br><br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
