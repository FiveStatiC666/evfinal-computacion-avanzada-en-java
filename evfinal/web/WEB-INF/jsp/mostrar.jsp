<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mostrar Datos</h1>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>fecha</th>
                    <th>nombre</th>
                    <th>edad</th>
                    <th>peso</th>
                    <th>altura</th>
                    <th>imc</th>
                </tr>

                <tr>
                    <td>${datos.fecha}</td>
                    <td>${datos.peso}</td>
                    <td>${datos.altura}</td>
                </tr>
            </thead>
        </table>
    </body>
</html>
