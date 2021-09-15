package com.example.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.colegio.entity.Curso;
import com.example.colegio.repository.CursoRepository;
import com.example.colegio.repository.ProfesorRepository;

@RestController
@RequestMapping("/curso")
@CrossOrigin
public class CursoService {
	@Autowired
	CursoRepository cursoRepository;
	
	@Autowired
	ProfesorRepository profesorRepository;
	
	@GetMapping(path = "/buscar")
	public List<Curso> buscar(){
	return cursoRepository.findAll();	
	}
	
	@PostMapping(path ="/guardar")
	public Curso saveCurso(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
	
	@DeleteMapping(path="/eliminar/{idcurso}")
	public void eliminar(@PathVariable ("idcurso") Integer idcurso) {
		Optional <Curso> curso = cursoRepository.findById(idcurso);
		if(curso.isPresent()) {
			cursoRepository.delete(curso.get());
		}
	}
}
