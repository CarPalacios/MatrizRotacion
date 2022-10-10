package com.matriz.antihorario.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MatrizResponse {
	
	public MatrizResponse() {

	}

	private String codigoRespuesta;
	private String mensajeRespuesta;
	private int respuesta[][];

}
