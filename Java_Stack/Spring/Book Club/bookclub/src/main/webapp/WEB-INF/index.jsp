<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<style>
.split{
display:flex;
}
</style>
</head>
<body>
<div class="split">
						<form:form id="new_user_form"
                            style="width: 500px; margin-left: 140px; border-radius: 12px; margin-top: 130px;margin-bottom: 20px;"
                            class=" fadeinleft bg-white  rounded-5 shadow-5-strong p-5 me-5 " action="/register" method="post" modelAttribute="newUser">
						
                            <!-- Email input -->
                            <div class=" form-outline mb-4">
								<form:errors class="text-danger" path="userName" />
								<form:input type="text" class="form-control" id="userName"
									path="userName" placeholder="Username" />
                            </div>
                            <div class="form-outline mb-4">
								<form:errors class="text-danger" path="email" />
								<form:input type="email" class="form-control" id="email"
									path="email" placeholder="Email" />
                            </div>
                            <div class="form-outline mb-4">
								<form:errors class="text-danger" path="password" />
								<form:input type="password" class="form-control" id="password"
									path="password" placeholder="Password" />
                            </div>
                            <div class="form-outline mb-4">
								<form:errors class="text-danger" path="confirm" />
								<form:input type="password" class="form-control" id="confirm"
									path="confirm" placeholder="Confirm Password" />
                            </div>

						
                                <button type="submit" class="btn btn-primary btn-block">Register</button>
                                
                    </form:form>


                <div style="margin-top: 600px;height: 600px;margin-left: 120px;" class="col  mt-5  ">
                    <div class="col-xl-5 col-md-8">
                       	<form:form style="width: 500px;margin-left: 140px;border-radius: 12px;margin-top: 82px;"
                            class=" fadeinleft bg-white  rounded-5 shadow-5-strong p-5 me-5" action="/login" method="post" modelAttribute="newLogin">
                            <!-- Email input -->
                            <div class="form-outline mb-4">
                                <label for="validationServerUsername" class="form-label">Email address</label>
                                <div class="input-group has-validation">
                                    <input name="email" type="text" class="form-control is-invalid"
                                        id="validationServerUsername"
                                        aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback" required>
                                </div>
                            </div>

                            <!-- Password input -->
                            <div class="form-outline mb-4">
                                <label for="validationServerUsername" class="form-label">Password</label>
                                <div class="input-group has-validation">

                                    <input name="password" type="text" class="form-control is-invalid"
                                        id="validationServerUsername"
                                        aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback" required>
                                </div>
                            </div>

                            <div class="row mb-4">
                                </div>

                                <button style="margin-top: 20px;" type="submit" class="btn btn-primary btn-block">Sign
                                    in</button>
                    </form:form>
                            </div>


                    </div>

</div>

</body>
</html>