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
public class LoginInsServ extends org.apache.struts.action.Action {

      /* forward name="success" path="" */ 
   private static final String SUCCESS = "success";
 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    
    
    
      Login s= (Login) form;
       
        
       String sr= s.getUsername();
       String sr1=s.getPassword();
       String sr2=s.getUserType();
     
       
       
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx=null;
       try{
            tx= session.beginTransaction();
            Login lu=new Login();
            lu.setUsername(sr);
            lu.setPassword(sr1);
            lu.setUserType(sr2);
            
            
            session.save(lu);
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

         
    