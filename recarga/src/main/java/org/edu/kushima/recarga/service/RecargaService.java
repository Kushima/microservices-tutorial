package org.edu.kushima.recarga.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RecargaService {

	public String getRecarga(String id) {
		
		StringBuilder sb = new StringBuilder();
		try {
			return sb.append("Service Recarga: ").append(id).append(" Host: ").append(InetAddress.getLocalHost().getHostName()).toString();
		} catch (UnknownHostException e) {
			return sb.append("Erro ao recuperar Recarga. Erro: [").append(e.getMessage()).append("]").toString();
		}
	}
}
