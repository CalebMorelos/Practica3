package Main;

public class robotMiniCaliente extends Robotcocinero{

	public robotMiniCaliente() {
		bateria = 1;
		nombre = "Robo-Mini-Caliente";
		identificacion = 003;
		UltimaAccion = "Ninguna";
	}

	public int prepeararIngredientes() {
		System.out.println(nombre+" no preparo los ingredientes con exito.");
		bateria--;
		UltimaAccion = "Preparar Ingredientes";
		return 2;
	}

	public int cocinar() {
		System.out.println(nombre+" cocino con exito los ingredientes.");
		bateria--;
		UltimaAccion = "Cocinar";
		return 1;
	}

	public int servir() {
		System.out.println(nombre+" no sirvio el platillo correctamente.");
		bateria--;
		UltimaAccion = "Preparar Ingredientes";
		return 2;
	}

}
