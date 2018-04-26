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
public class StuUpdServ extends org.apache.struts.action.Action {

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
        
       
      Student s= (Student) form;
        String srno=s.getStudentRegdNo();
        String sr1=s.getStudentName();
       String sr2=s.getDepartment();
       String sr3=s.getSemester();
       String sr4=s.getBatchBatchId();
       
       
       
       
        
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx=null;
       try{
        tx=session.beginTransaction();
        Student sn=(Student) session.get(Student.class,srno);
            sn.setStudentName(sr1);
            sn.setSemester(sr2);
            sn.setDepartment(sr3);
            sn.setBatchBatchId(sr4);
        
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
