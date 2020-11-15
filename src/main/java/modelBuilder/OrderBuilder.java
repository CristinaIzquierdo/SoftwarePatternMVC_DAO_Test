package modelBuilder;

import java.util.Date;

import exception.CodigoClienteException;
import exception.CreationTodayException;
import exception.ThreeDaysLaterException;
import model.OrderDAO;
import uml.Order;

public class OrderBuilder {
	
	public static Order build(int codigoPedido, Date fechaPedido, Date fechaEsperada, int codigoCliente) throws CreationTodayException, ThreeDaysLaterException, CodigoClienteException{
		
		OrderDAO orderDao = new OrderDAO();
		
		Order order = new Order(fechaPedido, fechaEsperada, codigoCliente);
		
		Date fecha = new Date(); //fecha actual
		
		if(fechaPedido != fecha){
			throw new CreationTodayException(order);
		}
		
		/*
		 * 
		 
		if(fechaEsperada = (fecha.getDay()-3)) {
			throw new ThreeDaysLaterException(order);
		}
		
		*/
		if(orderDao.getOrder(codigoCliente) == null) {
			throw new CodigoClienteException(order);
		}
		
		return order;
	}

}
