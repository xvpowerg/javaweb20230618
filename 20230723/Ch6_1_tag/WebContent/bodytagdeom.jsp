<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="h" uri="/WEB-INF/customtag.tld" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>

<%
	String message = "Hello World";
	pageContext.setAttribute("message", message);
%>
<body>
	<div>
		<h:mybody message="${message}">
			<h2 style="font-size:48px;color:red">�A�n!!${message}</h2>
		</h:mybody>	
	</div>
</body>
</html>