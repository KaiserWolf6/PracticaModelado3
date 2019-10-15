public class Jitomate extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Jitomate() {
		costo = 3;
		descripcion = "Jitomate"
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public double getCosto() {
		return costo;
	}

}