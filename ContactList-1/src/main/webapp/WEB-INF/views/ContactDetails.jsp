<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Miiii Maaadreeee</title>
</head>
<body>
 <table>
<tr>
 		<th>NOMBRE</th>
        <th>PRIMER APELLIDO</th>
        <th>SEGUNDO APELLIDO</th>
        <th>DNI</th>
        <th>FECHA NACIMIENTO</th>
</tr>
<tr>
		
		<td>${contact.contactName}</td>
        <td>${contact.contactSurname}</td>
        <td>${contact.contactLastSurname}</td>
        <td>${contact.dni}</td>
        <td>${contact.birthDate}</td>
</tr>
</table>
</body>
</html>