<%@page import="model.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PROFILE</title>
<style>
.formdivision{
	width: 500px; 
	margin: 0 auto;
}
</style>
</head>
<body>
	<%
		UserDetails user = (UserDetails) session.getAttribute("user");
	%>
	<div class="formdivision">
		<table>
		<tr>
		<td></td>
		<td><a href="./LogoutServlet">logout</a></td>
		</tr>
			<tr>
				<td><h1>
						WELCOME
						<%
					out.print(" "+user.getFirstName()+"    ");
				%>
					</h1></td>
			</tr>
			<br>
			<tr>
				<td>FIRST NAME</td>
				<td>
					<%
						out.print(user.getFirstName());
					%>
				</td>
			</tr>
			<br>
			<tr>
				<td>LAST NAME</td>
				<td>
					<%
						out.print(user.getLastName());
					%>
				</td>
			</tr>
			<br>
			<tr>
				<td>GENDER</td>
				<td>
					<%
						out.print(user.getGender());
					%>
				</td>
			</tr>
			<br>
			<tr>
				<td>AGE</td>
				<td>
					<%
						out.print(user.getAge());
					%>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>