package org.edu.kushima.recarga.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.edu.kushima.recarga.service.RecargaService;

@ApplicationScoped
@Path("/")
public class RecargaController {

	@Inject
    RecargaService service;
	
	@GET
	@Path("{id}")
	@Produces("text/plain")
	public Response getRecarga(@PathParam("id") String id) throws Exception {
		return Response.ok(service.getRecarga(id)).build();
	}
}
