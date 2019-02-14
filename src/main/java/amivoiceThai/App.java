package amivoiceThai;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 

@GET
@Path("/samehash/")
public class App 
{
	@Path("{input}")
    public Response SearchSamehash(@PathParam("input") String input) {
		input = "TEST";
		return Response.status(200).entity(input.toString()).build();
    } 
}
