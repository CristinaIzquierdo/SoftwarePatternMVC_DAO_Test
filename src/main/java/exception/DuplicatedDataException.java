package exception;

public class DuplicatedDataException extends Exception{
	
private static final long serialVersionUID = 1L;


	
	public String getMessage() {
		return "¡¡Puede ocurrir una duplicacidad de datos al haber datos repetidos!!.";
	}

	

}
