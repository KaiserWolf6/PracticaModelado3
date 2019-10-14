public class Lechuga extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Lechuga() {
		costo = 1;
		descripcion = "Lechuga";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}