package com.virt.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.virt.resource.MyResource;

@Path("/MyResource")
@Component
public class MyResource {
	private final Logger logger = LoggerFactory.getLogger(MyResource.class);
	
	@GET
	@Path("/hello")
	@Produces({ MediaType.TEXT_PLAIN })
	public Response myMethod() {
		logger.info("myMethod --- entry ");
		String str  = "hello world!!!!!!!";
		return Response.ok(str, MediaType.TEXT_PLAIN).build();
	}
	
	@POST
	@Path("/sayHello/{name}")
	@Produces({ MediaType.TEXT_PLAIN })
	@Consumes({ MediaType.TEXT_PLAIN })
	public Response myMethod1(@PathParam("name") String name) {
		logger.info("myMethod1 --- entry ");
		String str  = "hello world!!!!!!! " + name;
		return Response.ok(str, MediaType.TEXT_PLAIN).build();
	}
}
