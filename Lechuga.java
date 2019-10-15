public class Lechuga extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Lechuga() {
		costo = 1;
		descripcion = "Lechuga";
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