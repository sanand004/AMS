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
        <title>Update Student</title>
    </head>
    <body>
        <h1>UPDATE STUDENT DETAILS</h1>
        
         <div align="right">
            <a href ="logout.jsp">Logout</a></div>
        <form action="TeachUpdServ.do" method="post">
            Teacher's Id<input type="text" name="teacherId"  placeholder="TeacherId"/><br><br>
             SubjectSubjectId&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="subjectSubjectId" placeholder="Tecaher's Subject"/><br><br>
            TeacherName&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="teacherName" placeholder="Teachername"/><br><br>
            
            <input type="submit" value="Update"/>
            
        </form>
    </body>
</html>

