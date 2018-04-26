<%-- 
    Document   : studentinsert
    Created on : 16 Mar, 2018, 12:35:10 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Student</title>
    </head>
    <body>
        <h1>UPDATE STUDENT DETAILS</h1>
        
         <div align="right">
            <a href ="logout.jsp">Logout</a></div>
        <form action="StuUpdServ.do" method="post">
            Student's Registration_No<input type="text" name="studentRegdNo" value="140301csr099" placeholder="Registration no"/><br><br>
             Student's Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="studentName" placeholder="Name"/><br><br>
            Student's Department&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="department" placeholder="Department"/><br><br>
            Student's Semester&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="semester" placeholder="Semester"/><br><br>
            <input type="submit" value="Update"/>
            
        </form>
    </body>
</html>
