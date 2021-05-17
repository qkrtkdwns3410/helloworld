package com.javalec.helloworld;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.sql.rowset.serial.SerialException;


@WebServlet(name = "helloServlet", value = "/hw")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
        response.setContentType("text/html; charset=euc-kr");
        
        // Hello
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + message + "</h1>");
        writer.println("</body></html>");
        
        writer.close();
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
    
    public void destroy() {
    }
}