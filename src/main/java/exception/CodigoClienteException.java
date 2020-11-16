package exception;



public class CodigoClienteException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	public String getMessage() {
		return "Alerta!! \nEl cliente no existe en la base de datos, crealo antes .";
	}

	
}
