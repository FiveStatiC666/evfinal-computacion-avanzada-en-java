<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evidencia Final</title>
    </head>

    <body>
        <form action="controlador" method="post">
            <h1>Iniciar sesion</h1>
            usuario<input type="text" name="usuario" required><br>
            contraseña<input type="password" name="password" required><br>
            <input type="submit" value="Iniciar Sesion"><br>
            <a href="crearCuenta">CrearCuenta</a>
        </form>
    </body>
</html>
