public class Mayonesa extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Mayonesa() {
		costo = 4;
		descripcion = "Mayonesa";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}