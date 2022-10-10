package com.matriz.antihorario.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationProperties {
	
	@Value("${matriz.codigo.idf0}")
	public String matrizCodigoIdf0;
	
	@Value("${matriz.codigo.idt1}")
	public String matrizCodigoIdt1;
	
	@Value("${matriz.mensaje.idf0}")
	public String matrizMensajeIdf0;
	
	@Value("${matriz.mensaje.idt1}")
	public String matrizMensajeIdt1;

}
