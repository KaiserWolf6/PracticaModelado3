public class Jamon extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Jamon() {
		costo = 12;
		descripcion = "Jamon";
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