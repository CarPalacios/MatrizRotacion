package com.matriz.antihorario.service;

import com.matriz.antihorario.model.MatrizGiroAntihorario;
import com.matriz.antihorario.model.MatrizResponse;

public interface MatrizService {

	public MatrizResponse giroAntihorario(MatrizGiroAntihorario request);

}
