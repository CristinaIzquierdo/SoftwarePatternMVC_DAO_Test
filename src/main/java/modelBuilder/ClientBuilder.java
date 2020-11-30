package modelBuilder;


import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exception.AllNumberExceptLastOneException;
import exception.DNILastLetterException;
import exception.DuplicatedCodeException;
import exception.DuplicatedDataException;
import exception.LenghtDocumentTypeException;
import exception.NIEFirstLastWordException;
import exception.NeedNumberException;
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
		
		
					
		for (Client allClient: clientList) 
		{
			if (codigoCliente == allClient.getCodigoCliente()) 
			{
				throw new DuplicatedCodeException(); //lanza excepcion codigo repetido
				
			} else if (allClient.getApellidoContacto().equalsIgnoreCase(apellidoContacto)
					&& allClient.getNombreCliente().equalsIgnoreCase(nombreCliente)
					|| allClient.getTelefono().equals(telefono))
			{
				throw new DuplicatedDataException(); //lanza excepcion datos repetidos
			}
		}
		
		/*
		 * COMPROBACIÓN DNI ES CORRECTO
		 */
		
		// se comprueba si la longitud es correcta		
		if (DNI.length() != 9) 
		{
			throw new LenghtDocumentTypeException(); //lanza excepcion longitud incorrecta
		} 
		
		if(documentType == DocumentType.DNI) 
		{	// se comprueba si el ultimo digito es una letra
			char letra = DNI.toUpperCase().charAt(8); //almacena el digito 9 (la letra) en mayusculas
			
			if (!(letra > 64 && letra < 91)) //codigo ascii 
			{ 
				throw new DNILastLetterException(); //lanza excepcion error ultima letra DNI
			} else 
			{   // se comprueba si los 8 digitos son numeros
				for (int x=0; x<8; x++) 
				{ 						
					letra = DNI.charAt(x);							
					if (!(letra > 47 && letra < 58)) 
					{			
						throw new AllNumberExceptLastOneException(); //Si la variable letra no contiene un numero salta una excepcion.
					}
				}
			}
			
			
		/*
		 * FIN COMPROBACIÓN DNI ES CORRECTO
		 */
			
		/*
		 * COMPROBACIÓN NIE ES CORRECTO
		 */
			
			// se comprueba si el primer digito y ultimo digito son letras
		} else if(documentType == DocumentType.NIE) 
		{			
			char lastWord = DNI.toUpperCase().charAt(8);	
			char firstWord = DNI.toUpperCase().charAt(0);
			
			if ((!(lastWord > 64 && lastWord < 91)) || (!(firstWord > 64 && firstWord < 91))) 
			{
				throw new NIEFirstLastWordException(); //lanza excepcion error letras
				
			}else 
			{
				for(int y=1; y<8; y++) 
				{
					firstWord = DNI.charAt(y);
					
					if (!(firstWord > 47 && firstWord < 58)) 
					{				
						throw new NeedNumberException(); //lanza excepcion error letras
					}
				}
			}	
		
		}
		
		
		/*
		 * COMPROBACIÓN EMAIL ES CORRECTO
		 */
		
		Pattern patternEmailOK = Pattern.compile
				(
				"^[_A-Za-z0-9-\\+]"
				+ "+"
				+ "(\\.[_A-Za-z0-9-]+)*@" 	
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
				);
		
				Matcher emailOK = patternEmailOK.matcher(email);									//Creo un Matcher y comparo el Pattern creado con el mail del usuario.
				
				if(emailOK.find() == false) 
				{													
					throw new SintaxEmailException(); //lanza excepcion email incorrecto
				}
				
				return new Client(codigoCliente, 
								  nombreCliente, 
								  apellidoContacto, 
								  telefono, 
								  documentType, 
								  DNI, 
								  email, 
								  password);	
	}
}
