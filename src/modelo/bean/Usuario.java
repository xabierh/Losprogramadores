package modelo.bean;

import java.sql.Date;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String nombre_usuario;
	private String contrasena;
	private String email;
	private String fecha_nac;
	private String fecha_reg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String usuario) {
		this.nombre_usuario = usuario;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public String getFecha_reg() {
		return fecha_reg;
	}
	public void setFecha_reg(String fecha_reg) {
		this.fecha_reg = fecha_reg;
	}
	
	

}
