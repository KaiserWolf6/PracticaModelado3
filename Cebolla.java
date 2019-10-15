public class Cebolla extends Ingredientes {

	private double costo;
	private String descripcion;

	Cebolla() {
		costo = 7;
		descripcion = "Cebolla";
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