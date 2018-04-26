<%@ page import="java.util.*,com.myapp.struts.*,org.hibernate.*,org.hibernate.cfg.*" %>
<%! String teacherId;String subjectSubjectId;String teacherName;Session session1 = null; %>
<body>
<table width="220" border="1">
<tr><th>Teacher_Id</th><th>Teacher's_Subject_Id</th><th>Teacher's_Name</th></tr>                     
<%
Configuration cf=new Configuration();
cf.configure();
SessionFactory sf = cf.buildSessionFactory();
session1 =sf.openSession();
//Using from Clause
String SQL_QUERY ="from Teacher";
Query query = session1.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Teacher t=(Teacher)it.next();
teacherId=t.getTeacherId();
subjectSubjectId=t.getSubjectSubjectId();
teacherName=t.getTeacherName();

%>                  
<tr>
<td><%=teacherId%></td>
<td><%=subjectSubjectId%></td>
<td><%=teacherName%></td>
</tr>
<%
}
session1.close();
%>
</table>
</body>
</html>