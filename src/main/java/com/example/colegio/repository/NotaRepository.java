package com.example.colegio.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.entity.Nota;



@Repository("notaRepository")
public interface NotaRepository extends JpaRepository<Nota, Serializable> {

}