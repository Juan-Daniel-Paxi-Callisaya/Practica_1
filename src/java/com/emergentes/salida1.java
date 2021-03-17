package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida1", urlPatterns = {"/salida1"})
public class salida1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String ano = request.getParameter("ano");
        String edad = request.getParameter("edad");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Salida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Los datos son</h2>");
            out.println("<p>Nombre:           " + nombre + "</p>");
            out.println("<p>Año de nacimiento:           " + ano + "</p>");
            out.println("edad: " + (2021 - Integer.parseInt(ano)  )); 
            out.println("<br><br>");
            out.println("<a href='Principal'>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
