package tienda;

public class Cliente {

	private int id_cliente;
	private static String nombre_cliente;
	private static String apellidos_cliente;

	public Cliente() {

	}

	public Cliente(int id_cliente, String nombre_cliente,
			String apellidos_cliente) {
		this.id_cliente = id_cliente;
		Cliente.nombre_cliente = nombre_cliente;
		Cliente.apellidos_cliente = apellidos_cliente;
	}

	public  int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public static String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		Cliente.nombre_cliente = nombre_cliente;
	}

	public static String getApellidos_cliente() {
		return apellidos_cliente;
	}

	public void setApellidos_cliente(String apellidos_cliente) {
		Cliente.apellidos_cliente = apellidos_cliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id_cliente=");
		builder.append(id_cliente);
		builder.append(", nombre_cliente=");
		builder.append(nombre_cliente);
		builder.append(", apellidos_cliente=");
		builder.append(apellidos_cliente);
		builder.append("]\n");
		return builder.toString();
	}
}
