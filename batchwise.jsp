<%@ page import="java.util.*,com.myapp.struts.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! String regdno;String name;String semester;String department;String BATCH_BATCH_ID;Session session1 = null; %>
<body>
<table width="220" border="1">
<tr><th>REGDNO</th><th>NAME</th></tr>                     
<%
Configuration cf=new Configuration();
cf.configure();
SessionFactory sf = cf.buildSessionFactory();
session1 =sf.openSession();
//Using from Clause
String SQL_QUERY ="from Student where BATCH_BATCH_ID='ba'";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Student e=(Student)it.next();
regdno=e.getStudentRegdNo();
name=e.getStudentName();

%>                  
<tr>
<td><%=regdno%></td>
<td><%=name%></td>

</tr>
<%
}
session1.close();
%>
</table>
</body>
</html>