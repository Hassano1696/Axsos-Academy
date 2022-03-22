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
<title></title>
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
				<div>
					<h1>
						<c:out value="${product.name}" />
					</h1>
				</div>
			<div>
					<h4>Categories:</h4>
					<ul>
						<c:forEach var="category" items="${product.categories}">
							<li><c:out value="${category.name}" /></li>
						</c:forEach>
					</ul>
				</div>
				<div class="col">
					<form class="float-end" action="/products/${product.id}"
						method="post">
						<input type="hidden" name="_method" value="put">
						<div>
							<label for="products" class="form-label">Add a category:</label>
							<select name="id">
								<c:forEach var="category" items="${categories}">
									<option value="${category.id}">
										<c:out value="${category.name}" />
									</option>
								</c:forEach>
							</select>
						</div>
						<button class="btn btn-secondary">Add Category</button>
					</form>
				</div>
</body>
</html>
