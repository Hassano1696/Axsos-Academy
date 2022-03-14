<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css"/>

<title>Insert title here</title>
</head>
<body>
    <div class="whole_page" style="width: 1200px;  margin: 0 auto;">


			Your Gold: <input class="upper" type="text" value='${gold}' />

        <div  style="display: flex; margin: 100px auto ; justify-content: space-between;"  class="flex">
    
            <form style="height: 260px ; width: 260px; border: solid black 2px;" action="find" method="post">
                <input type="hidden" name="which_form" value="Farm">
                <h2>Farm</h2>
                <h5>(Ears from 10-20 Golds)</h5>
                
                
                <p><input type="submit" value='Find Gold!' class="btn btn-primary"></p>
    
            </form>
            
            
            
            <form style="height: 260px ; width: 260px; border: solid black 2px;" action="find" method="post">  
                <input type="hidden" name="which_form" value="Cave">
                <h2>Cave</h2>
                <h5>(Earns from 5-10 Golds)</h5>
                <p><input type="submit" value='Find Gold!' class="btn btn-primary"></p>
            </form>
    
    
    
            <form style="height: 260px ; width: 260px; border: solid black 2px;" action="find" method="post">
                <input type="hidden" name="which_form" value="House">
                <h2>House</h2>
                <h5>(Earns from 2-5 Golds)</h5>
                <p><input type="submit" value='Find Gold!' class="btn btn-primary"></p>
            </form>
            
            
            
            
            <form style="height: 260px ; width: 260px; border: solid black 2px;" action="find" method="post">
                <input type="hidden" name="which_form" value="Quest">
                <h2>Quest</h2>
                <h5>(Earns/Takes 0-50 Golds)</h5>
                <p> <input type="submit" value='Fing Gold!' class="btn btn-primary"></p>
    
            </form>
        </div>
        <div style="width: 1200px;">


		<p>Activities:</p>
		<div class="row">
			<div class="messages border border-1 border-dark">${messages}</div>
		</div>
        
        
        </div>
    </div>


</body>
</html>