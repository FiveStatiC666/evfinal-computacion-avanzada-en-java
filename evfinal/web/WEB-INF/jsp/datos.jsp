<%-- 
    Document   : datos
    Created on : 12 may 2023, 18:35:09
    Author     : crome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Obtener datos</title>
    </head>
    <body>
        <h1>Ingresar Datos</h1>
            fecha<input type="text" name="fecha" ><br>
            peso<input type="text" name="peso" required><br>
            altura<input type="text" name="altura" required><br>
            <input type="submit" value="Calcular IMC"><br>
            <a href="mostrar">Mostrar Datos</a>
    </body>
</html>
