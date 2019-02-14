<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">

        <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="resources/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  

<title>LISTA DE CONTACTOS</title>
</head>
<body>
   <div align="center">
       <h1>CONTACTOS</h1>
       <h3>
           <a href="/new">Clic para crear un NUEVO CONTACTO</a>
       </h3>

       <table border="1">
       <tr>
           <!-- <th>ID</th> -->
           <th>NOMBRE</th>
           <th>PRIMER APELLIDO</th>
           <th>SEGUNDO APELLIDO</th>
           <th>DNI</th>
           <th>FECHA NACIMIENTO</th>
           <th>TELEFONO</th>
           </tr>

           <c:forEach var="contact" items="${contactList}" varStatus="status">
               <tr>
             
                   <td>${contact.contactName}</td>
                   <td>${contact.contactSurname}</td>
                   <td>${contact.contactLastSurname}</td>
                   <td>${contact.dni}</td>
                   <td>${contact.birthDate}</td>
                   
                   <td>${contact.phones[0].phoneNumber}</td>
                   <td><a href="edit?id=${contact.contactId}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${contact.contactId}">Eliminar</a>
					</td>
                   
         </tr>
           </c:forEach>
       </table>
   </div>
</body>
</html>
