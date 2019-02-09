<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>
   <meta charset="UTF-8">


   <spring:url value="resources/css/bootstrap.css" var="bootstrap" />
   <link href="${bootstrap}" rel="stylesheet" />
   <spring:url value="resources/css/custom.css" var="custom" />
   <link href="${custom}" rel="stylesheet" />

   <!-- Static content -->
   <link rel="stylesheet" href="/resources/css/custom.css">


   <title>FORMULARIO DE CONTACTOS</title>
</head>

<body>
   <div align="center">
       <h1>FORMULARIO DE CONTACTOS (add/edit)</h1>
       <table>
       <!-- ESTO ES UN COMENTARIO DE PRUEBA -->
           <form:form action="save" method="post" modelAttribute="contact">
               <form:hidden path="idpersona" />
               <tr>
                   <td>NOMBRE:</td>
                   <td>
                       <form:input path="nombre" />
                   </td>
               </tr>
               <tr>
                   <td>PRIMER APELLIDO:</td>
                   <td>
                       <form:input path="apellido1" />
                   </td>
               </tr>
               <tr>
                   <td>SEGUNDO APELLIDO:</td>
                   <td>
                       <form:input path="apellido2" />
                   </td>
               </tr>
               <tr>
                   <td>DNI:</td>
                   <td>
                       <form:input path="dni" />
                   </td>
               </tr>
               <tr>
                   <td>FECHA DE NACIMIENTO:</td>
                   <td>
                       <form:input path="fechanacimiento" />
                   </td>
               </tr>
               <tr>
                   <td>DIRECCION:</td>
                   <td>
                       <form:input path="direccion" />
                   </td>
               </tr>
               <tr>
                   <td>NUMERO TELEFONO:</td>
                   <td>
                       <form:input path="telefonos" />
                   </td>
               </tr>

               <tr>
                   <td colspan="2" align="center"><input type="submit" value="Guardar Contacto"></td>
               </tr>
               <tr>
                   <td ><a href="/list">ATRAS</a></td>
               </tr>
           </form:form>
       </table>
   </div>

</body>

</html>