public class CarnesFrias extends Pizza {
	
	private String descripcion;
	private double costo;

	CarnesFrias() {
		descripcion = "Pizza de Carnes Frias";
		costo = 256;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
		System.out.println("El costo es de: " + costo);
	}

}