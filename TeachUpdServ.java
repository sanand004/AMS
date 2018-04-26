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
public class TeachUpdServ extends org.apache.struts.action.Action {

     /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
        
       
      Teacher s= (Teacher) form;
        String srno=s.getTeacherId();
        String sr1=s.getSubjectSubjectId();
       String sr2=s.getTeacherName();
       String sr3=s.getBatchBatchId();
       
       
       
       
        
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx=null;
       try{
        tx=session.beginTransaction();
        Teacher sn=(Teacher) session.get(Teacher.class,srno);
            sn.setTeacherName(sr2);
            sn.setSubjectSubjectId(sr1);
            sn.setBatchBatchId(sr3);
        
        session.update(sn);
        tx.commit();
        session.close();
        response.sendRedirect("error.jsp?msg=checked");
    }
       catch(Exception e){
            response.sendRedirect("error.jsp?msg="+e.toString());
           

       }
       return mapping.findForward(SUCCESS);
}
}