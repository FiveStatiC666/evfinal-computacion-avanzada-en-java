<%-- 
    Document   : crearCuenta
    Created on : 12 may 2023, 17:58:10
    Author     : crome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Cuenta</title>
    </head>
    <body>
        <form method="post">
            <h1>Crear Cuenta</h1>
            nombre<input type="text" name="nombre" required><br>
            sexo<input type="text" name="sexo" required><br>
            edad<input type="text" name="edad" required><br>
            usuario<input type="text" name="usuario" required><br>
            contraseña<input type="password" name="password" required><br>
            <input type="submit" value="Crear Cuenta"><br>
            <a href="index">Volver a inicio de sesion</a>
        </form>
    </body>
</html>
