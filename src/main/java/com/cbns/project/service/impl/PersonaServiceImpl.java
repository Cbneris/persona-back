package com.cbns.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbns.project.entitys.PersonaEntity;
import com.cbns.project.repository.PersonaRepository;
import com.cbns.project.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	PersonaRepository r;

	@Override
	public List<PersonaEntity> obtenerPersonas() {
		return r.findAll();
	}

	@Override
	public Optional<PersonaEntity> obtenerPersonaPorId(Long id) {
		return r.findById(id);
	}

	@Override
	public PersonaEntity guardarPersona(PersonaEntity persona) {
		return r.save(persona);
	}

	@Override
	public void eliminarPersona(Long id) {
		
	}
}
