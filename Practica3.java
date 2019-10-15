import java.util.Scanner;
import java.util.Random;

public class Practica3  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
						System.out.println("Carnes Frias");
						break;
					case 2:
						System.out.println("Brasileira");
						break;
					case 3:
						System.out.println("Italiana");
						break;
					case 4:
						System.out.println("Cuba");
						break;
					case 5:
						System.out.println("Toluca");
						break;
					default:
						System.out.println("Debe seleccionar alguna opcion");
						break;
				}
				break;
			case 2:
				System.out.println("En mantenimiento...");
				break;
			default:
				System.out.println("Debe seleccionar alguna opcion");
				break;
		}
	}
}