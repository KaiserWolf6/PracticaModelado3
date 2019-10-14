public class PanCenteno extends Ingredientes {

	private double costo;
	private String descripcion;

	PanCenteno() {
		costo = 3.50;
		descripcion = "Pan de Centeno";
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}