package org.edu.kushima.pagamento.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.edu.kushima.pagamento.service.PagamentoService;

@Path("/pagamento")
public class PagamentoController {

	@Inject
    PagamentoService service;
	
	@GET
	@Path("{id}")
	@Produces("text/plain")
	public Response getPayments(@PathParam("id") String id) throws Exception {
		return Response.ok(service.getPagamento(id)).build();
	}
}
