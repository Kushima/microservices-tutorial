package org.edu.kushima.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.edu.kushima.service.RecPagService;

@Path("/recpag")
public class RecPagController {

	@Inject
    private RecPagService service;
	
	@GET
	@Path("{id}")
	@Produces("text/plain")
	public Response getPayments(@PathParam("id") String id) throws Exception {
		return Response.ok(service.getRecPag(id)).build();
	}
}
