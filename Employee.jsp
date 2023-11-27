<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/RegisterFrom" method="post">
   <table style="with: 80%">
   <tr>
     <td>First Name</td>
     <td><input type="text" name="firstname" /></td>
    </tr>
    <tr>
     <td>Middle Name</td>
     <td><input type="text" name="middlename" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastname" /></td>
    </tr>
   
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
     <td>MobileNo</td>
     <td><input type="text" name="mobileno" /></td>
    </tr>
    <tr>
    <td>Education</td>
     <td><input type="text" name="education" /></td>
    </tr>
    <tr>
    <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
    <td>Salary</td>
     <td><input type="text" name="Salary" /></td>
    </tr>
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>