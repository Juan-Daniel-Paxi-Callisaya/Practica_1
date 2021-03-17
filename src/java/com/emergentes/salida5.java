package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida5", urlPatterns = {"/salida5"})
public class salida5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numeroA = request.getParameter("numeroA");
        String numeroB = request.getParameter("numeroB");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet salida5</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h4>Procedimiento</h4>");
            if (numeroA != null && numeroB != null) {
                out.println("SUMA: " + (Integer.parseInt(numeroA) + Integer.parseInt(numeroB)));
                out.println("<br><br>");
                out.println("RESTA : " + (Integer.parseInt(numeroA) - Integer.parseInt(numeroB)));
                out.println("<br><br>");
                out.println("MILTIPLICACION: " + (Integer.parseInt(numeroA) * Integer.parseInt(numeroB)));
                out.println("<br><br>");
                out.println("DIVISION: " + (Integer.parseInt(numeroA) / Integer.parseInt(numeroB)));
                out.println("<br>");
            } else {

            }

            out.println("</body>");
            out.println("</html>");

        }

    }
}
