<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION</title>
<style>
.formdivision{
	width: 500px; 
	margin: 0 auto;
}
h1{
text-align: center;
}
</style>
<script>
function validate() {
	var result;
	var password = document.forms["regform"]["password"].value;
	var age = document.forms["regform"]["age"].value;
	if (password.match(/[a-z]/g) && password.match(/[A-Z]/g)
			&& password.match(/[0-9]/g) && password.match(/[^a-zA-Z\d]/g)
			&& password.length >= 8) {
		result = true;
	}
	else{
		window.alert("Please enter a password with One Capital letter, One LowerCase letter, One Special Character and One Digit and also length should be minimum 8");
		return false;
	}
	if (age >= 18) {
		result = true;
	}
	else{
		window.alert("Age should be 18 and above");
		return false;
	}
	return result;
}
</script>
</head>
<body>
<h1 id="heading">REGISTRATION FORM</h1>
<form name="regform" action="../RegistrationServlet" method="post" onsubmit="return validate()">
		<div class="formdivision">
			<table>
				<tr>
					<td><p>Enter your First name</p></td>
					<td><input type="text" name="firstName" required="required"></td>
				</tr>
				<tr>
					<td><p>Enter your last name</p></td>
					<td><input type="text" name="lastName" required="required"></td>
				</tr>
				<tr>
					<td><p>Enter your User Name(email Id)</p></td>
					<td><input type="email" name="userName" required="required"></td>
				</tr>
				<tr>
					<td><p>Enter password</p></td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><p>Enter Your Age</p></td>
					<td><input type="number" name="age" required="required"></td>
				</tr>
				<tr>
					<td><p>Select the gender</p></td>
					<td rowspan="2"><input type="radio" name="gender" value="male">
						<label for="male">Male</label> <input type="radio" name="gender"
						value="female"> <label for="female">Female</label><br />
						<br /></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</div>

	</form>
</body>
</html>