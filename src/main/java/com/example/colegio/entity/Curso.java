package com.example.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="curso")
public class Curso  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1680813052044577193L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idcurso")
	private Integer idcurso;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fecha_de_inicio")
	private Date fechaDeInicio;
	
	@Column(name="fecha_fin")
	private Date fechaFin;
	
	@Column(name="dia")
	private String dia;
	
	@Column(name="hora_inicio")
	private String horaInicio;
	
	@Column(name="hora_fin")
	private String horaFin;
	
	@Column(name="profesor")
	private String profesor;
	
	@Column(name="profesor_idprofesor")
	private Integer profesorIdprofesor;

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public Integer getProfesorIdprofesor() {
		return profesorIdprofesor;
	}

	public void setProfesorIdprofesor(Integer profesorIdprofesor) {
		this.profesorIdprofesor = profesorIdprofesor;
	}
	
	
	
	
}
