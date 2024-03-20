<%-- 
    Document   : index
    Created on : 20 mar 2024, 16:15:30
    Author     : ivan
--%>

<%@page import="com.ivanarrabe.ejerciciointegradorjspjpa.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.ivanarrabe.ejerciciointegradorjspjpa.logica.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Formulario Persona</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/solar/bootstrap.min.css" integrity="sha384-NCwXci5f5ZqlDw+m7FwZSAwboa0svoPPylIW3Nf+GBDsyVum+yArYnaFLE9UDzLd" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-4">            
            <h2>Formulario Ingreso Equipo:</h2>
            <form action="EquipoSv" method="post" accept-charset="UTF-8">
                <div class="form-group">
                    <label for="nombre">Nombre: </label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="ciudad">Ciudad: </label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>
                <button type="submit" class="btn btn-success">Registrar Equipo</button>
            </form>            
            <hr>
            <h2>Mostrar Equipos Registrados:</h2>
            <form action="EquipoSv" method="get" accept-charset="UTF-8">
                <button type="submit" class="btn btn-danger">Mostrar Equipos</button>
            </form>
            <br>
            <br>
            <!-- Resultados en tabla de los equipos registrados -->
            <div class="results-table">
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
            <h2>Formulario Registro Partido Jugado</h2>
            <form action="PartidoSv" method="post" accept-charset="UTF-8">
                <div class="form-group">
                    <label for="fecha">Fecha: </label>
                    <input type="date" class="form-control" id="fecha" name="fecha">
                </div>
                <div class="form-group">
                    <label for="local">Id Local: </label>
                    <input type="text" class="form-control" id="local" name="local">
                </div>
                <div class="form-group">
                    <label for="fecha">Id Visitante: </label>
                    <input type="text" class="form-control" id="visitante" name="visitante">
                </div>
                <div class="form-group">
                    <label for="ciudad">Puntos Local: </label>
                    <input type="text" class="form-control" id="puntosLocal" name="puntosLocal">
                </div>
                <div class="form-group">
                    <label for="fecha">Puntos Visitante: </label>
                    <input type="text" class="form-control" id="puntosVisitante" name="puntosVisitante">
                </div>
                <button type="submit" class="btn btn-success">Registrar partido</button>
            </form>            
            <hr>
            <h2>Mostrar Partidos concluidos:</h2>
            <form action="PartidoSv" method="get" accept-charset="UTF-8">
                <button type="submit" class="btn btn-danger">Mostrar Partidos</button>
            </form>
            <br>
            <br>            
            <!-- Resultados en tabla de los partidos jugados -->
            <div class="results-table">
                <% if (request.getAttribute("resultadosPartidos") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>                           
                            <th>Fecha</th>
                            <th>Local</th>
                            <th>Puntos Local</th>
                            <th>Puntos Visitante</th>
                            <th>Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultadosPartidos")) {%>
                        <tr>
                            <td><%= partido.getId()%></td>
                            <td><%= partido.getFecha()%></td>
                            <td><%= partido.getEquipo1().getNombre()%></td>
                            <td><%= partido.getResultadoEquipo1()%></td>
                            <td><%= partido.getResultadoEquipo2()%></td>
                            <td><%= partido.getEquipo2().getNombre()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
