<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<h3>${MyRequest}</h3>
	<p>Item</p>
	<p> name:${Item1.name} </p>
	<p> price:${Item1.price} </p>
	<p>User</p>
	<p>name:${User1.name}</p>
	<p>age:${User1.age}</p>
	
	<h3>Map</h3>
	<p>${userMap.user1.name}</p>
	<p>${userMap["user2 Ken"].name}</p>
	
	<c:forEach var="myUser" items = "${userList}">
		<p>name:${myUser.name }</p>
		<p>age:${myUser.age }</p>
	</c:forEach>
</body>
</html>