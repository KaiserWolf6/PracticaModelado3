public class PanMaiz extends Ingredientes {

	private double costo;
	private String descripcion;

	PanMaiz() {
		costo = 2.50;
		descripcion = "Pan de trigo";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}