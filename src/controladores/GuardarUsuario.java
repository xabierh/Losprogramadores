package controladores;

import java.io.IOException;
import java.util.Date;

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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String nombre= request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String nombre_usuario = request.getParameter("nombre_usuario");
		String contrasena = request.getParameter("contrasena");
		String email = request.getParameter("email");
		String fecha_nac = request.getParameter("fecha_nac");
		String fecha_reg = request.getParameter("fecha_reg");
		
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setNombre_usuario(nombre_usuario);
		usuario.setContrasena(contrasena);
		usuario.setEmail(email);
		usuario.setFecha_nac(fecha_nac);
		usuario.setFecha_reg(fecha_reg);
		
		
		
		
		
		UsuarioModelo um = new UsuarioModelo();
		
		// guardar usuario en BBDD
		um.insert(usuario);
		
		
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
		
	}

}
