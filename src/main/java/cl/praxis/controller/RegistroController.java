package cl.praxis.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.dao.UsuariosDAOImpl;
import cl.praxis.model.UsuarioDTO;
import cl.praxis.dao.IUsuariosDAO;

/**
 * Servlet implementation class RegistroController
 */
@WebServlet("/Registro")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistroController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUsuariosDAO pDAO = new UsuariosDAOImpl();
		if (!pDAO.verificaEmail(request.getParameter("correo"))) {
			Date create=new Date();
			Date update=new Date();
						
			
			pDAO.create(new UsuarioDTO( request.getParameter("correo"),request.getParameter("nick"),
					request.getParameter("nombre"),request.getParameter("password"),
					Integer.parseInt(request.getParameter("peso")),create,update));
			
		}
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
