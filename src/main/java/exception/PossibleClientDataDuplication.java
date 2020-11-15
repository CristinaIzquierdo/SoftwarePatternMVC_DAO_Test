package exception;

import uml.Client;

public class PossibleClientDataDuplication extends ClientException{
	/**
	 default serial version
	 */
	private static final long serialVersionUID = 1L;

	
	public PossibleClientDataDuplication(Client c) {
		super(c);
	}
	
	public String getMessage() {
		return "Alerta!! \nEl usuario " +client.getNombreCliente() + "" + client.getApellidoContacto() + "" +client.getTelefono() + " puede estar duplicado.";
	}
	
	
		
	

}
