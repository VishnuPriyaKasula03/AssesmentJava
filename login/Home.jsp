<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
<style>
.formdivision {
	width: 500px;
	margin: 0 auto;
}

h1,h3 {
	text-align: center;
}
</style>
<script>
	function validate() {
		var password = document.forms["loginform"]["password"].value;
		if (password.length < 8) {
			window.alert("password length should be greater than 8");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<h1>LOGIN APPLICATION</h1>
	<form name="loginform" method="post" action="./LoginServlet" onsubmit="return validate()">
		<div class="formdivision">
			<table>
				<tr>
					<td><p>ENTER USERNAME</p></td>
					<td><input type="text" name="userName" required="required"></td>
				</tr>
				<tr>
					<td><p>ENTER PASSWORD</p></td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
					<td><a href="./com.view/Registration.jsp">SIGN UP</a></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>





