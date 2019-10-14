public class Catsup extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Catsup() {
		costo = 2;
		descripcion = "Catsup";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}