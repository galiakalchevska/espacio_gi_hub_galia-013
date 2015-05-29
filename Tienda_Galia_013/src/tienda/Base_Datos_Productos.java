package tienda;

import java.util.*;

public class Base_Datos_Productos extends ArrayList<Object> {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Producto> productos;

	public Base_Datos_Productos() {
		productos = new ArrayList<Producto>();
	}

	public void addProducto(Producto producto) {
		productos.add(producto);
	}

	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
	}

	public Producto obtenerPosicion(int posicion) {
		return productos.get(posicion);
	}

	/*public Producto buscarProducto() {
		for (int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i));
		}
		return null;
	}*/
}
