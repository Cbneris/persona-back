package com.cbns.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Persona {
	
	private String 	nombre;
	private int		edad;
	private String 	email;

}
