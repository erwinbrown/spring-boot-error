package com.bolsadeideas.springboot.error.app.errors;

public class ClienteNoEncontradoException extends RuntimeException  {
	
	
	public ClienteNoEncontradoException(String id) {
		super("Cliente con ID: ".concat(id).concat(" no existe en el sistema"));
	}
	
	private static final long serialVersionUID = 1L;
	
	
	

}
