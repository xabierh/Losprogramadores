package modelo.bean;

import java.sql.Date;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private String email;
	private Date fecha_nac;
	private Date fecha_reg;
	
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
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public Date getFecha_reg() {
		return fecha_reg;
	}
	public void setFecha_reg(Date fecha_reg) {
		this.fecha_reg = fecha_reg;
	}
	

}
