package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.error.app.domain.Cliente;
import com.bolsadeideas.springboot.error.app.errors.ClienteNoEncontradoException;
import com.bolsadeideas.springboot.error.app.services.ClienteService;

@Controller
public class AppController {

	@Autowired
	private ClienteService clService;

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String inicio() {

		// Integer valor = 100/0;
		Integer valor = Integer.parseInt("20x");
		return "index";

	}

	@GetMapping("/ver/{id}")
	public String verCliente(@PathVariable Integer id, Model m) {

		// Usuario usuario = usuarioService.obtenerPorId(id);

		/*
		 * if(usuario==null) { throw new UsuarioNoEncontradoException(id.toString()); }
		 */

		Cliente cliente = clService.obtenerPorIdOptional(id)
				.orElseThrow(() -> new ClienteNoEncontradoException(id.toString()));

		m.addAttribute("usuario", cliente);
		m.addAttribute("titulo", "Detalle usuario: ".concat(cliente.getNombre()));
		return "ver";

	}

}
