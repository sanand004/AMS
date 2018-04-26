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
        <h1>DELETE STUDENT DETAILS</h1>
        
         <div align="right">
            <a href ="logout.jsp">Logout</a></div>
        <form action="StuDelServ.do" method="post">
             Username<input type="text" name="username" placeholder="username"/><br><br>
           
            <input type="submit" value="Delete"/>
            
        </form>
    </body>
</html>
