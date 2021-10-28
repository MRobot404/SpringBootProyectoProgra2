package com.example.colegio.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.colegio.entity.Profesor;

@Repository("profesorRepository")
public interface ProfesorRepository extends JpaRepository<Profesor, Serializable> {
	public List<Profesor> findByUsuarioAndContrasena(String usuario, String contrasena);
	public List<Profesor> findByNombreAndApellido(String nombre, String apellido);
}
