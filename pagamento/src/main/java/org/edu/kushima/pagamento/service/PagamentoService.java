package org.edu.kushima.pagamento.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PagamentoService {

	public String getPagamento(String id) {
		return "Service: " + id;
	}
}
