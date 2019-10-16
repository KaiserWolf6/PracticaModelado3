public class Toluca extends Pizza {
	
	private String descripcion;
	private double costo;
	private String ingredientes;

	Toluca() {
		descripcion = "Pizza Toluca";
		costo = 276;
		ingredientes = "Pollo, masa delgada & queso chedar";
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