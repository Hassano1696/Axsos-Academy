<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/index.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>Omikuji</title>
</head>
<body>
<form action="omikuji/process" method="Post">
  <div class="form-group">
    <label for="formGroupExampleInput">Enter a number between 5 and 25:</label>
    <input type="number" min="5" max="25" class="form-control" id="formGroupExampleInput" name="number" placeholder="Number">
  </div>
    <div class="form-group">
    <label for="formGroupExampleInput">Enter the name of any City:</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="city" placeholder="City Name">
  </div>
    <div class="form-group">
    <label for="formGroupExampleInput">Enter the name of any real person:</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="person" placeholder="Person's name	">
  </div>
    <div class="form-group">
    <label for="formGroupExampleInput">Enter professional endeavor or hobby: </label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="hobby" placeholder="Hobby">
  </div>  <div class="form-group">
    <label for="formGroupExampleInput">Enter any type of living thing:</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="animal" placeholder="for example: animal....">
  </div>
    <div class="form-group">
    <label for="exampleFormControlTextarea1">Say something nice to someone:</label>
    <textarea class="form-control" name="nice" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
  
    <button type="submit" class="btn btn-primary">Sign in</button>
  
</form>

</body>
</html>