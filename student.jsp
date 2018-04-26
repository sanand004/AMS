<%@page import="java.lang.Object"%>
<%@ page import="java.util.*,com.myapp.struts.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! String regdno;String pdate;Session session1 = null; %>
<body>
<table width="220" border="1">
<tr><th>REGDNO</th><th>PDATE</th></tr>                     
<%
Configuration cf=new Configuration();
cf.configure();
SessionFactory sf = cf.buildSessionFactory();
session1 =sf.openSession();
//Using from Clause
String vb=request.getParameter("username");
String SQL_QUERY ="from studentattend where STUDENT_REGD_NO='vb'";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Studentattend sa=(Studentattend)it.next();
regdno=sa.getStudentRegdNo();
pdate=sa.getPdate();
%>                  
<tr>
<td><%=regdno%></td>
<td><%=pdate%></td>
</tr>
<%
}
session1.close();
%>
</table>
</body>
</html>