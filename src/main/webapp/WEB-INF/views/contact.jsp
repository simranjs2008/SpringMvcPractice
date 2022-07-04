<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<h1>Fill in contact Details</h1>
		<form action="processform" method="post">
			<label for="email">email Address</label> <input type="email"
				id="email" name="email"><br> <br> <label
				for="username">user name</label> <input type="text" id="username"
				name="username"><br> <br> <label for="password">password</label>
			<input type="password" id="password" name="password"><br>
			<br> <label for="courses">Choose courses:</label> <select name="courses"
				id="courses" multiple>
				<option value="maths">Maths</option>
				<option value="science">Science</option>
				<option value="eco">Eco</option>
				<option value="hindi">Hindi</option>
			</select> <br> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>