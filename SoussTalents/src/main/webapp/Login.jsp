<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Please Log in !</h1>
    
        <form method="post" action="LoginServlet">
            <label for='username'>Login :</label>
            <input id='username' name='username' type='text' value='${username}' autofocus /> <br/>
            <label for='password'>Password :</label>
            <input name='password' type='password' value='${password}' /> <br/>
            <br/>
            <input name='btnConnect' type='submit' /> <br/>
        </form>
</body>
</html>