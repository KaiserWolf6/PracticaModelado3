public class Jitomate extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Jitomate() {
		costo = 3;
		descripcion = "Jitomate"
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosto() {
		return costo;
	}

}