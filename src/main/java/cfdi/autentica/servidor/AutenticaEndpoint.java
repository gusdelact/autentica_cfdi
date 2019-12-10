package cfdi.autentica.servidor;



import javax.xml.bind.JAXBElement;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import autentica.cfdi.autentica.AutenticaRequest;
import autentica.cfdi.autentica.AutenticaResponse;
import autentica.cfdi.autentica.ObjectFactory;



@Endpoint
public class AutenticaEndpoint {

	private static final String NAMESPACE_URI = "http://cfdi.autentica/autentica";


	public AutenticaEndpoint() {

	}

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AutenticaRequest")
	@ResponsePayload
	 public AutenticaResponse autentica(@RequestPayload AutenticaRequest request) {
		
		ObjectFactory factory = new ObjectFactory();
		AutenticaResponse resultado = factory.createAutenticaResponse();
		resultado.setAutenticaResult( factory.createAutenticaResponseAutenticaResult("hola mundo") );
		
		return resultado;
	 }

}
