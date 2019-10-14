public class Jamon extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Jamon() {
		costo = 12;
		descripcion = "Jamon";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}