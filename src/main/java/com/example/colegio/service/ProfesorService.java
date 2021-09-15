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

import com.example.colegio.entity.Profesor;
import com.example.colegio.repository.CursoRepository;
import com.example.colegio.repository.ProfesorRepository;
@RestController
@RequestMapping("/profesor")
@CrossOrigin
public class ProfesorService {
	
	@Autowired
	ProfesorRepository profesorRepository;

	@Autowired
	
	CursoRepository cursoRepository;
	

	@GetMapping(path = "/buscar")
	public List<Profesor> buscar(){
	return profesorRepository.findAll();	
	}
	
	@PostMapping(path ="/guardar")
	public Profesor guardar(@RequestBody Profesor profesor) {
		List<Curso>cursos = profesor.getCursolist();
		profesor.setCursolist(null);
		profesorRepository.save(profesor);
		for(Curso cur: cursos) {
			cur.setProfesorIdprofesor(profesor.getIdProfesor());
		}
	cursoRepository.saveAll(cursos);
		profesor.setCursolist(cursos);
		return profesor;
	}
	
	@DeleteMapping(path="/eliminar/{idprofesor}")
	public void eliminar(@PathVariable ("idprofesor") Integer idprofesor) {
		Optional <Profesor> profesor = profesorRepository.findById(idprofesor);
		if(profesor.isPresent()) {
			profesorRepository.delete(profesor.get());
		}
	
}
	
	@GetMapping(path="/buscar/por/{usuario}/{contrasena}")
	public List<Profesor> buscarPorUsuarioYContrasena(@PathVariable String usuario,@PathVariable String contrasena){
		return profesorRepository.findByUsuarioAndContrasena(usuario, contrasena);
	}
	
	@PostMapping(path="/login")
	public List<Profesor> login(@RequestBody Profesor profesor){
		return profesorRepository.findByUsuarioAndContrasena(profesor.getUsuario(), profesor.getContrasena());
	}
	
}
