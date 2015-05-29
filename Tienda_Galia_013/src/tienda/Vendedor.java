package tienda;

public class Vendedor {

	private int id_vendedor;
	private String nombre_vendedor;
	private String apellidos_vendedor;

	public Vendedor() {
	}

	public Vendedor(int id_vendedor, String nombre_vendedor,
			String apellidos_vendedor) {
		this.id_vendedor = id_vendedor;
		this.nombre_vendedor = nombre_vendedor;
		this.apellidos_vendedor = apellidos_vendedor;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getNombre_vendedor() {
		return nombre_vendedor;
	}

	public void setNombre_vendedor(String nombre_vendedor) {
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getApellidos_vendedor() {
		return apellidos_vendedor;
	}

	public void setApellidos_vendedor(String apellidos_vendedor) {
		this.apellidos_vendedor = apellidos_vendedor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendedor [id_vendedor=");
		builder.append(id_vendedor);
		builder.append(", nombre_vendedor=");
		builder.append(nombre_vendedor);
		builder.append(", apellidos_vendedor=");
		builder.append(apellidos_vendedor);
		builder.append("]\n");
		return builder.toString();
	}
}
