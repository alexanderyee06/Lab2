<%-- 
    Document   : arithmeticcalculator
    Created on : 15-Sep-2022, 3:55:00 PM
    Author     : alexa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="firstNum">First: </label>
            <input type="number" name="firstNum" id="firstNum"><br>
            <label for="secNum">Second: </label>
            <input type="number" name="secNum" id="secNum"><br>
            
            <button type="submit" name="operation" value="add">+</button>
            <button type="submit" name="operation" value="subtract">-</button>
            <button type="submit" name="operation" value="multiply">*</button>
            <button type="submit" name="operation" value="divide">%</button>
        </form>
        <p>Result: ${result}</p><br>
        <a href="age">Age Calculator</a>
    </body>
</html>
