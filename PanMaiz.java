public class PanMaiz extends Ingredientes {

	private double costo;
	private String descripcion;

	PanMaiz() {
		costo = 2.50;
		descripcion = "Pan de trigo";
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