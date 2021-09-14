package com.example.colegio.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.entity.Curso;

@Repository("cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Serializable> {

}
