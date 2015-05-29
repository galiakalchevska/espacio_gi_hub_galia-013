package tienda;

public class Producto {
	
	private String id_producto;
	private String descripcion;
	private float tama�o_envase;

	public Producto(){
	}
	
	public Producto(String id_producto, String descripcion,float tama�o_envase){
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.tama�o_envase = tama�o_envase;
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
	public float getTama�o_envase() {
		return tama�o_envase;
	}
	public void setTama�o_envase(float tama�o_envase) {
		this.tama�o_envase = tama�o_envase;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id_producto=");
		builder.append(id_producto);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", tama�o_envase=");
		builder.append(tama�o_envase);
		builder.append("]\n");
		return builder.toString();
	}
}
