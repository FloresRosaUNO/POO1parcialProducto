import java.util.ArrayList;

//Cree una interfaz llamada Ordenable que declare un método calcularTotal que tome como parámetro una lista
//de productos y calcule el precio total de la orden.
//Implemente la interfaz Ordenable en las clases ProductoPerecedero y ProductoNoPerecedero. Asegúrese de
//que los métodos implementados utilicen la información de los atributos de cada producto.

public interface Ordenable {
	
	double calcularTotal(ArrayList<Producto> n);

}
