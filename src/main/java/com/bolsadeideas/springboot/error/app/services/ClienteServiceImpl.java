package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.domain.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	private ArrayList<Cliente> lista;

	public ClienteServiceImpl() {

		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		lista.add(new Cliente(10, "Erwin", "Brown"));
		lista.add(new Cliente(11, "Antonio", "Pitti"));
		lista.add(new Cliente(12, "Andrés", "Gúzman"));
		lista.add(new Cliente(13, "Raúl", "Pérez"));
		lista.add(new Cliente(14, "Alcibiades", "Marciaga"));
		lista.add(new Cliente(15, "Lisseth", "Alvarez"));
		lista.add(new Cliente(16, "Marvin", "Morgan"));
		lista.add(new Cliente(17, "Abercio", "Salinas"));

		this.lista = lista;
	}

	@Override
	public List<Cliente> listarCliente() {

		return this.lista;
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {

		Cliente result = null;

		for (Cliente cl : this.lista) {

			if (cl.getId().equals(id)) {

				result = cl;
				break;

			}

		}
		return result;

	}

	@Override
	public Optional<Cliente> obtenerPorIdOptional(Integer id) {
		
		Cliente cl = this.obtenerClienteId(id);
		return Optional.ofNullable(cl);
		
	}
	
	

}
