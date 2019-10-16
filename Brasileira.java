public class Brasileira extends Pizza {
	
	private String descripcion;
	private double costo;
	private String ingredientes;

	Brasileira() {
		descripcion = "Pizza Brasileira";
		costo = 290;
		ingredientes = "Salchicha, queso manchego & la masa es gruesa";
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