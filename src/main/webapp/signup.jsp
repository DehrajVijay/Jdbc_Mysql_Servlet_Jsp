<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
.container {
	width: 30%;
	border: 1px solid black;
	margin: auto;
	padding: 20px;
	Font-size: 20px;
	#myform table tr td input {
	font-size: 14px;
}
</style>

<title>Insert title here</title>
</head>
<body>
<div class="container">
		<h1>My Form</h1>
		<form id="myform" action="register" method="post">
			<table>
				<tr>
					<td>Enter your name:</td>
					<td><input type="text" name="user_name"
						placeholder="Enter here" /></td>
				</tr>
				<tr>
					<td>Enter your password:</td>
					<td><input type="password" name="user_password"
						placeholder="Enter here" /></td>
				</tr>
				<tr>
					<td>Enter your email:</td>
					<td><input type="email" name="user_email"
						placeholder="Enter here" /></td>
				</tr>
				<tr>

					<td>Select your gender:</td>
					<td><input type="radio" name="user_gender" value="male">
						Male &nbsp; &nbsp; <input type="radio" name="user_gender"
						value="female"> Female</td>
				</tr>
				<tr>
					<td>Select your course</td>
					<td><select name="select_course">
							<option value="JAVA">JAVA</option>
							<option value="C">C</option>
							<option value="C++">C++</option>
							<option value="PYTHON">PYTHON</option>
							<option value="DATABASE">DATABASE</option>
							<option value="AWS">AWS</option>
					</select>
				</tr>
				<tr>
					<td style="text-align: right;"><input type="checkbox"
						value="checked" name="condition" /></td>
					<td>Agree terms and conditions.</td>
				<tr>
					<td></td>
					<td><button type="submit">submit</button>
					<td><button type="reset">Reset</button>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>