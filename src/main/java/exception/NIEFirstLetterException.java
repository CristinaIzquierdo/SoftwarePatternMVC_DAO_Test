package exception;

public class NIEFirstLetterException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El primer digito debe ser una letra, la letra 'ñ' esta excluida.";
	}
	
	

}
