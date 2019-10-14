public class Brasileira extends Pizza {
	
	private String descripcion;
	private double costo;

	CarnesFrias() {
		descripcion = "Pizza Brasileira";
		costo = 290;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
		System.out.println("El costo es de: " + costo);
	}

}