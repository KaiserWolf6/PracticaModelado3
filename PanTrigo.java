public class PanTrigo extends Ingredientes {

	private double costo;
	private String descripcion;

	PanTrigo() {
		costo = 4.50;
		descripcion = "Pan de Trigo";
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