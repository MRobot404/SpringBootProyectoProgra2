package com.example.colegio.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 @Table(name="nota")
public class Nota implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -56712419887222725L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idnota")
	private Integer idnota;
	
	@Column(name="nota")
	private Integer nota;
	
	@Column(name="nombre_curso")
	private String nombreCurso;
	
	@Column(name="curso_idcurso")
	private Integer cursoIdcurso;

	@Column(name="alumno_idalumno")
	private Integer alumnoIdalumno;

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public Integer getCursoIdcurso() {
		return cursoIdcurso;
	}

	public void setCursoIdcurso(Integer cursoIdcurso) {
		this.cursoIdcurso = cursoIdcurso;
	}

	public Integer getAlumnoIdalumno() {
		return alumnoIdalumno;
	}

	public void setAlumnoIdalumno(Integer alumnoIdalumno) {
		this.alumnoIdalumno = alumnoIdalumno;
	}

	public Integer getIdnota() {
		return idnota;
	}

	public void setIdnota(Integer idnota) {
		this.idnota = idnota;
	}
}
