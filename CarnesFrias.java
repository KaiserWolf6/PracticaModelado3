public class CarnesFrias extends Pizza {
	
	private String descripcion;
	private double costo;
	private String ingredientes;

	CarnesFrias() {
		descripcion = "Pizza de Carnes Frias";
		costo = 256;
		ingredientes = "Salchicha, jamon, pollo, la masa es gruesa & queso manchego";
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