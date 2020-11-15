package exception;

import uml.Order;

public class ThreeDaysLaterException extends OrderException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ThreeDaysLaterException(Order o) {
		super(o);
	}

	
	public String getMessage() {
		return "Alerta!! La fecha de entrega esperada no puede ser anterior a tres días.";
	}

}
