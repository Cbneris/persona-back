package com.cbns.project.service;

import java.util.List;
import java.util.Optional;

import com.cbns.project.entitys.PersonaEntity;


public interface PersonaService {
	List<PersonaEntity> obtenerPersonas();
	Optional<PersonaEntity> obtenerPersonaPorId(Long id);
	PersonaEntity guardarPersona(PersonaEntity persona);
    void eliminarPersona(Long id);
}
