public class Productos implements WaySub {
	
	private String descripcion;
	private double costo;
	private double precio_total;

	@Override
	public double getCosto() {
		return costo;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public double precioTotal(double a, double b) {
		precio_total = a + b;
		return precio_total;
	}

}