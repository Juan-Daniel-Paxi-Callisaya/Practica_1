package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ejercicio1", urlPatterns = {"/ejercicio1"})
public class ejercicio1 extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Ejercicio N 1</h1>");
            out.println("<h4>Usando servlets mostrar la edad de una persona a partir del año de nacimiento. El formulario debe solicitar nombre y año de nacimiento</h4>");
            out.println("<form action='salida1' method='post'>");
            out.println("<label>Nombre:</label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br><br>");
            out.println("<label>Año de nacimiento:</label>");
            out.println("<input type='numer' name='ano'>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("<br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");            
        }
    }
}
