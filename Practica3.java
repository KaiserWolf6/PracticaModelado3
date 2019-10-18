import java.util.Scanner;
//import java.util.Random; 

public class Practica3  {

	private static void repetir(Ingredientes i, int comando) {
		Scanner s = new Scanner(System.in);
		switch (comando) {
			case 1:
				int chance = 1;
				int max = 2;
				while (chance < max) {
					System.out.println(i.getDescripcion());
					System.out.println(i.getDescripcion());
					double precio_doble = i.getCosto() + i.getCosto();
					System.out.println(precio_doble);
					chance++;
					System.out.println("Desea repetir de nuevo?");
					int repeat = s.nextInt();
					if (repeat == 1) {
						System.out.println(i.getDescripcion());
						System.out.println(i.getDescripcion());
						double precio_triple = i.getCosto() + i.getCosto() + i.getCosto();
						System.out.println(precio_triple);
						//System.out.println(i.getDescripcion());
					} else if (repeat == 2) {
						System.out.println(i.getDescripcion());
						break;
					} else {
						System.out.println("Debe seleccionar alguna opcion");
					} 
					if (chance == max) {
						System.out.println(i.getDescripcion());
					}
				}
				break;
			case 2:
				//System.out.println(i.getDescripcion());
				break;
			default:
				System.out.println("Debe seleccionar alguna opcion");
				break;
		}
	}


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
				System.out.println("Seleccione el tipo de pan para su Baguette");
				System.out.println("Opciones: " + "\n" + "1.- Pan de maiz" + "\n" + "2.- Pan de trigo" + "\n" + "3.- Pan de centeno");
				int opcion_pan = sc.nextInt();
				switch (opcion_pan) {
					case 1:
						System.out.println(pan_maiz.getDescripcion());
						System.out.println(pan_maiz.getCosto());
						//System.out.println("Escoja los ingredientes para su baguette: ");
						//System.out.println("Ingredientes: " + "\n" + "1.- Catsup" + "\n" + "2.- Cebolla" + "\n" + "3.- Jamon" + "\n" + "4.- Jitomate" + "\n" + "5.- Lechuga" + "\n" + "6.- Mayonesa" + "\n" + "7.- Mostaza" + "\n" + "8.- Pepperoni" + "\n" + "9.- Mostaza");
						System.out.println("Desea agregar pollo?");
						System.out.println("1.- Si" + "\n"+  "2.- No");
						int decision = sc.nextInt();
						if (decision == 1) {
							System.out.println(pollo.getDescripcion());
							System.out.println(pollo.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(pollo,comando);
						}  
						System.out.println("Desea agregar jitomate?");
						int decision2 = sc.nextInt();
						if (decision2 == 1) {
							System.out.println(jitomate.getDescripcion());
							System.out.println(jitomate.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(jitomate,comando);							 
						}
						System.out.println("Desea agregar catsup?");
						int decision3 = sc.nextInt();
						if (decision3 == 1) {
							System.out.println(catsup.getDescripcion());
							System.out.println(catsup.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(catsup,comando);							 
						}
						System.out.println("Desea agregar cebolla?");
						int decision4 = sc.nextInt();
						if (decision4 == 1) {
							System.out.println(cebolla.getDescripcion());
							System.out.println(cebolla.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(cebolla,comando);							 
						}
						System.out.println("Desea agregar jamon?");
						int decision5 = sc.nextInt();
						if (decision5 == 1) {
							System.out.println(jamon.getDescripcion());
							System.out.println(jamon.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(jamon,comando);							 
						}				
						System.out.println("Desea agregar mayonesa?");
						int decision6 = sc.nextInt();
						if (decision6 == 1) {
							System.out.println(mayonesa.getDescripcion());
							System.out.println(mayonesa.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(mayonesa,comando);							 
						}
						System.out.println("Desea agregar mostaza?");
						int decision7 = sc.nextInt();
						if (decision7 == 1) {
							System.out.println(mostaza.getDescripcion());
							System.out.println(mostaza.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(mostaza,comando);							 
						}
						System.out.println("Desea agregar pepperoni?");
						int decision8 = sc.nextInt();
						if (decision8 == 1) {
							System.out.println(pepperoni.getDescripcion());
							System.out.println(pepperoni.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(pepperoni,comando);							 
						}
						System.out.println("Desea agregar lechuga?");
						int decision9 = sc.nextInt();
						if (decision9 == 1) {
							System.out.println(lechuga.getDescripcion());
							System.out.println(lechuga.getCosto());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(lechuga,comando);							 
						}																										
						break;
					case 2:
						System.out.println(pan_trigo.getDescripcion());
						//System.out.println("Escoja los ingredientes para su baguette: ");
						//System.out.println("Ingredientes: " + "\n" + "1.- Catsup" + "\n" + "2.- Cebolla" + "\n" + "3.- Jamon" + "\n" + "4.- Jitomate" + "\n" + "5.- Lechuga" + "\n" + "6.- Mayonesa" + "\n" + "7.- Mostaza" + "\n" + "8.- Pepperoni" + "\n" + "9.- Mostaza");
						System.out.println("Desea agregar pollo?");
						System.out.println("1.- Si" + "\n"+  "2.- No");
						int decision0 = sc.nextInt();
						if (decision0 == 1) {
							System.out.println(pollo.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(pollo,comando);
						}  
						System.out.println("Desea agregar jitomate?");
						int decision02 = sc.nextInt();
						if (decision02 == 1) {
							System.out.println(jitomate.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(jitomate,comando);							 
						}
						System.out.println("Desea agregar catsup?");
						int decision03 = sc.nextInt();
						if (decision03 == 1) {
							System.out.println(catsup.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(catsup,comando);							 
						}
						System.out.println("Desea agregar cebolla?");
						int decision04 = sc.nextInt();
						if (decision04 == 1) {
							System.out.println(cebolla.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(cebolla,comando);							 
						}
						System.out.println("Desea agregar jamon?");
						int decision05 = sc.nextInt();
						if (decision05 == 1) {
							System.out.println(jamon.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(jamon,comando);							 
						}				
						System.out.println("Desea agregar mayonesa?");
						int decision06 = sc.nextInt();
						if (decision06 == 1) {
							System.out.println(mayonesa.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(mayonesa,comando);							 
						}
						System.out.println("Desea agregar mostaza?");
						int decision07 = sc.nextInt();
						if (decision07 == 1) {
							System.out.println(mostaza.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(mostaza,comando);							 
						}
						System.out.println("Desea agregar pepperoni?");
						int decision08 = sc.nextInt();
						if (decision08 == 1) {
							System.out.println(pepperoni.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(pepperoni,comando);							 
						}
						System.out.println("Desea agregar lechuga?");
						int decision09 = sc.nextInt();
						if (decision09 == 1) {
							System.out.println(lechuga.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(lechuga,comando);							 
						}
						break;
					case 3:
						System.out.println(pan_centeno.getDescripcion());
						//System.out.println("Escoja los ingredientes para su baguette: ");
						//System.out.println("Ingredientes: " + "\n" + "1.- Catsup" + "\n" + "2.- Cebolla" + "\n" + "3.- Jamon" + "\n" + "4.- Jitomate" + "\n" + "5.- Lechuga" + "\n" + "6.- Mayonesa" + "\n" + "7.- Mostaza" + "\n" + "8.- Pepperoni" + "\n" + "9.- Mostaza");
						System.out.println("Desea agregar pollo?");
						System.out.println("1.- Si" + "\n"+  "2.- No");
						int decision000 = sc.nextInt();
						if (decision000 == 1) {
							System.out.println(pollo.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(pollo,comando);
						}  
						System.out.println("Desea agregar jitomate?");
						int decision002 = sc.nextInt();
						if (decision002 == 1) {
							System.out.println(jitomate.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(jitomate,comando);							 
						}
						System.out.println("Desea agregar catsup?");
						int decision003 = sc.nextInt();
						if (decision003 == 1) {
							System.out.println(catsup.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(catsup,comando);							 
						}
						System.out.println("Desea agregar cebolla?");
						int decision004 = sc.nextInt();
						if (decision004 == 1) {
							System.out.println(cebolla.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(cebolla,comando);							 
						}
						System.out.println("Desea agregar jamon?");
						int decision005 = sc.nextInt();
						if (decision005 == 1) {
							System.out.println(jamon.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(jamon,comando);							 
						}				
						System.out.println("Desea agregar mayonesa?");
						int decision006 = sc.nextInt();
						if (decision006 == 1) {
							System.out.println(mayonesa.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(mayonesa,comando);							 
						}
						System.out.println("Desea agregar mostaza?");
						int decision007 = sc.nextInt();
						if (decision007 == 1) {
							System.out.println(mostaza.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(mostaza,comando);							 
						}
						System.out.println("Desea agregar pepperoni?");
						int decision008 = sc.nextInt();
						if (decision008 == 1) {
							System.out.println(pepperoni.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(pepperoni,comando);							 
						}
						System.out.println("Desea agregar lechuga?");
						int decision009 = sc.nextInt();
						if (decision009 == 1) {
							System.out.println(lechuga.getDescripcion());
							System.out.println("Desea repetir el mismo ingrediente?");
							System.out.println("1.- Si" + "\n"+  "2.- No");
							int comando = sc.nextInt();							
							repetir(lechuga,comando);							 
						}																										
						break;
					default:
						System.out.println("Debe seleccionar alguna opcion");	
						break;
				}
				break;
			default:
				System.out.println("Debe seleccionar alguna opcion");
				break;
		}
	}
}