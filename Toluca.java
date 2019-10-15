public class Toluca extends Pizza {
	
	private String descripcion;
	private double costo;

	Toluca() {
		descripcion = "Pizza Toluca";
		costo = 276;
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