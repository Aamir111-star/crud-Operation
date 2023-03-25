<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form action="savereg" method="post">
<pre>
First Name:
<input type="text" name="firstname"/>
Last Name:
<input type="text" name="lastname"/>
Email:
<input type="text" name="email"/>
Password:
<input type="password" name="password"/><br>
<button type="submit">save</button> <button type="reset"> reset</button>
</pre>
</form>

</body>
</html>