<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>


<form action="<%=request.getContextPath()%>/SignUp" method="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    
    <div class="alert alert-success center" role="alert">
				<p>${NOTIFICATION}</p>
			</div>
			
    <p>Please fill in this form to create an account.</p>
    <hr>
   
    <label for="FirstName"><br>FirstName<br></label>
    <input type="text" placeholder="Enter FirstName" name="FirstName" required >
    
    <label for="LastName"><br>LastName<br></label>
    <input type="text" placeholder="Enter LastName" name="LastName" required>


    <label for="UserName"><br>UserName<br></label>
    <input type="text" placeholder="Enter UserName" name="UserName" required>

    <label for="PassWord"><br>Password<br></label>
    <input type="PassWord" placeholder="Enter Password" name="PassWord" required>


<!--     <label> -->
<!--       <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me -->
<!--     </label> -->

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>