<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<h1>All Books</h1>
<div class="container mt-5">
      <div class="row">
        <div class="col-6 offset-3 border border-2 border-dark p-3">
          <table class="table-dark ">
        
              <tr>
                <th >ID</th>
                <th >Title</th>
                <th>description</th>
                <th >Language</th>
                <th >#Pages</th>
              </tr>
            	<c:forEach var="book" items="${books}">
              <tr>
                <td><c:out value="${book.id}"></c:out></td>
                <td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
                <td><c:out value="${book.description}"> </c:out></td>
                <td><c:out value="${book.language}"> </c:out></td>
                <td><c:out value="${book.numberOfPages}"> </c:out></td>
                </c:forEach>
            
          </table>
        </div>
      </div>
    </div>

</body>
</html>
