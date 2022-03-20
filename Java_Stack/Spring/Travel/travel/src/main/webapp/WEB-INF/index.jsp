<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travels</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class = "container-md-fluid ">
        <div class = "row justify-content-center">
            <div class = "col-7 ">
				<h1 class="text-primary" >All Travels</h1>
                <table class="table  table-striped ">
				  <thead >
				    <tr>
				      <th>Expense</th>
				      <th>Vendor</th>
				      <th>Amount</th>
				      <th>Action</th>
				    </tr>
				  </thead>
				  <tbody>
				    <c:forEach var="travel" items="${travels}">
				    <tr>
				    	<td><a class="text-secondary" href="/travels/${travel.id}"><c:out value="${travel.name}"></c:out></a></td>
				        <td><c:out value="${travel.vendor}"></c:out></td>
				      	<td><c:out value="${travel.amount}"></c:out></td>
				      	<td><a class="text-secondary" href="/travels/${travel.id}/edit">Edit</a><form action="/travels/${travel.id}/delete" method="post">
				      	<input type="hidden" name="_method" value="delete">
				      	<button type="submit" class="btn btn-secondary btn-sm  ">Delete</button></form></td>
				    </tr>
				    </c:forEach>
				  </tbody>
				</table>
    </div>
    </div>
    <div class = "row justify-content-center">
            <div class = "col-7">
    			<h2>Add an Expense</h2>
                <form:form action="/travels/create" method="post" modelAttribute="travel">
                    <div class="form my-3">
                      <form:input path="name" class="form-control" name = "name"  placeholder="Expense Name"/>
                        <form:errors path="name" class = "my-3" />
                    </div>
                    <div class="form mb-3">
                      <form:input path="vendor" type="text" class="form-control" name = "vendor" placeholder="Vendor"/>
                        <form:errors path="vendor" class = "my-3"  />
                    </div>
                    <div class="form mb-3">
                      <form:input path="amount" type="number" class="form-control" name = "amount"  placeholder="Amount"/>
                    <form:errors path="amount" class = "my-3" />
                    </div>
                    <div class="form mb-4">
                      <form:textarea path="description" class="form-control" placeholder="Description" name = "amount"  style="height: 60px"></form:textarea>
                    <form:errors path="description" class = "my-3" />
                    </div>
                    <button type="submit" class="btn btn-secondary">Add</button>
                    </form:form>
    		</div>
    		</div>
    </div>
    		
</body>
</html>
