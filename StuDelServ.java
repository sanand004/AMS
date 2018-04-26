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
public class StuDelServ extends org.apache.struts.action.Action {

    
     private static final String SUCCESS = "success";

    /* forward name="success" path="" */
    

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
      
      Student s= (Student) form;
       
        
       String sr= s.getStudentRegdNo();
         
         
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx=null;
       try{
           tx= session.beginTransaction();
           Student sn=(Student) session.get(Student.class,sr);
           session.delete(sn);
           out.println("Record deleted");
           tx.commit();
           session.close();
           out.println("Record deleted");
       }
       catch(Exception e)
       {
        out.println(e.toString());   
       }
       return mapping.findForward(SUCCESS);
       
       
    }
    
    }
