<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title><c:out value="${book.title}" /></title>
</head>
<body>

	<div class="container">
		<div class="row my-5">
					<div class="text-danger" ><h2><c:out value="${book.title}" /></h2></div>
					<div class=" text-end">
						<a href="/books">Back to the shelves</a>
					</div>
				</div>
				<div class="row">
							<h4 class="my-3">
								<span class="user"><c:out value="${book.user.userName}" /></span>
								read <span class="title"><c:out value="${book.title}" /></span>
								by <span class="author"><c:out value="${book.author}" /></span>
							</h4>
							<h5>Here are<c:out value="${book.user.userName}" />'s thoughts:</h5>


				</div>
				<div
					class=" border-top border-bottom border-dark border-2 text-primary ">
					<p><c:out value="${book.thoughts}" /></p>
				</div>

			</div>
</body>
</html>
