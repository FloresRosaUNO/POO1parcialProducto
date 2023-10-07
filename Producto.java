
//Cree una clase llamada Producto que tenga los siguientes atributos: nombre (String), precio (double) y
//cantidadEnStock (int). Además, implemente un constructor y los métodos getters y setters necesarios.
public class Producto {

	public String nombre;
	public double precio;
	public int stock;

	public Producto(String n, double p, int s) {
		this.nombre=n;
		this.precio=p;
		this.stock=s;
		}
	
	public String getNombre() {
		return this.nombre ;
		}
	public void setNombre(String n) {
		this.nombre = n;
		}
	public double getPrecio() {
		return this.precio ;
		}
	public void setPrecio(double p) {
		this.precio = p;
		}
	public int getStock() {
		return this.stock ;
		}
	public void setStock(int s) {
		this.stock = s;
		}
	
	

}
