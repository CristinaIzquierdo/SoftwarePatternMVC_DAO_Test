package exception;

import uml.Order;

public class CodigoClienteException extends OrderException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public CodigoClienteException(Order o) {
		super(o);
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return "Alerta!! \nEl cliente no existe en la base de datos, crealo antes .";
	}

	
}
