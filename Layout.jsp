<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title><tiles:getAsString name="title" ignore="true"/></title>
	<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<body style="padding:0.5;margin: 0;">

<table width="800" height="620" align="center">
<tr>
<td><tiles:insert attribute="header"/></td>
</tr>
<tr>
<td><tiles:insert attribute="body"/></td>
</tr>
<tr>
<td><tiles:insert attribute="footer"/></td>
</tr>
</table></body></html>
