package exception;

public class LenghtDocumentTypeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "La cantidad de digitos deben ser 9.";
	}

}
