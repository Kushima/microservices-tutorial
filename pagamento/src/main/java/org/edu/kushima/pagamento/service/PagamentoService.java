package org.edu.kushima.pagamento.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagamentoService {

	public String getPagamento(String id) {
		StringBuilder sb = new StringBuilder();
		try {
			return sb.append("Service Pagamento: ").append(id).append(" Host: ").append(InetAddress.getLocalHost().getHostName()).toString();
		} catch (UnknownHostException e) {
			return sb.append("Erro ao recuperar Pagamento. Erro: [").append(e.getMessage()).append("]").toString();
		}
	}
}
