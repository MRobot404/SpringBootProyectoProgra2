package com.example.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
 @Table(name="profesor")
public class Profesor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -271659870849476829L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idprofesor")
	private Integer idProfesor;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="telefono")
	private String telefono;
	
	@OneToMany(mappedBy ="profesorIdprofesor")
	private List<Curso>cursolist;

	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public List<Curso> getCursolist() {
		return cursolist;
	}

	public void setCursolist(List<Curso> cursolist) {
		this.cursolist = cursolist;
	}
	
	
}
