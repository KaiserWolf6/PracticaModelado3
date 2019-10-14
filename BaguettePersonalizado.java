public class BaguettePersonalizado extends Baguette {

	Ingredientes ingredientes;

	public BaguettePersonalizado(Ingredientes ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String getDescripcion() {
		return ingredientes.getDescripcion() + "se agrego al baguette";
	}

	@Override
	public double getCosto() {
		return ingredientes.getCosto();
	}

	public void setDescripcion(String descripcion) {
		ingredientes.getDescripcion = descripcion;
	}

	public void setCosto(double costo) {
		ingredientes.getCosto() = costo;
	}

	public double precioTotal(double precio) {
		precio = ingredientes.getCosto() + ingredientes.getCosto();
		System.out.println("El precio del baguette es de: ");
		return precio;
	}
	
}