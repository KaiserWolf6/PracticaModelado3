public class Brasileira extends Pizza {
	
	private String descripcion;
	private double costo;

	CarnesFrias() {
		descripcion = "Pizza Brasileira";
		costo = 290;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public double getCosto() {
		return costo;
		System.out.println("El costo es de: " + costo);
	}

}