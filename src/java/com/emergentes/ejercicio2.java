package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio2", urlPatterns = {"/ejercicio2"})
public class ejercicio2 extends HttpServlet {

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
            out.println("<h2><center>Ejercicio 2 </h2>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action ='salida2' method ='post'>");
            out.println("<label>Con servlets crear un programa para leer un número y calcular su factorial</label>");
            out.println("<br><br>");
            out.println("<h4>numero </h4>");
            out.println("<input type='text' name='numero'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
