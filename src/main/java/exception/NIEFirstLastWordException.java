package exception;

public class NIEFirstLastWordException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El primer y ultimo digito deben ser una letra, la letra 'ñ' esta excluida.";
	}
	
	

}
