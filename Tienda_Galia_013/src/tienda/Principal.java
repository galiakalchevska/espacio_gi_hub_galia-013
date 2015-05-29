package tienda;

import java.util.*;

public class Principal {

	private static Scanner sc;

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		ArrayList<Object> productos = new ArrayList<Object>();
		ArrayList<Object> tiendas = new ArrayList<Object>();
		
	/*	Cliente aux = new Cliente();
		Cliente c1 = new Cliente(1, "Galia", "Kálchevska");	
		aux = c1;
		clientes.add(0,aux);
		System.out.println(clientes.get(0));
		Cliente c2 = new Cliente(2, "Rubén", "Martín");
		aux = c2;
		clientes.add(1,aux);
		System.out.println(clientes.get(1));
		Cliente c3 = new Cliente(3, "Álvaro", "Ballesteros");
		aux = c3;
		clientes.add(2,aux);
		System.out.println(clientes.get(2));
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
	    System.out.println(clientes.toString());
	  */
		
		Cliente c1 = new Cliente(1, "Galia", "Kálchevska");
		Cliente c2 = new Cliente(2, "Rubén", "Martín");	
		Cliente c3 = new Cliente(3, "Álvaro", "Ballesteros");

				clientes.add(c1);
				clientes.add(c2);
				clientes.add(c3);
	
		Vendedor v1 = new Vendedor(4, "Nikola", "Emilov");
		Vendedor v2 = new Vendedor(5, "David", "Nieto");
		Vendedor v3 = new Vendedor(6, "Francisco Javier", "Otero Herreros");

		vendedores.add(v1);
		vendedores.add(v2);
		vendedores.add(v3);
	
		Producto p1 = new Producto("P1", "Leche Semidesnatada", 1.0f);
		Producto p2 = new Producto("P2", "Leche Entera", 1.0f);
		Producto p3 = new Producto("P3", "Leche Desnatada", 1.0f);

		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
	
		Tienda t1 = new Tienda("calle Lirio,1,  Segovia", "T1", 921334455);
		Tienda t2 = new Tienda("calle Tomillo,12, Segovia", "T2", 921446677);
		Tienda t3 = new Tienda("calle Clavél,45,  Segovia", "T3", 921556688);

		tiendas.add(t1);
		tiendas.add(t2);
		tiendas.add(t3);
		
		System.out.println("Nueva venta:\n");
		
		Cliente c4 = new Cliente ();
		
		System.out.println("Introduzca ID del cliente:");
		sc = new Scanner(System.in);
		int id_aux = sc.nextInt();		
		c4.setId_cliente(id_aux);
		
		Vendedor v4 = new Vendedor();
		
		System.out.println("Introduzca ID del vendedor:");
		sc = new Scanner(System.in);
		id_aux = sc.nextInt();	
		v4.setId_vendedor(id_aux);
		
		Producto p4 = new Producto();
		
		System.out.println("Introduzca ID del producto:");
		sc = new Scanner(System.in);
		String idAux = sc.nextLine();	
		p4.setId_producto(idAux);
		
		Tienda t4 = new Tienda();
		
		System.out.println("Introduzca ID de la tienda:");
		sc = new Scanner(System.in);
		idAux = sc.nextLine();	
		t4.setId_tienda(idAux);
		
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH));
		String annio = Integer.toString(c.get(Calendar.YEAR));
		System.out.println(dia+"\n"+ mes+"\n"+annio);
		System.out.println(clientes.toString());	
		System.out.println(vendedores.toString());		
		System.out.println(productos.toString());
		System.out.println(tiendas.toString());	
	}
}
