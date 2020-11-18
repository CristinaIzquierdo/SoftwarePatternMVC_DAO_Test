package model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import uml.Client;

public class ClientDAO implements ICRUD{
	
	//Credenciales para la base de datos
		Database db = new Database();

	//implementa los m�todos de la interfaz ICRUD (CRUD)

	public String insert(Object obj) {
		Client client = (Client) obj;
		Connection connection;
		PreparedStatement pst;
		String sql = "INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String answer = "";
		
		try {
			Class.forName(db.getDriver());
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass()); //usa las credenciales para la conexion
		
			pst = connection.prepareStatement(sql); 
			
			//le asigna estos valores a la consulta sql
			pst.setInt(1, client.getCodigoCliente());
			pst.setString(2, client.getNombreCliente());
			pst.setString(3, client.getNombreContacto());
			pst.setString(4, client.getApellidoContacto());
			pst.setString(5, client.getTelefono());
			pst.setString(6, client.getFax());
			pst.setString(7, client.getLineaDireccion1());
			pst.setString(8, client.getLineaDireccion2());
			pst.setString(9, client.getCiudad());
			pst.setString(10, client.getRegion());
			pst.setString(11, client.getPais());
			pst.setString(12, client.getCodigoPostal());
			pst.setInt(13, client.getCodigoEmpleadoRepVentas());
			pst.setInt(14, client.getLimiteCredito());
			
			int fields = pst.executeUpdate(); //ejecuta la consulta sql e indica cuantas filas tiene 
			//!! se usa executeUpdate() porque hay una modificacion en la tabla (insert)
			
			answer = "Se insertaron "+ fields + " filas nuevas.";
			
			connection.close(); // se cierra la conexion
					
			
			}catch(ClassNotFoundException | SQLException e) {	
			}
		
