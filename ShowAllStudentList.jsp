<%@ page import="java.util.*,com.myapp.struts.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! String regdno;String name;String semester;String department;String batchid;Session session1 = null; %>
<body>
<table width="220" border="1">
    <tr><th>REGDNO</th><th>NAME</th><th>DEPARTMENT</th><th>SEMESTER</th></tr>                     
<%
Configuration cf=new Configuration();
cf.configure();
SessionFactory sf = cf.buildSessionFactory();
session1 =sf.openSession();
//Using from Clause
String SQL_QUERY ="from Student";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Student e=(Student)it.next();
regdno=e.getStudentRegdNo();
name=e.getStudentName();
semester=e.getSemester();
department=e.getDepartment();


%>                  
<tr>
<td><%=regdno%></td>
<td><%=name%></td>
<td><%=department%></td>
<td><%=semester%></td>

</tr>
<%
}
session1.close();
%>
</table>
</body>
</html>