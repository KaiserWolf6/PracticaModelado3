public class Cuba extends Pizza {
	
	private String descripcion;
	private double costo;
	private String ingredientes;

	Cuba() {
		descripcion = "Pizza Cuba";
		costo = 216;
		ingredientes = "Pollo, masa gruesa & queso manchego";
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