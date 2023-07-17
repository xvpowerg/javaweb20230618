<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@page import="java.util.ArrayList" %>
<%@page import="tw.com.beans.Item" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<ol>
	<%
		ArrayList<Item> list = 
		(ArrayList<Item>)session.getAttribute("itemList");
	for (Item it : list){	
	%>
			<li><%=it.getId()%>:<%=it.getName()%></li>		
	<%} %>
</ol>	
</body>
</html>