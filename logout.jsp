<html>

    <head>
     
        <title>logout Page</title></head>

<body>
     <%     
         session.removeAttribute("username");
         session.removeAttribute("password");
         session.removeAttribute("usertype");
         session.invalidate();
     %>
<center>
     <h1>You have successfully logged out</h1>
     To login again <a href="login_asm.jsp">click here</a>.
</center>
</body>
</html>
