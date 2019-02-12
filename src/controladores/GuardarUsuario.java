package controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Usuario;
import modelo.dao.UsuarioModelo;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/GuardarUsuario")
public class GuardarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Registro.jsp");
				rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		String inputUsername = request.getParameter("inputUsername");
		String inputPassword = request.getParameter("inputPassword");
		String inputEmail = request.getParameter("inputEmail");
		
		Usuario usuario = new Usuario();
		usuario.setUsuario(inputUsername);
		usuario.setContrasena(inputPassword);
		usuario.setEmail(inputEmail);
		
		UsuarioModelo um = new UsuarioModelo();
		
		// guardar usuario en BBDD
		um.insert(usuario);
		
		request.setAttribute("usuario", usuario);
		
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
		
	}

}
