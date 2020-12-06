<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="addStudent">
    <input type ="text" name ="aid"><br>
    <input type ="text" name ="aname"><br>
    <input type ="text" name ="acourse"><br>
    
   <br>
             <input type ="submit"value="Enter">
         </form>
         <br>
         ${msg}
 
</body>
</html>