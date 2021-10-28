package com.example.colegio.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.entity.Alumno;

@Repository("alumnoRepository")
public interface AlumnoRepository extends JpaRepository<Alumno, Serializable> {
	public List<Alumno> findByCarneAndContrasena(String carne, String contrasena);
	public List<Alumno> findByCarne(String carne);
}
