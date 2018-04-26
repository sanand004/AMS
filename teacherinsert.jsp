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
        <h1>INSERT TEACHER DETAILS</h1>
        
         <div align="right">
            <a href ="logout.jsp">Logout</a></div>
        <form action="TeachInsServ.do" method="post">
            TEACHER_ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="teacherId" placeholder="TeacherId"/><br><br><br><br>
            TEACHER'S SUBJECT ID <input type="text" name="subjectSubjectId" placeholder=" Subject_Name"/><br><br><br><br>
            TEACHER'S NAME &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="teacherName" placeholder="Teacher Name"/><br><br><br><br>
            Batch_Id <input type="text" name="batchBatchId" placeholder=" Batchid"/><br><br><br><br>
            <input type="submit" value="Save"/>
            
        </form>
    </body>
</html>
