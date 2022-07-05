<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	    
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/script.js" />"></script>
	
</head>
<style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
<body>
	<img src="<c:url value="/resources/images/200x200.jpg"/>">
	<div>
		<h1>Fill in contact Details</h1>

		<form:form action="processform" modelAttribute="user" method="post">

            Email:
            <form:input path="email" />
            <form:errors path="email" cssClass="error" />

			<br>
			<br> user name:
            <form:input path="username" />
			<form:errors path="username" cssClass="error" />

			<br>
			<br> Password (*):
            <form:input path="password" />
			<form:errors path="password" cssClass="error" />

			<br>
			<br> courses:
            <form:select path="courses" >
				<form:option value="maths"></form:option>
				<form:option value="science"></form:option>
				<form:option value="Hindi"></form:option>
			</form:select>
			<form:errors path="courses" cssClass="text-danger" />
			
			<br>
			<br> Address street:
            <form:input path="address.street" />
			<form:errors path="address.street" cssClass="error" />
			
			<br>
			<br> Address city:
            <form:input path="address.city" />
			<form:errors path="address.city" cssClass="error" />

			<br>
			<br>

			<input type="submit" value="Submit" />

		</form:form>
	</div>
</body>
</html>