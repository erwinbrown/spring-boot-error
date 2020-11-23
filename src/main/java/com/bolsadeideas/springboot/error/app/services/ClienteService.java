package com.bolsadeideas.springboot.error.app.services;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.error.app.domain.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarCliente();
	public Cliente obtenerClienteId(Integer id);
	public Optional<Cliente> obtenerPorIdOptional(Integer id);
	

}
