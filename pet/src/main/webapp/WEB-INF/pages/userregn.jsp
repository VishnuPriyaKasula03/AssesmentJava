<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="user/add" method="post" modelAttribute="alias">
	Enter user id	<form:input path="username"/>
	                <form:errors path="username" cssClass="error"></form:errors>
	Enter user name <form:input path="userPassword" />
					<form:errors path="userPassword" cssClass="error"></form:errors>
	Enter password  <form:password path="confirmPassword"/>
					<form:errors path="confirmPassword" cssClass="error"></form:errors>
					<input type="submit" value="SUBMIT">
					<input type="reset" value="RESET">
					
</form:form>
</body>
</html>
