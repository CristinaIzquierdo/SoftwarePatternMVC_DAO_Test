package exception;

public class NeedNumberException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Todos los digitos excepto el primero y último deben ser numeros";
	}

}
