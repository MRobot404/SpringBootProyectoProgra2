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

import com.example.colegio.entity.Nota;
import com.example.colegio.repository.NotaRepository;
@RestController
@RequestMapping("/nota")
@CrossOrigin
public class NotaService {

	@Autowired
	NotaRepository notaRepository;
	
	@GetMapping(path = "/buscar")
	public List<Nota> buscar(){
	return notaRepository.findAll();	
	}
	
	@PostMapping(path ="/guardar")
	public Nota saveNota(@RequestBody Nota nota) {
		return notaRepository.save(nota);
	}
	
	@DeleteMapping(path="/eliminar/{idnota}")
	public void eliminar(@PathVariable ("idnota") Integer idnota) {
		Optional <Nota> nota =  notaRepository.findById(idnota);
		if(nota.isPresent()) {
			notaRepository.delete(nota.get());
		}
	}
}
