public class Pepperoni extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Pepperoni() {
		costo = 13;
		descripcion = "Pepperoni";
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