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

@Path("/adelium") // URL de la page chargée
					// (http://localhost:8080/KAX_RS_TUTO_JERSEY/rest/adelium)
public class RestService {

	/*
	 * Annotations : @POST, @PUT, @DELETE, @HEAD Testable avec Postman
	 */

	@GET
	@Produces(MediaType.TEXT_PLAIN) // permet de représenter le résultat sous plusieurs formats différents (ie.
									// interopérable : accessible par plusieurs clients différents)
	public String SalutationText() {
		return "Bienvenue à la formation Services Web Rest";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String SalutationXML() {
		String rep = "<?xml version = '1.0' encoding = 'UTF-8' ?>";
		rep += "<salutation>Bienvenue à la formation Services Web Rest</salutation>";
		return rep;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String SalutationHTML() {
		return "<h1 style='color:blue'>Bienvenue à la formation Services Web Rest</h1>";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String SalutationJSON() {
		
		// message renvoyé à l'exécution d'une méthode GET
		return "{\"message\":\"Bienvenue à la formation Services Web Rest\"}";

	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String AjoutEntite() {
		
		// message renvoyé à l'exécution d'une méthode POST
		return " Entité ajoutée avec succès";
		
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String ModifieEntite() {
		
		// message renvoyé à l'exécution d'une méthode PUT
		return "Entité modifiée avec succès";
		
	}

	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String SupprimeEntite() {
		
		// message renvoyé à l'exécution d'une méthode DELETE
		return "Entité suprimée avec succès";
		
	}

}
