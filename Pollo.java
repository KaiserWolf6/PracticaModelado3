public class Pollo extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Pollo() {
		costo = 15;
		descripcion = "Pollo";
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