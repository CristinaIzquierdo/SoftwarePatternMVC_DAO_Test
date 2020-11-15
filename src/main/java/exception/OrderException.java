package exception;

import uml.Order;

public class OrderException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Order order;
	
	public OrderException(Order o) {
		super();
		this.order = o;
	}
	
	
	public Order getOrder() {
		return order;
	}
	
	

}
