<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PatientSuccessForm</title>
</head>
<style>
body {
	background-color: pink;
}
</style>
<center>
	<h3>Patient Enrollment Success Form</h3>
	<table border="1">
		<tr>
			<th>Patient Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Password</th>
			<th>Date Of Birth</th>
			<th>Email</th>
			<th>Contact Number</th>
			<th>State</th>
			<th>Insurance Plan</th>
		</tr>
		<c:forEach items="${patientList}" var="patient">
			<tr>
				<td>${patient.id}</td>
				<td>${patient.fname}</td>
				<td>${patient.lname}</td>
				<td>${patient.password}</td>
				<td>${patient.dob}</td>
				<td>${patient.email}</td>
				<td>${patient.contact_number}</td>
				<td>${patient.state}</td>
				<td>${patient.insurance_plan}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="redirect">Home</a>
</center>
</body>
</html>