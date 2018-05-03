package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entities.Persona;
import model.factories.MySqlFactoryDao;

/**
 * Servlet implementation class PersonaServlet
 */
@WebServlet("/PersonaServlet")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("Esta mamada funciona");
		
			Persona myP =new Persona();
			myP.setDocumento(request.getParameter("cedula"));
			myP.setNombre(request.getParameter("nombre"));
			myP.setCelular(request.getParameter("calular"));
			myP.setDireccion(request.getParameter("direccion"));
			myP.setEmail(request.getParameter("email"));
			myP.setClave(request.getParameter("pass"));

			MySqlFactoryDao myF=new  MySqlFactoryDao();
			myF.getPersonaDao().insert(myP);
			
	}

}