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
public class LoginServ extends org.apache.struts.action.Action {

   private String s = "";

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
        Login l = (Login) form;
        
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            Login ln =(Login)session.get(Login.class, l.getUsername());
            if(ln != null){
                if (ln.getPassword().equals(l.getPassword()) && ln.getUserType().equals(l.getUserType())){
                   s = l.getUserType().substring(0,1);
                   
                }else {
                    s = "fail";
                }
            }
            tx.commit();
           //tx =null;
            session.close();
            
           // response.sendRedirect("error.jsp?msg="+s);
        }catch(Exception e){
            response.sendRedirect("error.jsp?msg="+e.toString());
        }
        
        return mapping.findForward(s);
    }
}
