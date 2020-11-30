package builderModel;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import exception.ClientNotFoundException;
import exception.CreationTodayException;
import exception.MinDateOrderException;
import modelBuilder.ClientBuilder;
import modelBuilder.OrderBuilder;
import uml.Client;
import uml.Order;


public class TestOrderOperations {
	
	Calendar today = new GregorianCalendar();
	model.ClientDAO ClientDAO = new model.ClientDAO();
	model.OrderDAO OrderDAO = new model.OrderDAO();
	
	
	public void BuildCliente(int codigoCliente, String nombre, String tlf) {
		
		try {
			ClientDAO.insert(ClientBuilder.buildClient(codigoCliente, nombre, "San Miguel", tlf, 
					Client.DocumentType.DNI, "45646588E", "julian@gmail.com", "julian"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	public void orderDateNotToday_shouldNotWork() {
		
		BuildCliente(48, "Julian", "978452653");
		
		Calendar day1 = new GregorianCalendar();	
		Calendar day2 = new GregorianCalendar();
		day1.add(Calendar.DAY_OF_MONTH, 4);
		day2.add(Calendar.DAY_OF_MONTH, 6);
		
		try {
			OrderBuilder.build(11, day1, day2, 11);
		}catch (Exception e) {
			assertTrue(e instanceof CreationTodayException);
			return;
		}
		fail("Exception not Thrown");	
	}
	
	
	
	@Test
	public void orderDateNotToday_shouldWork() {
		
		BuildCliente(48, "Julian", "978452653");
		
		Order testOrder = null;
		
		Calendar day1 = new GregorianCalendar();	
		Calendar day2 = new GregorianCalendar();
		day1.add(Calendar.DAY_OF_MONTH, 4);
		day2.add(Calendar.DAY_OF_MONTH, 6);
		
		try {
			testOrder = OrderBuilder.build(12, day1, day2, 12);
		}catch (Exception e) {
			fail("This must not happen");
		}
		assertNotNull(testOrder);	
	}
	
	
	
	
	@Test
	public void orderMinDate_shouldNotWork() {
		
		BuildCliente(48, "Julian", "978452653");
		
		Calendar day1 = new GregorianCalendar();	
		Calendar day2 = new GregorianCalendar();
		day1.add(Calendar.DAY_OF_MONTH, 1);
		day2.add(Calendar.DAY_OF_MONTH, 6);
		
		try {
			OrderBuilder.build(13, day1, day2, 13);
		}catch (Exception e) {
			assertTrue(e instanceof MinDateOrderException);
			return;
		}
		fail("Exception not Thrown");	
	}
	
	
	@Test
	public void orderMinDate_shouldWork() {
		
		BuildCliente(48, "Julian", "978452653");
		
		Order testOrder = null;
		
		Calendar day1 = new GregorianCalendar();	
		Calendar day2 = new GregorianCalendar();
		day1.add(Calendar.DAY_OF_MONTH, 4);
		day2.add(Calendar.DAY_OF_MONTH, 6);
		
		try {
			testOrder = OrderBuilder.build(14, day1, day2, 14);
		}catch (Exception e) {
			fail("This must not happen");
		}
		assertNotNull(testOrder);	
	}
	
	
	
	@Test
	public void orderClientExist_shouldNotWork() {
		
		Calendar day1 = new GregorianCalendar();	
		Calendar day2 = new GregorianCalendar();
		day1.add(Calendar.DAY_OF_MONTH, 4);
		day2.add(Calendar.DAY_OF_MONTH, 6);
		
		try {
			OrderBuilder.build(11, day1, day2, 20);			
		} catch (Exception e) {
			assertTrue(e instanceof ClientNotFoundException);
			return;
		}
		fail("Exception not Thrown");
	}
		
		
	
	@Test
	public void orderClientExist_shouldWork() {
		
		BuildCliente(48, "Julian", "978452653");
		
		Order testOrder = null;
		
		Calendar day1 = new GregorianCalendar();	
		Calendar day2 = new GregorianCalendar();
		day1.add(Calendar.DAY_OF_MONTH, 4);
		day2.add(Calendar.DAY_OF_MONTH, 6);
		
		try {
			testOrder = OrderBuilder.build(12, day1, day2, 15);			
		} catch (Exception e) {
			fail("This must not happen");
		}
		assertNotNull(testOrder);
	}
	

}
