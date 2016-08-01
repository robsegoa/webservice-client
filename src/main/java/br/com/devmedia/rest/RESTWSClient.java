package br.com.devmedia.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.codehaus.jackson.map.ObjectMapper;

public class RESTWSClient {

	public static void main(String[] args)
	{
		System.out.println("Conectando...");
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/DevMediaWebServicesProject/").path("webservice/ceprest/getCep/81590631");
		String toReturn = target.request().get(String.class);
	
		System.out.println("Resultato - "+ toReturn);
		
		/*Caso se precise fazer pra transcrever a string para json fazer o abaixo com a importação do 
		 * jackson json que está no pom
		 */
		ObjectMapper mapper = new ObjectMapper();
	
	}
}
