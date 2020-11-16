package exception;

public class ClientNotFoundException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El cliente no existe en nuestra base de datos, inténtelo con otro.";
	}

}
