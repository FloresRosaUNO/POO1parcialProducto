import java.util.ArrayList;

//Cree dos subclases llamadas ProductoPerecedero y ProductoNoPerecedero que hereden de la clase Producto.
//ProductoPerecedero debe tener un atributo adicional fechaDeCaducidad (String), mientras que
//ProductoNoPerecedero debe tener un atributo adicional tipo (String). Implemente los constructores y métodos
//necesarios en ambas subclases.
//Implemente un método calcularPrecioTotal en ambas subclases que tome un parámetro cantidadComprada y
//calcule el precio total de los productos vendidos teniendo en cuenta su cantidad y precio unitario.

public class Perecedero extends Producto implements Ordenable{
	
	public String fechaCaducidad;
	
	public String getFechaCaducidad() {
		return this.fechaCaducidad;
	}
	public void setFechaCaducidad(String f) {
		this.fechaCaducidad=f;
	}
	
	public Perecedero(String n, double p, int s, String f) {
		super(n, p, s);
		this.fechaCaducidad=f;
	}
	
	public double calcularPrecioTotal(int cantidadComprada) {
		System.out.println(" "+this.nombre+" x "+cantidadComprada+ " unidades = $ "+cantidadComprada*this.precio);
		return cantidadComprada*this.precio;
	}
	
	public String toString() {
		
		 return "[ "+this.nombre+" precio "+this.precio+ " Stock "+this.stock+ " fecha de caducidad "+this.fechaCaducidad;
	
	}
	@Override
	public double calcularTotal(ArrayList<Producto> n) {
		int contB=0;
		double orden=0;
		for(Producto e: n) {
			if(e instanceof Perecedero) {
				System.out.println(" 1  	"+e.nombre+" 				$ "+e.precio+" +");
				orden=orden+e.precio;
				contB=contB+1;
			}
		}
		
		System.out.println("\n"+contB+" 	Perecederos:		subtotalA  $$$$$$ "+orden);
		return orden;
	}

}
