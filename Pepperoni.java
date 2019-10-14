public class Pepperoni extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Pepperoni() {
		costo = 13;
		descripcion = "Pepperoni";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}