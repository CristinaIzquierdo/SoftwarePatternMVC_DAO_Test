package exception;

import uml.Order;

public class CreationTodayException extends OrderException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CreationTodayException(Order o) {
		super(o);
	}
	
	public String getMessage() {
		return "El pedido a crear no tiene la fecha de hoy";
	}
	
	
	
	
	

}
