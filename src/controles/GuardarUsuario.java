package controles;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.UsuarioModelo;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String inputUsername = request.getParameter("inputUsername");
		String inputPassword = request.getParameter("inputPassword");
		String inputEmail = request.getParameter("inputEmail");
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(inputUsername);
		usuario.setContrase�a(inputPassword);
		usuario.setEmail(inputEmail);
		
		UsuarioModelo um = new UsuarioModelo();
		
		// Guardar usuario en BBDD
		um.insert(usuario);
		
		request.setAttribute("usuario", usuario);
		
		request.getRequestDispatcher("verUsuario.jsp").forward(request, response);
		
		
	}

}
