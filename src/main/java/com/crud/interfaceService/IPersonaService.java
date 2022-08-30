package com.crud.interfaceService;

import java.util.List;
import java.util.Optional;


import com.crud.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona>listar();
	public Optional<Persona> listarId(int id);
	public Persona Save(Persona p);
	public Persona Edit(Persona p);
	public Persona delete(int id);

}
