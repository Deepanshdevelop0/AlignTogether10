/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.struts;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Deepanshu
 */
public class ActionServlets extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
        System.out.println("this is get Method........");
        
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        
        out.println("<h1>Hello World Printed After a Lot Blood and Sweat....</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is post method....");
    }
    
}
