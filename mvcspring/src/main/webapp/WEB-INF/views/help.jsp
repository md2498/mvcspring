<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>my name is mukesh</h1>
	<h2>this id help page</h2>

	<%-- <% String name=(String)request.getAttribute("name"); %>
<h1>name from modelandView : <%=name %></h1> --%>

	<h1>name is : ${name}</h1>
	<c:forEach var="id" items="${ids}">
	<h1><c:out value="${id }"></c:out></h1>
	</c:forEach>


</body>
</html>