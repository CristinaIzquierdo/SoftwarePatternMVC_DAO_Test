package exception;

public class DNILastLetterException extends Exception{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El 9 digito tiene que ser una letra, la 'ñ' esta excluida.";
	}

}
