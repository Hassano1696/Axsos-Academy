<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Expense</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
				  <c:forEach var="item" items="${expenses}">
				    <tr>
				      <th scope="row"><c:out value="${item.name}"></c:out></th>
				      <td><c:out value="${item.vendor}"></c:out></td>
				      <td><c:out value="${item.amount}"></c:out>$</td>
				      <td><a href="/expenses/edit/${item.id}">edit</a></td>
				    </tr>
				    </c:forEach>
				    <div style="display:flex;justify-content: space-around">
				    <h1 style="color:#38761d">Edit Expense</h1>
				    <a href="/expenses">Go back</a>
				    </div>
				
		<div class = "row justify-content-center">
			<div class = "col-5 ">
				<form:form action="/expenses/edit/${expense.id}" method="post" modelAttribute="Expense">
				<input type="hidden" name="_method" value="put">
					<div class="form my-3">
					  <form:input path="name" class="form-control" name = "expense" id="floatingInput" placeholder="name@example.com"/>
						<form:errors path="name" class = "my-3" style="color: red;"/>
					</div>
					<div class="form mb-3">
					  <form:input path="vendor" type="text" class="form-control" name = "vendor" id="floatingInput" placeholder="name@example.com"/>
						<form:errors path="vendor" class = "my-3"  style="color: red;"/>
					</div>
					<div class="form mb-3">
					  <form:input path="amount" type="number" class="form-control" name = "amount" id="floatingInput" placeholder="name@example.com"/>
					<form:errors path="amount" class = "my-3" style="color: red;"/>
					</div>
					<div class="form mb-4">
					  <form:textarea path="description" class="form-control" placeholder="Leave a comment here" name = "amount" id="floatingTextarea2" style="height: 100px"></form:textarea>
					<form:errors path="description" class = "my-3" style="color: red;"/>
					</div>
					<button type="submit" class="btn btn-outline-warning align-self-center">Submit</button>
				</form:form>
			</div>
		</div>
				
	</div>
</body>
</html>
