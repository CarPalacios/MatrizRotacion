package com.matriz.antihorario.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.matriz.antihorario.cfg.ApplicationProperties;
import com.matriz.antihorario.cfg.AuditLogger;
import com.matriz.antihorario.model.MatrizGiroAntihorario;
import com.matriz.antihorario.model.MatrizResponse;

@Service
public class MatrizServiceImpl implements MatrizService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private final ApplicationProperties properties;

	public MatrizServiceImpl(ApplicationProperties properties) {
		this.properties = properties;
	}

	public MatrizResponse giroAntihorario(MatrizGiroAntihorario request) {
		// TODO Auto-generated method stub

		MatrizResponse response = new MatrizResponse();
		int filas = request.getFilas();
		int columnas = request.getColumnas();

		AuditLogger.log(logger, "La matriz es de " + filas + "x" + columnas);

		int matriz[][] = request.getValores();
		int tamanio = matriz.length;

		int[][] matrizRotado = new int[tamanio][tamanio];

		try {
			if (request.getFilas() == request.getColumnas()) {
				for (int i = 0; i < tamanio; i++) {
					for (int j = 0; j < tamanio; j++) {
						matrizRotado[tamanio - 1 - j][i] = matriz[i][j];
					}
				}
			} else {
				throw new Exception("Error");
			}
			
			response.setCodigoRespuesta(properties.matrizCodigoIdf0);
			response.setMensajeRespuesta(properties.matrizMensajeIdf0);
			response.setRespuesta(matrizRotado);

			return response;

		} catch (Exception e) {

			response.setCodigoRespuesta(properties.matrizCodigoIdt1);
			response.setMensajeRespuesta(properties.matrizMensajeIdt1);
			response.setRespuesta(null);
			return response;

		}
		

	}

}
