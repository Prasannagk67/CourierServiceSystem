<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Design by foolishdeveloper.com -->
    <title>Register</title>
 
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <!--Stylesheet-->
    <style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #080710;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
form{
    height: 1000px;
    width: 600px;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 48%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #ffffff;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 42px;
    text-align: center;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}
::placeholder{
    color: #e5e5e5;
}
button{
    margin-top: 50px;
    width: 100%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
.social{
  margin-top: 30px;
  display: flex;
}
.social div{
  background: red;
  width: 150px;
  border-radius: 3px;
  padding: 5px 10px 10px 5px;
  background-color: rgba(255,255,255,0.27);
  color: #eaf0fb;
  text-align: center;
}
.social div:hover{
  background-color: rgba(255,255,255,0.47);
}
.social .fb{
  margin-left: 25px;
}
.social i{
  margin-right: 4px;
}

    </style>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form action=Controller>
        <h3>Login Here</h3>

        <label for="username">UserID</label>
        <input type="text"name="userid"placeholder="User Id">

        <label for="password">Full Name</label>
        <input type="text"name="uname"placeholder="Full Name">
        
                <label for="username">Password</label>
        <input type="text"name="pwd"placeholder="password">

        <label for="password">Repeate Password</label>
        <input type="password" name="re_pass"placeholder="Repeat password">
        
                <label for="username">Email</label>
        <input type="text"name="email"placeholder="Email">

        <label for="password">Address</label>
        <input type="text"name="address"placeholder="Address">
        
                <label for="password">Mobile Number</label>
        <input type="text"name="mobilenumber"placeholder="MobileNumber" >

        <input type="submit" name="action" value="Register"/>
        <div class="social">
          Already a member ?<br>
          <a href="Login.html">Click Here</a>
        </div>
    </form>
</body>
</html>





<!-- 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Register.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<form action=Controller>


<div class="center">
	<h1>Register</h1>	
		<div class="txt_field">
	<input type="text"name="userid"placeholder="User Id" width="20"required/>
	</div>
	<div class="txt_field">
	<input type="text"name="uname"placeholder="Full Name" width="20"required/>
	</div>
	<div class="txt_field">
	<input type="text"name="pwd"placeholder="password" width="20"required/> <br>
	</div>
	<div class="txt_field">
	<input type="password" name="re_pass"placeholder="Repeat password"width="20"required />
	</div>
	<div class="txt_field">
	<input type="text"name="email"placeholder="Email" width="20"required/>
	</div>
	<div class="txt_field">
	<input type="text"name="address"placeholder="Address" width="20"required/>
	</div>
	<div class="txt_field">
	<input type="text"name="mobilenumber"placeholder="MobileNumber" width="20"required/>
	</div>
	<input type="submit" name="action" value="Register"/>
	<div class="signup_link">
	 Already a member? <a href="Login.html">Click Here</a>
	</div>
	</form>
</div>
</body>
</html>
 -->