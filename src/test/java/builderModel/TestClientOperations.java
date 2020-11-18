package builderModel;

import org.junit.Test;
import static org.junit.Assert.*;


import exception.SintaxEmailException;
import modelBuilder.ClientBuilder;
import uml.Client;

public class TestClientOperations {
	
	
	/*
	 * test email que introduce en usuario
	 */
	
	@Test
	public void formatEMail_shouldNotWork() {
		try {
			ClientBuilder.buildClient(22, "Adrián", "Lopez", "688491523", Client.DocumentType.DNI, "47944567F", "nofunc@iona.com", "nofunciona");
		} catch (Exception e) {
			assertTrue(e instanceof SintaxEmailException);
			return;
		}
		fail("Excepcion");
	}
	
	
	public void formatEMail_shouldWork() {
		ClientBuilder.buildClient(22, "Adrián", "Lopez", "688491523", Client.DocumentType.DNI, "73497684R", "nofunc@gmail.com", "funciona");
	}
	}
}
	
	
	
	/*
	 * test DNI / NIE 
	 */
	
	public void lenghtDNI_shouldNotWork() {
		
	}
	
	
	public void lenghtDNI_shouldWork() {
			
	}
	
	
	
	
	public void wordDNI_shouldNotWork() {
			
	}
	
	
	public void wordDNI_shouldWork() {
			
	}
	
	
	
	public void lenghtNIE_shouldNotWork() {
		
	}
	
	
	public void lenghtNIE_shouldWork() {
			
	}
	
	
	

}
