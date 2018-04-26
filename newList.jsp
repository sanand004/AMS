<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page import="com.myapp.struts.Student"%>

<html>
  <head>   
    <title>List of Students</title>
    <link rel="stylesheet" href="mystyle.css" type="text/css" />
  </head>  
 <body>
     <%
        java.util.ArrayList al = (java.util.ArrayList)request.getAttribute("data");
        Student s = null ;
     %>
     
     

 <h2>Student List</h2>
  <form action="SaveAttendance" method="post">
 <table width="600" cellpadding="3" cellspacing="0">
    
 <tr bgcolor="#dfecf7" style="font-weight:bold">
     <td>Status</td><td>Roll No.</td><td>Name</td>
 </tr>
 <%
        for(int i = 0; i < al.size(); i++){
            s =(Student)al.get(i);
            %>
 <tr>
     <td><input type="checkbox" name="present" value="<%= s.getStudentRegdNo() %>" /> </td>
     <td><%= s.getStudentRegdNo() %></td>
     
     <td><%= s.getStudentName() %></td>
 </tr>
             <% } %>
             <tr>
                 <td><input type="submit" value="Submit"/></td>
             </tr>
        
	
 <tr bgcolor="#dfecf7">
 <td colspan="4">&nbsp;</td>
 </tr>
    
 </table>
  </form>
 <a href="index.jsp">Back</a>
 </body>
</html>
