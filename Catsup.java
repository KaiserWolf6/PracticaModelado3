public class Catsup extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Catsup() {
		costo = 2;
		descripcion = "Catsup";
	}

	@Override
	public double getCosto() {
		return costo;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

}