package com.example.colegio.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.entity.Nota;
import com.example.colegio.entity.Profesor;




@Repository("notaRepository")
public interface NotaRepository extends JpaRepository<Nota, Serializable> {
	public List<Nota> findByalumnoIdalumno(Integer alumnoIdalumno);
	public List<Nota> findBycursoIdcurso(Integer cursoIdcurso);
}