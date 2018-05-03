<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <title>propietario</title>
    <meta charset="utf-8">
  </head>
  <body>

    <ul>
      <li>
          <a href="../index.jsp">Index</a>
      </li>
    </ul>

    <h1>
      Registro de vivienda
    </h1>

    <form  action="">
      <div>
        <label for="numero">Numero:</label>
        <div>
          <input type="text" id="cedula" placeholder="Digite el numero de la vivienda">
        </div>
      </div>
      <div>
        <label for="tipo">Tipo de vivienda:</label>
        <div>
          <input type="text" id="tipo" placeholder="Digite el tipo de vivienda">
        </div>
      </div>
      <div>
          <label for="responsable">Responsable:</label>
        <div>
          <input type="text" id="responsable" placeholder="Digite la cedula del responsable">
        </div>
      </div>
      <div>
        <label for="observaciones">Observaciones:</label>
        <div>
          <input type="text" id="email" placeholder="Digite las observaciones">
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
