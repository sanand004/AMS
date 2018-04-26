package com.myapp.struts;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


/**
 *
 * @author Pc
 */
public class BatchWiseServ extends org.apache.struts.action.Action {

   private static final String SUCCESS = "success";
 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
          
        
            
        PrintWriter out=response.getWriter();
       
            String bi=request.getParameter("batchid");
    
     try{
           
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project","project");
           
            PreparedStatement stmt=con.prepareStatement("select * from student where BATCH_BATCH_ID=?");
          
            stmt.setString(1,bi);
          
            ResultSet rs= stmt.executeQuery();
            ArrayList arr= new ArrayList();
            Student s = null;
           
            //out.println("<table width=220 border=1>");
            //out.println("<tr><th>NAME</th></tr>");
            while(rs.next()){
                //System.out.println("ok-123");
                 s = new Student();
                 s.setStudentRegdNo(rs.getString("student_regd_no"));
                 s.setStudentName(rs.getString("student_name"));
                 
                //out.println("<tr>");
                //out.println("<td>"+sn+"</td>");
                //out.println("</tr>");
              
               // out.println("</table>"); 
                  
                arr.add(s);
                //out.println("name:" +sn);
            }
            con.close();
            request.setAttribute("data", arr);
            
            response.sendRedirect("newList.jsp");
           
        }
        catch(Exception e){
            response.sendRedirect("error.jsp?msg="+e.toString());
            
            
        }
        
      return mapping.findForward(SUCCESS);

    }
}

    