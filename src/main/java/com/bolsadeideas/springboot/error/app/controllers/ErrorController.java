package com.bolsadeideas.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(ArithmeticException ex, Model m) {
		
		m.addAttribute("error", "Error de arirmética");
		m.addAttribute("message", ex.getMessage());
		m.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		m.addAttribute("timestamp", new Date());
		
		
		return "error/aritmetica";
		
	} 
	
	@ExceptionHandler(NumberFormatException.class)
	public String numeroFormatoError(NumberFormatException ex, Model m) {
		
		
		m.addAttribute("error", "Error en formato de numero");
		m.addAttribute("message", ex.getMessage());
		m.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		m.addAttribute("timestamp", new Date());
		
		
		return "error/formato-numero";
		
		
	}
	
	

}
