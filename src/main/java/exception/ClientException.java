package exception;

import uml.Client;

public class ClientException extends Exception{
	/**
	 default serial version
	 */
	private static final long serialVersionUID = 1L;
	
	Client client;
	
	public ClientException(Client c) {
		super();
		this.client = c;
	}
	
	public Client getCliente() {
		return client;
	}
	

}
