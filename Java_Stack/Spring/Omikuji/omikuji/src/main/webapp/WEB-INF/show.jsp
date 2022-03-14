<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Omikuji</title>
<link rel="stylesheet" href="/css/show.css"/>
</head>
<body>





<div class="card w-50">
  <div class="card-body">
<h1>Here's Your Omikuji!</h1>
	<p class="card-text">In <c:out value="${number}"/> years, you will live in
		<c:out value="${city}"/> with <c:out value="${name}"/> as your roommate, selling 
		<c:out value="${hobby}"/> for a living. the next time you see a 
		<c:out value="${animal}"/>, you will have good luck. Also <c:out value="${nice}"/></p>
		<a href="/omikuji">Go Back</a>
  </div>
</div>

</body>
</html>