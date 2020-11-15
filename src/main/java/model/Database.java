package model;

public class Database {
	
	//Conexion con la base de datos Jardineria
	
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	//Credenciales para realizar la conexion con la base de datos
	public Database() {
		this.driver = "com.mysql.jdbc.Driver";
		this.url = "jdbc:mysql://localhost:3306/jardineria";
		this.user = "jardineria";
		this.pass = "jardineria123";
	}

	//No se anaden los setter por seguridad, para que no se puedan inicializar desde fuera; solo se permite conseguir la info desde fuera
	public String getDriver() {
		return driver;
	}

	
	public String getUrl() {
		return url;
	}

	
	public String getUser() {
		return user;
	}

		public String getPass() {
		return pass;
	}

	
}
