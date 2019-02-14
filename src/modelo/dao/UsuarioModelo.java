package modelo.dao;

import java.util.ArrayList;


public class UsuarioModelo<Usuario> {
	public ArrayList<Usuario> selectTodos() {
		return null;
		// TODO devuelveun array listconla lista deusuariosde la BBDD
		/**
		 * SELECT * FROM `usuarios`
		 */

	}

	public void insertUsuario(Usuario usuario) {
		// TODO
		/**
		 * INSERT INTO `usuarios`(`usuario`, `nombre`, `apellido`, `fechaNacimiento`,
		 * `fechaRegistro`, `email`, `contraseña`) VALUES
		 * ('value-1','value-2','value-3','value-4','value-5','value-6','value-7')
		 */
	}

	public void deleteUsuario(Usuario usuario) {
		// TODO
		/**
		 * DELETE FROM `usuarios` WHERE 0
		 */
	}

	public void updateUsuario(Usuario usuario) {
		// TODO
		/**
		 * UPDATE `usuarios` SET
		 * `usuario`='value-1',`nombre`='value-2',`apellido`='value-3',`fechaNacimiento`='value-4',`fechaRegistro`='value-5',`email`='value-6',`contraseña`='value-7'
		 * WHERE 1
		 */
	}

	public void registradoAntes(Usuario usuario) {
		// TODO
		/**
		 * SELECT `usuario`, `nombre`, `apellido`,`fechaRegistro` FROM `usuarios` WHERE
		 * fechaRegistro <= '2018/12/31'
		 */
	}

	public void menorDe18(Usuario usuario) {
		// TODO
		/**
		 * SELECT usuarios.nombre,usuarios.apellido,
		 * YEAR(CURDATE())-YEAR(usuarios.fechaNacimiento) +
		 * IF(DATE_FORMAT(CURDATE(),'%m-%d') >
		 * DATE_FORMAT(usuarios.fechaNacimiento,'%m-%d'), 0 , -1 )AS
		 * `EDAD_ACTUAL`,usuarios.email FROM usuarios
		 * 
		 * //SELECT usuarios.nombre,usuarios.apellido,
		 * YEAR(CURDATE())-YEAR(usuarios.fechaNacimiento) +
		 * IF(DATE_FORMAT(CURDATE(),'%m-%d') >
		 * DATE_FORMAT(usuarios.fechaNacimiento,'%m-%d'), 0 , -1 )AS
		 * `EDAD_ACTUAL`,usuarios.email FROM usuarios
		 */
	}

	public void verEmail(Usuario usuario) {
		// TODO
		/**
		 * SELECT `nombre`, `apellido`, `email` FROM `usuarios`
		 */
	}

	public void insert(Usuario usuario) {

		
	}
}