package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ejercicio4", urlPatterns = {"/ejercicio4"})
public class ejercicio4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Ejercicio 4</h1>");
            out.println("<h4>Usando servlete realizar un programa que permita realizar el cambio te Bolivianos a Dólares y viceversa</h4>");
            out.print("<form action='salida4' method='post'>");
            out.println("<input type='numer' name='tdinero' >");
            out.println("<br><br>");
            out.println("Seleccione dinero a cambiar:");
            out.println("<select>");
            out.println("<option value='dol'>dola</option>");
            out.println("<option value='boli'>boli</option>");
            out.println("</select>");
            out.println("<br><br>");
            out.println("<input type='submit' value='Cambio'>");
            out.println("</body>");
            out.println("</form>");
            out.println("<br>");

        }
    }
}
