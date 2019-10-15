public class Mostaza extends Ingredientes {

	private double costo;
	private String descripcion;

	Mostaza() {
		costo = 3;
		descripcion = "Mostaza";
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