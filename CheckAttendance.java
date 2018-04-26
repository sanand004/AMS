/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Pc
 */
public class CheckAttendance extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  PrintWriter out = response.getWriter();
        
           String cb=request.getParameter("username");
         
           out.println("<table width=220 border=1>");
           out.println("<tr>");
           out.println("<th>REGDNO</th><th>BATCHID</th><th>PDATE</th>");
           out.println("</tr>");
     //RequestDispatcher rd = null;
     try{
           
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","project");
           
            PreparedStatement stmt=con.prepareStatement("select * from studentattend where STUDENT_REGD_NO=?");
          
            stmt.setString(1,cb);
          
            ResultSet rs= stmt.executeQuery();
            //ArrayList arr= new ArrayList();
            Studentattend df=null;
           
            //out.println("<table width=220 border=1>");
            //out.println("<tr><th>NAME</th></tr>");
            while(rs.next()){
                //System.out.println("ok-123");
                 //df = new Studentattend();
                 //df.setStudentRegdNo(rs.getString("student_regd_no"));
                 //df.setBatchid(rs.getString("batchid"));
                 //df.setPdate(rs.getString("pdate"));
                 String regdno=rs.getString("student_regd_no");
                 String batchid=rs.getString("batchid");
                 String pdate=rs.getString("pdate");
                //out.println("<tr>");
                //out.println("<td>"+sn+"</td>");
                //out.println("</tr>");
              
               // out.println("</table>"); 
                  
               // arr.add(df);
                 out.println("<tr>");
                 out.println("<td>"+regdno+"</td>");
                 out.println("<td>"+batchid+"</td>");
                 out.println("<td>"+pdate+"</td>");
                 
                 out.println("</tr>");
                //out.println("name:" +df.getStudentRegdNo());
                //out.println("batchid" +df.getBatchid());
                //out.println("pdate" +df.getPdate());
            }
            con.close();
           
           
        }
        catch(Exception e){
          response.sendRedirect("error.jsp?msg="+e.toString());
            
            
        }
     //rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
