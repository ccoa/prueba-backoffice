package com.occoa.backoffice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afiliados")
public class AfiliadoController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Object> listar() {
		
		List<String> clientes = new ArrayList<>();
		
		clientes.add("Banco Ripley");
		clientes.add("Caja Sullana");
		clientes.add("Acceso");
		
		return new ResponseEntity<Object>(clientes, HttpStatus.OK);
	}

}
