<%-- 
    Document   : index
    Created on : 19 mar 2024, 20:38:54
    Author     : ivan
--%>

<%@page import="java.util.List"%>
<%@page import="com.ivanarrabe.clase10dia11ejercicio1.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Formulario Votaciones a Partidos</title>
        <!-- Agregar estilos de Bootstrap -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/darkly/bootstrap.min.css" integrity="sha384-nNK9n28pDUDDgIiIqZ/MiyO3F4/9vsMtReZK39klb/MtkZI3/LtjSjlmyVPS3KdN" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Votación</h2>
            <form action="PartidoSv" method="Post">
                <!--En este formulario vamos a crear el RadioButton con su botón de "Votar" -->
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="voto" id="partidoA" value="Partido A">
                    <label class="form-check-label" for="partidoA">
                        Partido A
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="voto" id="partidoB" value="Partido B">
                    <label class="form-check-label" for="partidoB">
                        Partido B
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="voto" id="partidoC" value="Partido C">
                    <label class="form-check-label" for="partidoC">
                        Partido C
                    </label>
                </div>
                <hr>
                <button type="submit" class="btn btn-primary">Votar</button>
            </form>
            <hr>
            <!--En este formulario creamos el botón de "Mostrar los resultados"-->
            <form action="PartidoSv" method="get">                
                <button type="submit" class="btn btn-secondary">Mostrar resultados</button>
            </form>
        </div>
        <br>
            <br>
            <!-- Resultados en tabla -->
            <div class="results-table">
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad de votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%= partido.getNombrePartido()%></td>
                            <td><%= partido.getCantidadVotos()%></td>                            
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
