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
           <th>Nº TELEFONO</th>
           <th>FICHA COMPLETA</th>
           </tr>

           <c:forEach var="contact" items="${ContactList}" varStatus="status">
               <tr>
                   <td>${contacto.nombre}</td>
                   <td>${contacto.apellido1}</td>
                   <td>${contacto.apellido2}</td>
                   <td>${telefono.telefono}</td>

                   <td><a align="center" href="#">FICHA</a><!--<a href="edit?id=${user.idpersona}">EDITAR</a>
                       <a href="delete?id=${user.idpersona}">BORRAR</a>
                   --></td>
               </tr>
           </c:forEach>
       </table>
   </div>
</body>
</html>
Entrada de mensaje