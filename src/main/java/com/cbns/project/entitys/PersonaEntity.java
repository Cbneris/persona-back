package com.cbns.project.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "TT_PERSONA")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PersonaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Long idPersona;
	
	@Column
	private String nombre;

	@Column
	private int edad;
	
	@Column
	private String email;

}
