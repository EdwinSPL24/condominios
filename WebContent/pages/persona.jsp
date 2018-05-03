<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <title>persona</title>
    <meta charset="utf-8">
  </head>
  <body>

    <ul>
      <li>
          <a href="../index.jsp">Index</a>
      </li>
    </ul>

    <h1>
      Registro de persona
    </h1>

    <form  action="PersonaServlet" method="post">
      <div>
        <label for="cedula">Cedula:</label>
        <div>
          <input type="text" id="cedula" placeholder="Digite su cedula">
        </div>
      </div>
      <div>
        <label for="nombre">Nombre:</label>
        <div>
          <input type="text" id="nombre" placeholder="Digite su nombre">
        </div>
      </div>
      <div>
          <label for="celular">Celular:</label>
        <div>
          <input type="text" id="celular" placeholder="Digite su numero">
        </div>
      </div>
      <div>
          <label for="direccion">Direccion:</label>
        <div>
          <input type="text" id="direccion" placeholder="direccion">
        </div>
      </div>
      <div>
        <label for="email">E-Mail:</label>
        <div>
          <input type="email" id="email" placeholder="Digite su E-Mail">
        </div>
      </div>
      <div>
        <label for="pass">Contraseña:</label>
        <div>
          <input type="password" id="pass" placeholder="Digite su contraseña">
        </div>
      </div>
      <div>
        <div>
          <button type="submit">Guardar</button>
        </div>
      </div>
    </form>

  </body>
</html>
