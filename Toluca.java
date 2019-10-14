public class Toluca extends Pizza {
	
	private String descripcion;
	private double costo;

	Toluca() {
		descripcion = "Pizza Toluca";
		costo = 276;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
		System.out.println("El costo es de: " + costo);
	}

}