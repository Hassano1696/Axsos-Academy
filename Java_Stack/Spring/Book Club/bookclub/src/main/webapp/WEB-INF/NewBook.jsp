<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Add a new Book</title>
<style type="text/css">
body{
margin-top:150px;
margin-left:500px;
}
</style>

</head>
<body>
	<div class="container-flueid">

		<div class="row ">
			<div class="col-6">
				<div class=" d-flex justify-content-between">
					<h5 class="text-warning">Add a Book to Your Shelf!</h5>
					<a href="/books">Back to the shelves</a>
				</div>
				<div class="row">
					<div class="col text-start">

						<form:form action="/books" method="post" modelAttribute="newBook">
							<div class="mb-3">
								<form:errors class="text-danger" path="title" />
								<form:input type="text" class="form-control" id="title"
									path="title" placeholder="Title" />
							</div>
							<div class="mb-3">
								<form:errors class="text" path="author" />
								<form:input type="text" class="form-control" id="author"
									path="author" placeholder="Author" />
							</div>

							<div class="mb-3">
								<form:errors class="text-danger" path="thoughts" />
								<form:textarea class="form-control" id="thoughts"
									path="thoughts" placeholder="Add your thoughts" rows="3"></form:textarea>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form:form>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>
</html>
