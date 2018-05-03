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
      Registro de propietario
    </h1>

    <form  action="">
      <div>
        <label for="numero">Numero:</label>
        <div>
          <input type="text" id="cedula" placeholder="Digite el numero de la vivienda">
        </div>
      </div>
      <div>
          <label for="inquilino">Cedula:</label>
        <div>
          <input type="text" id="inquilino" placeholder="Digite la cedula del propietario">
        </div>
      </div>
      <div>
        <label for="fecha_i">Fecha de inicio:</label>
        <div>
          <input type="date" id="fecha_i" placeholder="Digite las observaciones">
        </div>
      </div>
      <div>
        <label for="responsable">¿Es responsable de la vivienda?</label>
        <div>
          <input type="radio" name="responsable" value="Si">Si<br>
          <input type="radio" name="responsable" value="No">No<br>
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
