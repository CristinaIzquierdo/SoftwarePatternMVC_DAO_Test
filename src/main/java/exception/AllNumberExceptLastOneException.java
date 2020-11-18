package exception;

public class AllNumberExceptLastOneException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Todos los digitos menos el ultimo tienen que ser un numero.";
	}

}
