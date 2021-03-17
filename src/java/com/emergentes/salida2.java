package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida2", urlPatterns = {"/salida2"})
public class salida2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String numero = request.getParameter("numero");
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>salida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3> RESULTADO FACTORIAL</h3>");
            int nro = Integer.parseInt(numero);
            out.println("<P>NUMERO :" + nro + "</P>");
            out.println("<br>");

            int resultado = 1;
            for (int i = 1; i <= nro; i++) {
                resultado *= i;
            }
            out.println("<P> FACTORIAL :" + resultado + "</P>");
            out.println("<br>");
            out.println("<br><br>");
            out.println("<a href='Principal'>Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");

        }
    }
}
