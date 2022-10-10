package com.matriz.antihorario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matriz.antihorario.model.MatrizGiroAntihorario;
import com.matriz.antihorario.model.MatrizResponse;
import com.matriz.antihorario.service.MatrizService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/matriz")
public class MatrizController {

	@Autowired
	private MatrizService iMatrizService;

	MatrizController(MatrizService service) {
		this.iMatrizService = service;
	}

	@ApiOperation("Giro antihorario de la Matriz")
	@PostMapping(value = "/realizarGiro", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MatrizResponse> giroAntihorario(@RequestBody MatrizGiroAntihorario request) {

		MatrizResponse response = iMatrizService.giroAntihorario(request);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