			return answer;
		
			
	}

	@Override
	public String delete(Object obj) {
		Client client = (Client) obj;
		Connection connection;
		PreparedStatement pst;
		String sql = "DELETE FROM cliente WHERE codigoCliente=?";
		String answer = "";
		
		try {
			Class.forName(db.getDriver());
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass()); //usa las credenciales para la conexion
		
			pst = connection.prepareStatement(sql); 
			
			//le asigna estos valores a la consulta sql
			pst.setInt(1, client.getCodigoCliente());
			
			int fields = pst.executeUpdate(); //ejecuta la consulta sql e indica cuantas filas tiene 
			//!! se usa executeUpdate() porque hay una modificacion en la tabla (insert)
			
			answer = "Se eliminaron "+ fields + " elementos.";
			
			connection.close(); // se cierra la conexion
					
			//ClassNotFoundException por si no puede cargar el driver; SQLException erro de conexion a la base de datos
			}catch(ClassNotFoundException | SQLException e) {	
			}
		
			return answer;

	}

	@Override
	public String update(Object obj) {
		Client client = (Client) obj;
		Connection connection;
		PreparedStatement pst;
		String sql = "UPDATE cliente SET nombreCliente=?, nombreContacto=?,  "
				+ "apellidoContacto=?, telefono=?, fax=?, lineaDireccion1=?, lineaDireccion2=?,"
				+ "ciudad=?, region=?, pais=?, codigoPostal=?, codigoEmpleadoRepVentas=?, "
				+ "limiteCredito=? WHERE codigoCliente=?";
		String answer = "";
		
		try {
			Class.forName(db.getDriver());
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass()); //usa las credenciales para la conexion
		
			pst = connection.prepareStatement(sql); 
			
			//le asigna estos valores a la consulta sql
			pst.setString(1, client.getNombreCliente());
			pst.setString(2, client.getNombreContacto());
			pst.setString(3, client.getApellidoContacto());
			pst.setString(4, client.getTelefono());
			pst.setString(5, client.getFax());
			pst.setString(6, client.getLineaDireccion1());
			pst.setString(7, client.getLineaDireccion2());
			pst.setString(8, client.getCiudad());
			pst.setString(9, client.getRegion());
			pst.setString(10, client.getPais());
			pst.setString(11, client.getCodigoPostal());
			pst.setInt(12, client.getCodigoEmpleadoRepVentas());
			pst.setInt(13, client.getLimiteCredito());
			pst.setInt(14, client.getCodigoCliente());
			
			int fields = pst.executeUpdate(); //ejecuta la consulta sql e indica cuantas filas tiene 
			//!! se usa executeUpdate() porque hay una modificacion en la tabla (update)
			
			answer = "Se modificaron "+ fields + " elementos.";
			
			connection.close(); // se cierra la conexion
					
			//ClassNotFoundException por si no puede cargar el driver; SQLException erro de conexion a la base de datos
			}catch(ClassNotFoundException | SQLException e) {	
			}
		
			return answer;
	}

	
	@Override
	public List<Client> read() {
		List<Client> data = new ArrayList<>();
		Connection connection;
		PreparedStatement pst;
		ResultSet resultSet;
		
		String sql = "SELECT * FROM client";
		
		try {
			Class.forName(db.getDriver());	
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
			
			pst = connection.prepareStatement(sql);
			resultSet = pst.executeQuery();
			//ExecuteQuery() no hay modificaciones en la tabla, solo se quiere consultar info
			
			while(resultSet.next()) { //mientras haya siguiente registro, se agregan los datos de la tabla a los parametros
				data.add(new Client(resultSet.getInt("codigoCliente"), 
								   resultSet.getString("nombreCliente"),
								   resultSet.getString("nombreContacto"),
								   resultSet.getString("apellidoContacto"),
								   resultSet.getString("telefono"),
								   resultSet.getString("fax"),
								   resultSet.getString("lineaDireccion1"),
								   resultSet.getString("lineaDireccion2"),
							       resultSet.getString("ciudad"),
								   resultSet.getString("region"),
								   resultSet.getString("pais"),
								   resultSet.getString("codigoPostal"),
								   resultSet.getInt("codigoEmpleadoRepVentas"),
								   resultSet.getInt("limiteCredito"),
								   resultSet.getString("DNI"),
								   resultSet.getString("mail"),
								   resultSet.getString("password"))
								  );
			}
			
			connection.close();
			
		}catch(ClassNotFoundException | SQLException e) {
		}
		
		return data;
		
	}
	
	

	@Override
	public List<Client> filter(String field, String searchCriteria) {
		List<Client> data = new ArrayList<>();
		Connection connection;
		PreparedStatement pst;
		ResultSet resultSet;
		
		String sql = "SELECT * FROM cliente WHERE field LIKE '%searchCriteria%'";
		
		try {
			Class.forName(db.getDriver());	
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
			
			pst = connection.prepareStatement(sql);
			resultSet = pst.executeQuery();
			//ExecuteQuery() no hay modificaciones en la tabla, solo se quiere consultar info
			
			while(resultSet.next()) { //mientras haya siguiente registro, se agregan los datos de la tabla a los parametros
				data.add(new Client(resultSet.getInt("codigoCliente"), 
						   resultSet.getString("nombreCliente"),
						   resultSet.getString("nombreContacto"),
						   resultSet.getString("apellidoContacto"),
						   resultSet.getString("telefono"),
						   resultSet.getString("fax"),
						   resultSet.getString("lineaDireccion1"),
						   resultSet.getString("lineaDireccion2"),
					       resultSet.getString("ciudad"),
						   resultSet.getString("region"),
						   resultSet.getString("pais"),
						   resultSet.getString("codigoPostal"),
						   resultSet.getInt("codigoEmpleadoRepVentas"),
						   resultSet.getInt("limiteCredito"),
						   resultSet.getString("DNI"),
						   resultSet.getString("mail"),
						   resultSet.getString("password"))
						  );
			}
			
			connection.close();
			
		}catch(ClassNotFoundException | SQLException e) {
		}
		
		return data;

	}
	
	public Client getClient(int codigo) {
		List<Client> data = new ArrayList<>();
		for(Client client: data) {
			if(client.getCodigoCliente() == codigo) {
				return client;
			}
		}
		return null;
	}
		
	public List<Client> getAll() {
		List<Client> data = new ArrayList<>();
		return data;
	}

}
