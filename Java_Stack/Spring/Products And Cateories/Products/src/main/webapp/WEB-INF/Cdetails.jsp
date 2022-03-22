<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title> Categories </title>
<style>
body{
width: 800px;
margin:0 auto;
margin-top:50px;
}
h1{
margin-left:170px;
}
</style>
</head>
<body>

				<div class="col">
					<h1><c:out value="${category.name}" /></h1>
				</div>
			<div class="row">
				<div class="col">
					<h4>Products:</h4>
					<ul>
						<c:forEach var="product" items="${category.products}">
							<li><c:out value="${product.name}" /></li>
						</c:forEach>
					</ul>
				</div>
				<div class="col">
					<form  action="/categories/${category.id}"
						method="post">
						<input type="hidden" name="_method" value="put">
						<div class="mb-3">
							<label for="products" class="form-label">Add a product:</label> <select
								name="id">
								<c:forEach var="product" items="${products}">

									<option value="${product.id}">
										<c:out value="${product.name}" />
									</option>
								</c:forEach>
							</select>
						</div>
						<button class="btn btn-secondary">Add Product</button>
					</form>
				</div>

			</div>
	</div>
</body>
</html>
