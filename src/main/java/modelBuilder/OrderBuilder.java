package modelBuilder;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.List;

import exception.ClientNotFoundException;
import exception.CreationTodayException;
import exception.MinDateOrderException;
import model.ClientDAO;
import uml.Client;
import uml.Order;

public class OrderBuilder {
	
	public static Order build(int codigoPedido, 
							  Calendar fechaPedido, 
							  Calendar fechaEsperada, 
							  int codigoCliente) throws Exception {
		
		Calendar fechaActual = new GregorianCalendar();
		Calendar fechaMinimaEsperada = new GregorianCalendar();
		fechaMinimaEsperada = fechaPedido;
		
		
		if ((fechaPedido.get(Calendar.DAY_OF_MONTH) == fechaActual.get(Calendar.DAY_OF_MONTH))
				&&  (fechaPedido.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH))
				&& (fechaPedido.get(Calendar.YEAR) == fechaPedido.get(Calendar.YEAR))) 
		{	
			
		} else throw new CreationTodayException();
		
		fechaMinimaEsperada.add(Calendar.DAY_OF_MONTH, 3);
		
		if (fechaEsperada.before(fechaMinimaEsperada)) 
		{
			throw new MinDateOrderException();
		}
		
		fechaMinimaEsperada.add(Calendar.DAY_OF_MONTH, -3);
		
		ClientDAO clientDAO = new ClientDAO();
		
		boolean clientExist = false;
		
		List <Client> clientesSaved = clientDAO.getAll();
		
		for (Client clienteSaved: clientesSaved) {
			if (codigoCliente == clienteSaved.getCodigoCliente()) {
				clientExist = true;
			}
		}
		
		if (clientExist == false) {
			throw new ClientNotFoundException();
		}
		
		return new Order(codigoPedido, 
					     fechaPedido,
					     fechaEsperada, 
					     codigoCliente);
		
	}
}
