public class Italiana extends Pizza {

	private String descripcion;
	private double costo;
	private String ingredientes;

	Italiana() {
		descripcion = "Pizza Italiana";
		costo = 206;
		ingredientes = "Jamon, queso chedar & la masa es delgada";
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public double getCosto() {
		return costo;
		//System.out.println("El costo es de: " + costo);
	}

	@Override
	public String getIngredientes() {
		return ingredientes;
	}	
	
}