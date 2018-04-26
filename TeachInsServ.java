/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

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
public class TeachInsServ extends org.apache.struts.action.Action {

      
      /* forward name="success" path="" */ 
   private static final String SUCCESS = "success";
 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    
    
    
      Teacher t= (Teacher) form;
       
        
       String tr= t.getTeacherId();
       String tr1=t.getSubjectSubjectId();
       Subject sub = new Subject(tr1);
       String tr2=t.getTeacherName();
       String tx=t.getBatchBatchId();
       Batch bat=new Batch(tx);
       
       
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx1;
       tx1 = null;
       try{
            tx1= session.beginTransaction();
            Teacher tu=new Teacher();
            tu.setTeacherId(tr);
            tu.setSubject(sub);
            tu.setTeacherName(tr2);
            tu.setBatch(bat);
            
            session.save(tu);
            tx1.commit();
            session.close();
             response.sendRedirect("error.jsp?msg=checked");
       }
       catch(Exception e){
              response.sendRedirect("error.jsp?msg="+e.toString()); 
       }
             
      return mapping.findForward(SUCCESS);

    }
}

    
