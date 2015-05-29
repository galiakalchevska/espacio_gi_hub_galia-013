package tienda;

import java.util.Date;

public class Venta {

	private int id_cliente;
	private int id_Producto;
	private int id_tienda;
	private Date fecha_hora;

	public Venta() {

	}
	public Venta(int id_cliente, int id_Producto, int id_tienda, Date fecha_hora) {
		this.id_cliente = id_cliente;
		this.id_Producto = id_Producto;
		this.id_tienda = id_tienda;
		this.fecha_hora = fecha_hora;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}

	public int getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}

	public Date getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Venta [id_cliente=");
		builder.append(id_cliente);
		builder.append(", id_Producto=");
		builder.append(id_Producto);
		builder.append(", id_tienda=");
		builder.append(id_tienda);
		builder.append(", fecha_hora=");
		builder.append(fecha_hora);
		builder.append("]\n");
		return builder.toString();
	}
}
