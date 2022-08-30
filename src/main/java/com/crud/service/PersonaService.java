package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.interfaceService.IPersonaService;
import com.crud.interfaces.IPersona;
import com.crud.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public Persona Save(Persona p) {
		
		return data.save(p);
	}

	@Override
	public Persona Edit(Persona p) {
		
		return data.save(p);
	}
	@Override
	public Persona delete(int id) {
		data.deleteById(id);
		return null;
		
	}

}
