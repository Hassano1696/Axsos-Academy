<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>New Product</title>
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
				<div><h1 class="my-3">New Product</h1></div>
			<form:form action="/products" method="post" modelAttribute="product">
				<div >
					<form:label path="name" for="name" class="form-label">Name:</form:label>
					<div>
						<form:errors class="text-danger" path="name" />
					</div>
					<form:input path="name" type="text" class="form-control" id="name" />
				</div>
				<div >
					<form:label path="description" for="description" class="form-label">Description:</form:label>
					<div>
						<form:errors class="text-danger" path="description" />
					</div>
					<form:input path="description" type="text" class="form-control"
						id="description" />
				</div>
				<div>
					<form:label path="price" for="price" class="form-label">Price:</form:label>
					<div>
						<form:errors class="text-danger" path="price" />
					</div>
					<form:input path="price" type="number" class="form-control"
						id="price" />
				</div>
				<button class="btn btn-primary mt-2" >Create Product</button>
			</form:form>
</body>
</html>
