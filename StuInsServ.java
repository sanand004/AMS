/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import static java.lang.System.out;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pc
 */
public class StuInsServ extends org.apache.struts.action.Action {

       /* forward name="success" path="" */ 
   private static final String SUCCESS = "success";
 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    
    
    
      Student s= (Student) form;
       
        
       String sr= s.getStudentRegdNo();
       String sr1=s.getStudentName();
        String sr4=s.getBatchBatchId();
       Batch bat=new Batch(sr4);
       String sr2=s.getDepartment();
       String sr3=s.getSemester();
      
       
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx=null;
       try{
            tx= session.beginTransaction();
            Student su=new Student();
            su.setStudentRegdNo(sr);
            su.setStudentName(sr1);
            su.setDepartment(sr2);
            su.setSemester(sr3);
            su.setBatch(bat);
            
            session.save(su);
            tx.commit();
            session.close();
            out.println("Record Inserted");
       }
       catch(Exception e){
            out.println(e.toString());   
       }
             
      return mapping.findForward(SUCCESS);

    }
}