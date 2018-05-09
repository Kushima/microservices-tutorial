package org.edu.kushima.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.wildfly.swarm.spi.runtime.annotations.ConfigurationValue;

@ApplicationScoped
public class RecPagService {

	@Inject
	@ConfigurationValue("url.pagamento")
	String urlPagamento;

	@Inject
	@ConfigurationValue("url.recarga")
	String urlRecarga;

	public String getRecPag(String id) {
		StringBuilder sb = new StringBuilder();
		try {
			return sb.append("Service Recarga & Pagamento: ").append(id)
					.append(" URL Pagamento: [").append(urlPagamento).append("]")
					.append(" URL Recarga: [").append(urlRecarga).append("]")
					.append(" Host: ").append(InetAddress.getLocalHost().getHostName()).toString();
		} catch (UnknownHostException e) {
			return sb.append("Erro ao recuperar Recarga & Pagamento. Erro: [").append(e.getMessage()).append("]").toString();
		}
	}
}
