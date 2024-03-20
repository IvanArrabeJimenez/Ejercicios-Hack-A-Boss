package com.ivanarrabe.ejerciciointegradorjspjpa.servlets;

import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Controladora;
import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Equipo;
import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Partido;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            // Establecer los resultados en la solicitud para que se muestren en el JSP
            request.setAttribute("resultadosPartidos", control.traerPartidos());

            // Redirigir de vuelta al formulario
            request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Para obtener la fecha en formato localdate
        String fecha = request.getParameter("fecha");

        LocalDate fechaDate = LocalDate.parse(fecha);
        System.out.println(fechaDate);
        //Obtenemos los equipos
        String idEquipo1 = request.getParameter("local");
        String idEquipo2 = request.getParameter("visitante");
        //Obtenemos los resultados
        Integer puntosLocal = Integer.parseInt(request.getParameter("puntosLocal"));
        Integer puntosVisitante = Integer.parseInt(request.getParameter("puntosVisitante"));

        //Creamos el partido
        Partido partido = new Partido();
        partido.setFecha(fechaDate);
        partido.setResultadoEquipo1(puntosLocal);
        partido.setResultadoEquipo2(puntosVisitante);

        //Mandamos los datos
        control.crearPartido(partido, Long.parseLong(idEquipo1), Long.parseLong(idEquipo2));

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
