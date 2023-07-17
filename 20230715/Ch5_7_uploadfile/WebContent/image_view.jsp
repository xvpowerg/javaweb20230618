<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ page import="java.util.List" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<%
		List<String> pathList =(List<String>)request.getAttribute("imageList");
		for(String p : pathList){
	%>
		<div>
				<img width="30%" height="30%" src="/test_image/<%=p%>">
		
		</div>
	
	<%} %>
</body>
</html>