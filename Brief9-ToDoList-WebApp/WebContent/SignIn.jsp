<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>




<form action="SignIn" method="post" style="border:3px solid #1670C1">
  <div class="container">
    <h1>Sign In</h1>
    <p>Please insert Username and password.</p>
    <hr>
   

    <label for="UserName"><br>UserName<br> </label>
    <input type="text" placeholder="Enter UserName" name="UserName" required>
     <br>

    <label for="PassWord"><br>Password<br></label>
    <input type="PassWord" placeholder="Enter Password" name="PassWord" required>
    
     <br>
      <br>


    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign In</button>
    </div>
  </div>
</form>


</body>
</html>