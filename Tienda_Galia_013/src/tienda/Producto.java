package tienda;

public class Producto {
	
	private String id_producto;
	private String descripcion;
	private float tamaño_envase;

	public Producto(){
	}
	
	public Producto(String id_producto, String descripcion,float tamaño_envase){
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.tamaño_envase = tamaño_envase;
	}
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getTamaño_envase() {
		return tamaño_envase;
	}
	public void setTamaño_envase(float tamaño_envase) {
		this.tamaño_envase = tamaño_envase;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id_producto=");
		builder.append(id_producto);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", tamaño_envase=");
		builder.append(tamaño_envase);
		builder.append("]\n");
		return builder.toString();
	}
}
