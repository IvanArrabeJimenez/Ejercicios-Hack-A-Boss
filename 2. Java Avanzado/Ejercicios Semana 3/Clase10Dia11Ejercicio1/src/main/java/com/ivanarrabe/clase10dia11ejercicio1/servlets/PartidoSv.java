package com.ivanarrabe.clase10dia11ejercicio1.servlets;

import com.ivanarrabe.clase10dia11ejercicio1.logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {
    private Controladora control =new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados",control.traerResultados() );

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            //control.crearPartidos(); Lo tengo comentado porque no soy capaz de cargar la tabla al inicio y la he metido manualmente en la BBDD
            String voto = request.getParameter("voto");
            
            control.votar(voto);
            
            response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
