<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <div class="login-page">
  <div class="form">
 <h2>LOG IN</h2>
<form  modelAttribute="user" action = "login" method="POST">
      <input type="text" name="uname" placeholder="username" class="validate"/>
      <input type="password" name="upass" placeholder="password" class="validate"/>
      
      <input type="submit" value="LOGIN" />

</form>
      <p class="message"><a href=UserFormForAdd id="reset-box-btn">Don't have an account?</a></p>

      </br></br></br>

  </div>
</div>

</body>
</html>