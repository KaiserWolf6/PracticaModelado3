public class Italiana extends Pizza {

	private String descripcion;
	private double costo;

	CarnesFrias() {
		descripcion = "Pizza Italiana";
		costo = 206;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
		System.out.println("El costo es de: " + costo);
	}
	
}