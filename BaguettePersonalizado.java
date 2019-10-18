//import java.util.ArrayList;

/*En esta clase se utiliza adapter*/
public class BaguettePersonalizado implements WaySub{

	/*Ingrediente para el baguette personalizado*/
	Ingredientes ingredientes;
	/*Variable de la clase Baguettes*/
	Baguette baguettes;
	/*Booleano que nos permite agregar los ingredientes al baguette*/
	boolean agregar = false;

	/*Constructor del Baguette Personalizado, recibe un ingrediente*/
	public BaguettePersonalizado(Baguette baguette) {
		//this.ingredientes = ingredientes;
		this.baguettes = baguette;
		//agregar = false;
		//lista_ingredientes = new ArrayList<Ingredientes>();

	}

	/*Obtiene la descripcion del ingrediente*/
	@Override
	public String getDescripcion() {
		return baguettes.getDescripcion();
	}

	/*Obtiene el costo del ingrediente*/
	@Override
	public double getCosto() {
		return baguettes.getCosto();
	}

	/*Pone la descripcion del ingrediente en el baguette*/
	public void setDescripcion(String descripcion) {
		this.baguettes.setDescripcion(descripcion);
	}

	/*Pone el precio del ingrediente*/
	public void setCosto(double costo) {
		this.baguettes.setCosto(costo);
	}

	@Override
	public String getIngredientes() {
		String random = "";
		return random;
	}

	/*Permite hacer la suma total del baguette personalizado
	 *precio el valor de un ingrediente
	 *precio2 el valor del segundo ingrediente
	 *regresa un double
	 */
	public double precioTotal(double precio, double precio2) {
		precio = ingredientes.getCosto();
		precio2 = ingredientes.getCosto();
		double precio3 = precio + precio2;
		System.out.println("El precio del baguette es de: ");
		return precio3;
	}

	
}