package Main;

public class RobotMasterChef extends Robotcocinero{
	
	
	public RobotMasterChef() {
		bateria = 2;
		nombre = "Robo-Master-Chef";
		identificacion = 001;
		UltimaAccion = "Ninguna";
	}

	public int prepeararIngredientes() {
		System.out.println(nombre+" preparo los ingredientes con exito.");
		bateria--;
		UltimaAccion = "Preparar Ingredientes";
		return 1;
	}

	public int cocinar() {
		System.out.println(nombre+" cocino con exito los ingredientes.");
		bateria--;
		UltimaAccion = "Cocinar";
		return 1;
	}

	public int servir() {
		System.out.println(nombre+" acaba de servir el platillo...");
		bateria--;
		UltimaAccion = "Servir";
		return 1;
	}


}
