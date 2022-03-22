<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>New Category</title>
<style >
form{
width:250px;

}
body{
width:800px;
margin:0 auto;
}
</style>
</head>
<body>

			<div class="row my-5 align-items-center">
				<div>
					<h1>New Category</h1>
				</div>
			</div>
			<form:form action="/categories" method="post"
				modelAttribute="category">
				<div class="mb-3">
					<form:label path="name" for="name" class="form-label">Name:</form:label>
					<div>
						<form:errors class="text-danger" path="name" />
					</div>
					<form:input path="name" type="text" class="form-control" id="name" />
				</div>
				<button class="btn btn-secondary">Create Category</button>
			</form:form>
</body>
</html>
