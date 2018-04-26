/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pc
 */
public class SaveAttendance extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Student sd = null;
         HttpSession hs = request.getSession();
        String s=(String) hs.getAttribute("batch");
       java.util.Date dt1=Calendar.getInstance().getTime();
           Calendar calendar = Calendar.getInstance();
           java.sql.Date sda = new java.sql.Date(calendar.getTime().getTime());
      
           SimpleDateFormat s1=new SimpleDateFormat("dd-MMM-yyyy");
         String today=s1.format(sda);
   
        Batch b = new Batch(s);
  String rr[] = request.getParameterValues("present");
        Studentattend sa=null;
        Studentabsent ca=null;
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        ArrayList absArray = new ArrayList();
        String o = "";
        String a ="";
        boolean found=false;
        Student stu=null;
        ArrayList al = (ArrayList)hs.getAttribute("batchlist");
     for(int i=0; i < al.size(); i++){
            found= false;
           o= ((Student)(al.get(i))).getStudentRegdNo();
           
            for(int j = 0; j<rr.length; j++){
                if(o.equals(rr[j])){
                    
                    found = true;
                    
                }
                
                }
            if (!(found)){
                  absArray.add(o);
                
            }
            
        }
        try{   
           
            
           for(int i =0; i< rr.length ;i++){
                tx= session.beginTransaction();
                StudentattendId sad = new StudentattendId((String)rr[i],s,today);
                sd = new Student((String)rr[i]);
                 sa=new Studentattend(sad,sd, b);
                
                session.save(sa);
                tx.commit();
                tx=null;    
            }
          
            for(int i =0; i< absArray.size() ;i++){
                tx= session.beginTransaction();
                StudentabsentId bad = new StudentabsentId((String)absArray.get(i),s,today);
              
                
                sd = new Student((String)absArray.get(i));
                 ca=new Studentabsent(bad,sd,b);
                
                session.save(ca);
                tx.commit();
                tx=null;
              
            }
            
            session.close();
        
        }catch(Exception e){
                 response.sendRedirect("error.jsp?msg="+e.toString());
            }
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
