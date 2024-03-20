package com.ivanarrabe.ejerciciointegradorjspjpa.servlets;

import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Controladora;
import com.ivanarrabe.ejerciciointegradorjspjpa.logica.Equipo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", control.traerEquipos());

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");

        Equipo equipo = new Equipo(nombre, ciudad);
        control.crearEquipo(equipo);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
