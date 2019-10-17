import java.util.Scanner;
import java.util.Random;

public class Practica3  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WaySub pizza1 = new Cuba();
		WaySub pizza2 = new Brasileira();
		WaySub pizza3 = new Toluca();
		WaySub pizza4 = new Italiana();
		WaySub pizza5 = new CarnesFrias();
		Ingredientes pollo = new Pollo();
		Ingredientes cebolla = new Cebolla();
		Ingredientes catsup = new Catsup();
		Ingredientes jamon = new Jamon();
		Ingredientes jitomate = new Jitomate();
		Ingredientes lechuga = new Lechuga();
		Ingredientes mayonesa = new Mayonesa();
		Ingredientes mostaza = new Mostaza();
		Ingredientes pan_centeno = new PanCenteno();
		Ingredientes pan_maiz = new PanMaiz();
		Ingredientes pan_trigo = new PanTrigo();
		Ingredientes pepperoni = new Pepperoni();
		Baguette baguette = new Baguette();
		WaySub baguette_personalizado = new BaguettePersonalizado(baguette);
		System.out.println("Bienvenido a WaySub!");
		System.out.println("Por favor, que desea ordenar: ");
		System.out.println("1.- Pizza" + "\n" + "2.- Baguette");
		int opcion;
		opcion = sc.nextInt();
		switch (opcion) {
			case 1:
				System.out.println("Estas son nuestras pizzas: " + "\n" + "1.- Carnes frias" + "\n" + "2.- Brasileira" + "\n" + "3.- Italiana" + "\n" + "4.- Cuba" + "\n" + "5.- Toluca");
				int opcion_pizzas;
				opcion_pizzas = sc.nextInt();
				switch (opcion_pizzas) {
					case 1:
						//System.out.println("Carnes Frias");
						System.out.println("Usted ordeno: " + pizza5.getDescripcion());
						System.out.println("Tiene un costo de: " + pizza5.getCosto());
						System.out.println("Sus ingredientes son: " + pizza5.getIngredientes());
						break;
					case 2:
						//System.out.println("Brasileira");
						System.out.println("Usted ordeno: " + pizza2.getDescripcion());
						System.out.println("Tiene un costo de: " + pizza2.getCosto());
						System.out.println("Sus ingredientes son: " + pizza2.getIngredientes());						
						break;
					case 3:
						//System.out.println("Italiana");
						System.out.println("Usted ordeno: " + pizza4.getDescripcion());
						System.out.println("Tiene un costo de: " + pizza4.getCosto());
						System.out.println("Sus ingredientes son: " + pizza4.getIngredientes());					
						break;
					case 4:
						//System.out.println("Cuba");
						System.out.println("Usted ordeno: " + pizza1.getDescripcion());
						System.out.println("Tiene un costo de: " + pizza1.getCosto());
						System.out.println("Sus ingredientes son: " + pizza1.getIngredientes());					
						break;
					case 5:
						//System.out.println("Toluca");
						System.out.println("Usted ordeno: " + pizza3.getDescripcion());
						System.out.println("Tiene un costo de: " + pizza3.getCosto());
						System.out.println("Sus ingredientes son: " + pizza3.getIngredientes());					
						break;
					default:
						System.out.println("Debe seleccionar alguna opcion");
						break;
				}
				break;
			case 2:
				//WaySub baguette = new BaguettePersonalizado();
				//System.out.println("En mantenimiento");
				System.out.println("Que ingredientes desea agregar a su baguette?");
				System.out.println("Para poder agregar un ingrediente debe ingresar 1, en caso contrario 0");
				System.out.println("Si da 0, se sumara el precio de todos los ingredientes y le daremos cuanto debe de pagar en total");	
				int comando;
				//comando = sc.nextInt();
				baguette_personalizado.agregarIngrediente(pollo);
				baguette_personalizado.agregarCosto(pollo);
				baguette_personalizado.agregarIngrediente(pan_trigo);
				baguette_personalizado.agregarCosto(pan_trigo);
				baguette_personalizado.agregarIngrediente(pepperoni);
				baguette_personalizado.agregarCosto(pepperoni);
				baguette_personalizado.agregarIngrediente(jitomate);
				baguette_personalizado.agregarCosto(jitomate);
				baguette_personalizado.agregarIngrediente(lechuga);
				baguette_personalizado.agregarCosto(lechuga);

				break;
			default:
				System.out.println("Debe seleccionar alguna opcion");
				break;
		}
	}
}