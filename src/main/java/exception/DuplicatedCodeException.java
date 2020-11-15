package exception;

import uml.Client;

public class DuplicatedCodeException extends ClientException{
	
	/**
	 default serial version
	 */
	private static final long serialVersionUID = 1L;

	public DuplicatedCodeException(Client c) {
		super(c);
	}
	
	public String getMessage() {
		return "El cliente con el c�digo" + client.getCodigoCliente()+ "" + client.getNombreCliente() + " ya existe.";
	}

}
