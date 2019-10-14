public class Cuba extends Pizza {
	
	private String descripcion;
	private double costo;

	CarnesFrias() {
		descripcion = "Pizza Cuba";
		costo = 216;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
		System.out.println("El costo es de: " + costo);
	}

}