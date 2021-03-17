package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida4", urlPatterns = {"/salida4"})
public class salida4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tdinero = request.getParameter("dinero");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<body>");
            out.println("<h4>el cambio de dolar a boliviano es:" + Math.round(Double.parseDouble(request.getParameter("tdinero")) * 6.69) + "</h4>");
            out.println("<h4>el cambio de dolar a boliviano es:" + Math.round(Double.parseDouble(request.getParameter("tdinero")) / 6.69) + "</h4>");
            out.println("</head>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
