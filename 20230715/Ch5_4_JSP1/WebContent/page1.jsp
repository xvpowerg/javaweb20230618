<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<h2>Page1Jsp</h2>
	Request:<%=request.getAttribute("msg")	%>
	
	<h3><%=application.getAttribute("appValue") %></h3>
</body>
</html>