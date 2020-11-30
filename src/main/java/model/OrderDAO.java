package model;

import java.util.*
;
import java.sql.*;
import uml.Order;

public class OrderDAO implements ICRUD{
	
	//Credenciales para la base de datos
	Database db = new Database();

	//implementa los m�todos de la interfaz ICRUD (CRUD)
	
	@Override
	public String insert(Object obj) {
		Order order = (Order) obj;
		Connection connection;
		PreparedStatement pst;
		String sql = "INSERT INTO pedido VALUES(?,?,?,?,?,?,?)";
		String answer = "";
		
		try {
			Class.forName(db.getDriver());
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass()); //usa las credenciales para la conexion
			
			pst = connection.prepareStatement(sql); 
			
			//le asigna estos valores a la consulta sql
			pst.setInt(1, order.getCodigoPedido());
			pst.setDate(2, null, (Calendar) order.getFechaPedido());
			pst.setDate(3, null, (Calendar) order.getFechaEsperada());
			pst.setDate(4, null, (Calendar) order.getFechaEntrega());
			pst.setString(5, order.getEstado());
			pst.setString(6, order.getComentarios());
			pst.setInt(7, order.getCodigoCliente());
			
			
			int fields = pst.executeUpdate(); //ejecuta la consulta sql e indica cuantas filas tiene 
			//!! se usa executeUpdate() porque hay una modificacion en la tabla (insert)
			
			answer = "Se insertaron "+ fields + " filas nuevas.";
			
			connection.close(); // se cierra la conexion
					
			
		//ClassNotFoundException por si no puede cargar el driver; SQLException erro de conexion a la base de datos
		}catch(ClassNotFoundException | SQLException e) {	
		}
		
		return answer;
	
	}
	

	@Override
	public String delete(Object obj) {
		Order order = (Order) obj;
		Connection connection;
		PreparedStatement pst;
		String sql = "DELETE FROM pedido WHERE codigoPedido=?";
		String answer = "";
		
		try {
			Class.forName(db.getDriver());
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass()); //usa las credenciales para la conexion
			
			pst = connection.prepareStatement(sql); 
			
			//le asigna estos valores a la consulta sql
			pst.setInt(1, order.getCodigoPedido());
			
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
		Order order = (Order) obj;
		Connection connection;
		PreparedStatement pst;
		String sql = "UPDATE pedido SET fechaPedido=?, fechaEsperada=?,"
					+ " fechaEntrega=?, estado=?, comentarios=?, codigoCliente=? WHERE codigoPedido=?";
		String answer = "";
		
		try {
			Class.forName(db.getDriver());
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass()); //usa las credenciales para la conexion
			
			pst = connection.prepareStatement(sql); 
			
			//le asigna estos valores a la consulta sql
			pst.setDate(1, null, (Calendar) order.getFechaPedido());
			pst.setDate(2, null, (Calendar) order.getFechaEsperada());
			pst.setDate(3, null, (Calendar) order.getFechaEntrega());
			pst.setString(4, order.getEstado());
			pst.setString(5, order.getComentarios());
			pst.setInt(6, order.getCodigoCliente());
			pst.setInt(7, order.getCodigoPedido());
			
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
	public List<Order> read() {
		List<Order> data = new ArrayList<>();
		Connection connection;
		PreparedStatement pst;
		ResultSet resultSet;
		
		String sql = "SELECT * FROM pedido";
		
		try {
			Class.forName(db.getDriver());	
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
			
			pst = connection.prepareStatement(sql);
			resultSet = pst.executeQuery();
			//ExecuteQuery() no hay modificaciones en la tabla, solo se quiere consultar info
			
			while(resultSet.next()) { //mientras haya siguiente registro, se agregan los datos de la tabla a los parametros
				data.add(new Order(resultSet.getInt("codigoPedido"), 
								   resultSet.getDate("fechaPedido"),
								   resultSet.getDate("fechaEsperada"),
								   resultSet.getDate("fechaEntrega"),
								   resultSet.getString("estado"),
								   resultSet.getString("comentarios"),
								   resultSet.getInt("codigoCliente"))
								  );
			}
			
			connection.close();
			
		}catch(ClassNotFoundException | SQLException e) {
		}
		
		return data;
		
	}

	@Override
	public List<Order> filter(String field, String searchCriteria) {
		List<Order> data = new ArrayList<>();
		Connection connection;
		PreparedStatement pst;
		ResultSet resultSet;
		
		String sql = "SELECT * FROM pedido WHERE field LIKE '%searchCriteria%'";
		
		try {
			Class.forName(db.getDriver());	
			connection = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPass());
			
			pst = connection.prepareStatement(sql);
			resultSet = pst.executeQuery();
			//ExecuteQuery() no hay modificaciones en la tabla, solo se quiere consultar info
			
			while(resultSet.next()) { //mientras haya siguiente registro, se agregan los datos de la tabla a los parametros
				data.add(new Order(resultSet.getInt("codigoPedido"), 
								   resultSet.getDate("fechaPedido"),
								   resultSet.getDate("fechaEsperada"),
								   resultSet.getDate("fechaEntrega"),
								   resultSet.getString("estado"),
								   resultSet.getString("comentarios"),
								   resultSet.getInt("codigoCliente"))
								  );
			}
			
			connection.close();
			
		}catch(ClassNotFoundException | SQLException e) {
		}
		
		return data;
	}
	
	public Order getOrder(int codigoPedido) {
		List<Order> data = new ArrayList<>();
		for (Order order: data) {
			if(order.getCodigoPedido() == codigoPedido) {
				return order;
			}
		}
		
		return null;
	}
	
	

}
