package uml;

import java.util.Date;

public class Order {
	
	//Referencia a la tabla Pedido de la base de datos Jardineria
	private int codigoPedido;
	private Date fechaPedido;
	private Date fechaEsperada;
	private Date fechaEntrega;
	private String estado;
	private String comentarios;
	private int codigoCliente;
	
	
	
	//Constructores
	public Order() {
	}
	
	
	public Order(Date fechaPedido, Date fechaEsperada, int codigoCliente) {
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEsperada;
		this.codigoCliente = codigoCliente;
		
	}

		
	public Order(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, String estado,
			String comentarios, int codigoCliente) {
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.comentarios = comentarios;
		this.codigoCliente = codigoCliente;
	}


	
	//Getters y Setters
	public int getCodigoPedido() {
		return codigoPedido;
	}


	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}


	public Date getFechaPedido() {
		return fechaPedido;
	}


	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}


	public Date getFechaEsperada() {
		return fechaEsperada;
	}


	public void setFechaEsperada(Date fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}


	public Date getFechaEntrega() {
		return fechaEntrega;
	}


	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public int getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	
	
}
