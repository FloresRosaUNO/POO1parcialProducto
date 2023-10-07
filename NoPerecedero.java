import java.util.ArrayList;

public class NoPerecedero extends Producto implements Ordenable{
	
	public String tipo;
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo=t;
	}
	
	public NoPerecedero(String n, double p, int s, String t) {
		super(n, p,s);
		this.tipo=t;
	}
	
	public double calcularPrecioTotal(int cantidadComprada) {
		System.out.println(" "+this.nombre+" x "+cantidadComprada+ " unidades = $ "+cantidadComprada*this.precio);
		return cantidadComprada*this.precio;
	}
	
	public String toString() {
		
		 return "[ "+this.nombre+" precio "+this.precio+ " Stock "+this.stock+ " tipo "+this.tipo;
	
	}
	@Override
	public double calcularTotal(ArrayList<Producto> n) {
		int contA=0;
		double orden=0;
		for(Producto e: n) {
			if(e instanceof NoPerecedero) {
				System.out.println(" 1 	"+e.nombre+" 				$ "+e.precio+" +");
				orden=orden+e.precio;
				contA=contA+1;
			}
		}
		System.out.println("\n"+contA+" 	No Perecederos:		subtotalB  $$$$$$ "+orden);
		return orden;
	}
}
