public class Mayonesa extends Ingredientes {
	
	private double costo;
	private String descripcion;

	Mayonesa() {
		costo = 4;
		descripcion = "Mayonesa";
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