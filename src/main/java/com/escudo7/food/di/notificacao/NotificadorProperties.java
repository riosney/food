package com.escudo7.food.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
	
	/**
	 * Host do servidor de email
	 */
	private String hostServidor;
	
	/**
	 * Porta do servidor de email
	 */
	private String portaServidor;
	
	public String getHostServidor() {
		return hostServidor;
	}
	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}
	public String getPortaServidor() {
		return portaServidor;
	}
	public void setPortaServidor(String portaServidor) {
		this.portaServidor = portaServidor;
	}
	
	

}
