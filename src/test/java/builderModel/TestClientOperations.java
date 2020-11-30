package builderModel;

import org.junit.Test;


import static org.junit.Assert.*;

import exception.DNILastLetterException;
import exception.LenghtDocumentTypeException;
import exception.NIEFirstLastWordException;
import exception.NeedNumberException;
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
			ClientBuilder.buildClient(22, 
									  "Adrián", 
									  "Lopez", 
									  "688491523", 
									  Client.DocumentType.DNI, 
									  "47944567F", 
									  "nofunc@iona.com", 
									  "nofunciona");
		} catch (Exception e) 
		{
			assertTrue(e instanceof SintaxEmailException);
			return;
		}
		fail("Excepcion");
	}
	
	
	
	@Test
	public void formatEMail_shouldWork() {
		Client testClient = null;
		try {
			ClientBuilder.buildClient(22,
					   				  "Adrián", 
					   				  "Lopez", 
					   				  "688491523", 
					   				  Client.DocumentType.DNI, 
					   				  "73497684R", 
					   				  "nofunc@gmail.com", 
					   				  "funciona");
		} catch (Exception e) 
		{
			fail("This must not happen");			
		}
		assertNotNull(testClient);		
	}
	

	/*
	 * test DNI / NIE 
	 */

	@Test
	public void lenghtDNI_shouldNotWork() {
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.DNI,
									  "6554864154J", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			assertTrue(e instanceof LenghtDocumentTypeException);
			return;
		}
		
		fail("Exception not thrown");	
	}
	

	@Test
	public void lenghtDNI_shouldWork() {
		Client testClient = null;
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.DNI,
									  "45965812V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			fail("This must not happen");	
		}
		assertNotNull(testClient);	
	}
	
	

	@Test
	public void wordDNI_shouldNotWork() {
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.DNI,
									  "459658124", 
									  "saragarcia@gmail.com", 
									  "sara");
					
				}catch (Exception e) {
					assertTrue(e instanceof DNILastLetterException);
					return;				
				}
				fail("Exception not trown");		
	}
	

	@Test
	public void wordDNI_shouldWork() {
		Client testClient = null;
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.DNI,
									  "45965812V", 
									  "saragarcia@gmail.com", 
									  "sara");
	
			}catch (Exception e) {
				fail("This must not happen");
			}
			assertNotNull(testClient);
	}
	
	
	@Test
	public void orderNumbersDNI_shouldNotWork() {
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.DNI,
									  "459J5T12V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			assertTrue(e instanceof NeedNumberException);
			return;
		}
		fail ("Exception not thrown");
	}
	
	
	
	@Test
	public void orderNumbersDNI_shouldWork() {
		Client testClient = null;
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.DNI,
									  "45965812V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			fail("This must not happen");
		}
		assertNotNull(testClient);
	}
	
	
	
	@Test
	public void FirstLastWordNIE_shouldNotWork() {
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.NIE,
									  "459J5T12V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			assertTrue(e instanceof NIEFirstLastWordException);
			return;
		}
		fail ("Exception not thrown");
	}
	
	
	
	@Test
	public void FirstLastWordNIE_shouldWork() {
		Client testClient = null;
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.NIE,
									  "E5965812V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			fail("This must not happen");
		}
		assertNotNull(testClient);
	}
	
	
	@Test
	public void OrderNumberNIE_shouldNotWork() {
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.NIE,
									  "E59YUT12V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			assertTrue(e instanceof NeedNumberException);
			return;
		}
		fail ("Exception not thrown");
	}
	
	
	
	@Test
	public void OrderNumberNIE_shouldWork() {
		Client testClient = null;
		try {
			ClientBuilder.buildClient(33,
									  "Sara",
									  "Garcia",
									  "489665844",
									  Client.DocumentType.NIE,
									  "E5965812V", 
									  "saragarcia@gmail.com", 
									  "sara");
			
		}catch (Exception e) {
			fail("This must not happen");
		}
		assertNotNull(testClient);
	}
	

}
