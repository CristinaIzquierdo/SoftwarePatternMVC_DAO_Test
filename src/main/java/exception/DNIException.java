package exception;

public class DNIException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String getMessage() {
		return "El noveno dígito debe ser una letra, y debe ser la correcta.";
	}
	
}
