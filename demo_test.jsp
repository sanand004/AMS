<%-- 
    Document   : demo_test
    Created on : 24 Mar, 2018, 11:56:24 AM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            try{
            String rr[] = request.getParameterValues("present");
            for(int i =0; i< rr.length ;i++) out.println(rr[i]);
            }catch(Exception e){}
        %>
            
    </body>
</html>
