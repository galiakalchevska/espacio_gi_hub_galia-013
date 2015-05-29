package tienda;

public class Tienda {

	private String direccion;
	private String id_tienda;
	private int telefono;

	public Tienda() {
	}

	public Tienda(String direccion, String id_tienda, int telefono) {
		this.direccion = direccion;
		this.id_tienda = id_tienda;
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(String id_tienda) {
		this.id_tienda = id_tienda;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [direccion=");
		builder.append(direccion);
		builder.append(", id_tienda=");
		builder.append(id_tienda);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append("]\n");
		return builder.toString();
	}
}
