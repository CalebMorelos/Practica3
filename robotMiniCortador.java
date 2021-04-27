package Main;

public class robotMiniCortador extends Robotcocinero{

	public robotMiniCortador() {
		bateria = 1;
		nombre = "Robo-Mini-Cortador";
		identificacion = 002;
		UltimaAccion = "Ninguna";
	}
	
	public int prepeararIngredientes() {
		System.out.println(nombre+" preparo los ingredientes con exito.");
		bateria--;
		UltimaAccion = "Preparar Ingredientes";
		return 1;
	}

	public int cocinar() {
		System.out.println(nombre+" no tuvo exito al cocinar los ingredientes.");
		bateria--;
		UltimaAccion = "Cocinar";
		return 2;
	}

	public int servir() {
		System.out.println(nombre+" no sirvio el platillo correctamente.");
		bateria--;
		UltimaAccion = "Preparar Ingredientes";
		return 2;
	}

}
