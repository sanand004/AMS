<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <link href="style.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
      
    </head>
    <body style="background-color:grey">
  
    <center><h1>Attendance Management System</h1></center>
    <%
        String s = request.getParameter("msg");
        if(s != null){
            out.println(s);
        }
        
        %>
    <table width="100%" align="center"><tr><td align="center" height="300">
        <html:form action="LoginServ.do" method="post">
    
            <html:img src="cutm.png" height="250" align="center" width="250"/><br /><br />
            <center>username <html:text property="username" /><html:errors property="username" /> <br /><br />
                password <html:password property="password" /><html:errors property="password" /> <br /><br />
            usertype &nbsp;&nbsp;<html:text property="userType" /><html:errors property="userType" /> <br /><br />
            <html:submit value="submit" /></center> 
        </html:form></td></tr></table>
        
    </body>
</html:html>
    
    
    
    