public class Pollo extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Pollo() {
		costo = 15;
		descripcion = "Pollo";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}