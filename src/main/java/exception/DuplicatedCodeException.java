package exception;


public class DuplicatedCodeException extends Exception{
	
	/**
	 default serial version
	 */
	private static final long serialVersionUID = 1L;

	
	public String getMessage() {
		return "El cliente con ese código ya existe en nuestra base de datos.";
	}

}
