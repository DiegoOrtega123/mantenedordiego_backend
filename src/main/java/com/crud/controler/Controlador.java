package com.crud.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.interfaceService.IPersonaService;
import com.crud.modelo.Persona;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/personas")
public class Controlador {
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	 public List<Persona>listar(){
        return service.listar();
    
	}
	
	@PostMapping("/save")
	public Persona agregar(@RequestBody Persona p) {
		return service.Save(p);
		
	}
	@GetMapping("/listarId/{id}")
	public Optional<Persona> listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	@PutMapping("/Editar/{id}")
	public Persona editar(@RequestBody Persona p , @PathVariable("id") int id) {
		p.setId(id);
		return service.Edit(p);
	}
	
	
	
	
	
	@DeleteMapping("/Eliminar/{id}")
	public Persona delete(@PathVariable("id") int id) {
		return service.delete(id);
	}
	
}
