package com.cbns.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cbns.project.dto.Persona;
import com.cbns.project.entitys.PersonaEntity;
import com.cbns.project.finals.Constantes;
import com.cbns.project.service.PersonaService;


@RestController
@RequestMapping(value = Constantes.PERSONA_ENDPOINT)
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping(Constantes.CONSULTA_PERSONA)
	public List<PersonaEntity> getMethodName() {
		return personaService.obtenerPersonas();
	}
	
	
	@PostMapping(Constantes.GUARDA_PERSONA)
	public String guardaPersona(@RequestBody Persona persona) {	
		
		personaService.guardarPersona(new PersonaEntity(null, persona.getNombre(), persona.getEdad(), persona.getEmail()));	
		
		
	    return "";
	}

}
