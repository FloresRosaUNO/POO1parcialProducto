import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComercio {

	public static void main(String[] args) {
//		#### punto 1: Herencia ####		
// Muestre ejemplos de creación de objetos de ambas subclases, agregándolos a una lista de productos y calcule el
// precio total en función de una cantidad comprada.

		Perecedero pan =new Perecedero("Pan",30,50,"12/10/2023");
		NoPerecedero sal = new NoPerecedero("Sal",14,100,"sal");
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		lista.add(sal);
		lista.add(pan);
		mostrar(lista);
		
		sal.calcularPrecioTotal(3);
		pan.calcularPrecioTotal(2);
		
		lista.add(new Perecedero("Fideos",78.25,300,"27/12/2023"));
		lista.add(new Perecedero("RAVIOL",90.25,200,"27/12/2023"));
		lista.add(new Perecedero("GALLE",43.55,500,"27/02/2024"));
		lista.add(new Perecedero("SALCHI",103.25,300,"27/11/2023"));
		lista.add(new NoPerecedero("GARBAN",37.33,300,"ENLATADOS"));
		lista.add(new NoPerecedero("PATE",22.05,300,"ENLATADOS"));
		lista.add(new NoPerecedero("Lavand",55.60,300,"HIGIENE"));
		lista.add(new NoPerecedero("PapelH",17,300,"Higiene"));
		lista.add(new NoPerecedero("Sopa",10.38,300,"cubos sopa"));
		
//	 	### punto 2: interfaces y polimorfismos ###	
//	Cree una lista de productos de tipo Producto (que incluye tanto ProductoPerecedero como
//	ProductoNoPerecedero) y calcule el precio total de la orden utilizando polimorfismo y la interfaz Ordenable.
			
		ArrayList<Producto> compra = new ArrayList<Producto>();

		compra.addAll(lista);
		compra.add(sal);
		compra.add(sal);
		compra.add(pan);
		compra.add(lista.get(3));
		compra.add(lista.get(4));
		calcularOrden(compra);

/*  #####  Punto 3: Ordenamiento y Búsqueda  #####
Cree una lista de al menos 10 productos de diferentes tipos (algunos perecederos y otros no perecederos).
Implemente una función que ordene esta lista de productos por nombre de producto en orden alfabético. Puede
utilizar el método Collections.sort() o implementar su propio algoritmo de ordenamiento.
Implemente un método que busque un producto por su nombre en la lista y muestre su información si se
encuentra. Puede utilizar un enfoque de búsqueda lineal o binaria, dependiendo de su preferencia.*/
		
		ordenar(lista);
		mostrar(lista);
		buscar("Sal",lista);
		buscar("RAVIOL",lista);
		buscar("Jabon",lista);
		
	}
	
	public static void mostrar(ArrayList<Producto> k) {
		System.out.println("Lista de Productos : ");
		for(Producto a: k) {
			
			System.out.println(""+a.toString());	
			
		}
	}
	public static void calcularOrden(ArrayList<Producto> j) {
		System.out.println("\n###### Orden de compras ####### ");
		System.out.println(" Un. x  Producto    	 costo");
		Perecedero a = new Perecedero("",0,0,"");
		NoPerecedero b = new NoPerecedero("",0,0,"");
		
		System.out.println("\n 					Total "+(a.calcularTotal(j)+b.calcularTotal(j)));
		
	}
	public static void ordenar(ArrayList<Producto> i){
		Collections.sort(i, new Comparator<Producto>(){
			public int compare(Producto a, Producto b) {
				return new String(a.getNombre()).compareTo(new String(b.getNombre()));					
			}
		});
	}
	public static void buscar(String q, ArrayList<Producto> r) {
		int contador=0;
		System.out.println("\nResultado de la busqueda del producto: "+q);
		for(Producto e: r) {
			if(q.equals(e.nombre)) {
				System.out.println("\n"+e.toString());
			}
			else {
			contador++;
			}
			if(contador==r.size()) {
				System.out.println("NO se encontro producto en la lista");
			}
		}
	}
}


