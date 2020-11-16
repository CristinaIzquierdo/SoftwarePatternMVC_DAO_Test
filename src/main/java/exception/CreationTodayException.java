package exception;


public class CreationTodayException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public String getMessage() {
		return "El pedido a crear no tiene la fecha de hoy";
	}
	
	
	
	
	

}
