<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
	%>
	hello ji name is :<%=name%>


	<%-- <%
		List<String> friends = (List<String>) request.getAttribute("names");
	%>
 --%>



</body>
</html>