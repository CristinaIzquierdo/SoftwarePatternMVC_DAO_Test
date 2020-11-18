package modelBuilder;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exception.AllNumberExceptLastOneException;
import exception.DNILastLetterException;
import exception.DuplicatedCodeException;
import exception.LenghtDocumentTypeException;
import exception.NIEFirstLetterException;
import exception.NIELastLetterException;
import exception.SintaxEmailException;
import model.ClientDAO;
import uml.Client;
import uml.Client.DocumentType;

public class ClientBuilder {
	
	public static Client buildClient(int codigoCliente, 
							   String nombreCliente, 
							   String apellidoContacto,
							   String telefono,
							   DocumentType documentType,
							   String DNI,
							   String email,
							   String password) throws Exception{

			
		ClientDAO clientDao = new ClientDAO();
		List<Client> clientList = clientDao.getAll();
		
		
		
				
		for (Client allClient: clientList) {
			if (codigoCliente == allClient.getCodigoCliente()) {
				throw new DuplicatedCodeException();
			} else if (allClient.getApellidoContacto().equalsIgnoreCase(apellidoContacto)
					&& allClient.getNombreCliente().equalsIgnoreCase(nombreCliente)
					|| allClient.getTelefono().equals(telefono)) {
				throw new Exception();
			}
		}
		
		
		
		/*
		 * Comprobación tipo de documentacion (DNI/NIE)
		 */
		
		/*
		 * VALIDAR DNI
		 */
		
		
		if(DNI.length() != 9) {
			throw new LenghtDocumentTypeException();
		}
		
		
		if(documentType == DocumentType.DNI) {	//Comprueba los digitos del DNI.			
			char letra = DNI.toUpperCase().charAt(8);				//Almaceno el ultimo digito en mayusculas en la variable 'letra'.
			if(!(letra > 64 && letra < 91)) {						//Si el ultimo digito del dni no es una letra salta una excepcion.
				throw new DNILastLetterException();
			}else {
				for(int x=0; x<8; x++) {							//Recorro todos los numeros del dni
					letra = DNI.charAt(x);							//Recojo el numero en la variable letra
					if(!(letra > 47 && letra < 58)) {				//Si la variable letra no contiene un numero salta una excepcion.
						throw new AllNumberExceptLastOneException();
					}
				}
			}
			
		} else if(documentType == DocumentType.NIE) {	//Comprueba los digitos del NIE.			
			char letraLast = DNI.toUpperCase().charAt(8);			//Si el primer y ultimo digito del NIE no son una letra salta una excepcion.
			char letraFirst = DNI.toUpperCase().charAt(0);
			if((!(letraLast > 64 && letraLast < 91)) || (!(letraFirst > 64 && letraFirst < 91))) {
				throw new NIEFirstLetterException();
			}else {
				for(int y=1; y<8; y++) {
					letraFirst = DNI.charAt(y);
					if(!(letraFirst > 47 && letraFirst < 58)) {				//Si la variable letra no contiene un numero salta una excepcion.
						throw new NIELastLetterException();
					}
				}
			}	
		
		}
		
		Pattern patternEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 	//Creo un Pattern para el mail y lo compilo.
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher matherEmail = patternEmail.matcher(email);									//Creo un Matcher y comparo el Pattern creado con el mail del usuario.
				
				if(matherEmail.find() == false) {													//Si el mail no sigue el Pattern establecido salta una excepcion.
					throw new SintaxEmailException(); //"Email incorrecto."
				}
				
				return new Client(codigoCliente, nombreCliente, apellidoContacto, telefono, documentType, DNI, 
						email, password);
				
		
	}
		

}
