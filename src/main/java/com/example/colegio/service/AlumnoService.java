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

import com.example.colegio.entity.Alumno;
import com.example.colegio.entity.Nota;
import com.example.colegio.repository.AlumnoRepository;
import com.example.colegio.repository.NotaRepository;

@RestController
@RequestMapping("/alumno")
@CrossOrigin
public class AlumnoService {

	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Autowired
	NotaRepository notaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Alumno> buscar(){
	return alumnoRepository.findAll();	
	}
	
	@PostMapping(path= "/guardar")
public Alumno guardar(@RequestBody Alumno alumno) {
	List<Nota>notas = alumno.getNotalist();
	alumno.setNotalist(null);
	alumnoRepository.save(alumno);
	for(Nota not: notas) {
		not.setAlumnoIdalumno(alumno.getIdalumno());
	}
notaRepository.saveAll(notas);
	alumno.setNotalist(notas);
	return alumno;
}
	
	@DeleteMapping(path="/eliminar/{idalumno}")
	public void eliminar(@PathVariable ("idalumno") Integer idalumno) {
		Optional <Alumno> alumno = alumnoRepository.findById(idalumno);
		if(alumno.isPresent()) {
			notaRepository.deleteAll(alumno.get().getNotalist());
			alumnoRepository.delete(alumno.get());
		}
	}
	
	@GetMapping(path="/buscar/por/{nombre}/{contrasena}")
	public List<Alumno>buscarPorNombreYContrasena(@PathVariable String nombre,@PathVariable String contrasena){
		return alumnoRepository.findByNombreAndContrasena(nombre, contrasena);
	}
	
	@PostMapping(path="/login")
	public List<Alumno>login(@RequestBody Alumno alumno){
		return alumnoRepository.findByNombreAndContrasena(alumno.getNombre(), alumno.getContrasena());
	}
	
}
