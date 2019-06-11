package adelium.cours.java;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Ceci est un service web

@Path("/adelium") // URL de la page charg�e
					// (http://localhost:8080/KAX_RS_TUTO_JERSEY/rest/adelium)
public class RestService {

	/*
	 * Annotations : @POST, @PUT, @DELETE, @HEAD Testable avec Postman
	 */

	@GET
	@Produces(MediaType.TEXT_PLAIN) // permet de repr�senter le r�sultat sous plusieurs formats diff�rents (ie.
									// interop�rable : accessible par plusieurs clients diff�rents)
	public String SalutationText() {
		return "Bienvenue � la formation Services Web Rest";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String SalutationXML() {
		String rep = "<?xml version = '1.0' encoding = 'UTF-8' ?>";
		rep += "<salutation>Bienvenue � la formation Services Web Rest</salutation>";
		return rep;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String SalutationHTML() {
		return "<h1 style='color:blue'>Bienvenue � la formation Services Web Rest</h1>";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String SalutationJSON() {
		
		// message renvoy� � l'ex�cution d'une m�thode GET
		return "{\"message\":\"Bienvenue � la formation Services Web Rest\"}";

	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String AjoutEntite() {
		
		// message renvoy� � l'ex�cution d'une m�thode POST
		return " Entit� ajout�e avec succ�s";
		
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String ModifieEntite() {
		
		// message renvoy� � l'ex�cution d'une m�thode PUT
		return "Entit� modifi�e avec succ�s";
		
	}

	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String SupprimeEntite() {
		
		// message renvoy� � l'ex�cution d'une m�thode DELETE
		return "Entit� suprim�e avec succ�s";
		
	}

}
