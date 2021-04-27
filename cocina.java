package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class cocina{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		RobotMasterChef R1 = new RobotMasterChef();
		robotMiniCortador R2 = new robotMiniCortador();
		robotMiniCaliente R3 = new robotMiniCaliente();
		
		int robotsel = 0;
		int opcion = 0;
		
		boolean sinbateria= false;
		
		int cortar = 0;
		int cocinar = 0;
		int servir = 0;
		
		boolean salir = false;
		
		while (!salir) {
			 
            System.out.println("1. "+R1.nombre+"	Identificaion:"+R1.identificacion+"		Bateria:"+R1.bateria+"	Ultima Accion:"+R1.UltimaAccion);
            System.out.println("2. "+R2.nombre+"	Identificaion:"+R2.identificacion+"		Bateria:"+R2.bateria+"	Ultima Accion:"+R2.UltimaAccion);
            System.out.println("3. "+R3.nombre+"	Identificaion:"+R3.identificacion+"		Bateria:"+R3.bateria+"	Ultima Accion:"+R3.UltimaAccion);
 
            try {
 
                System.out.println("Seleccione el numero del Robot que desea controllar");
                robotsel = sc.nextInt();
                sc.nextLine();
                
                do{
                if(robotsel == 1) {
            		if(R1.bateria==0) {
            			sinbateria = true;
            		}
            	} else if(robotsel == 2){
            		if(R2.bateria==0) {
            			sinbateria = true;
            		}
            	} else if(robotsel == 3){
            		if(R1.bateria==0) {
            			sinbateria = true;
            		}
            	}
                if(sinbateria) {
                	System.out.println("El robot que selecciono no tiene bateria, seleccione otro");
                	robotsel = sc.nextInt();
                    sc.nextLine();
                }
                }while(sinbateria);
                 
                System.out.println("1. Cortar ingredientes");
                System.out.println("2. Cocinar ingredientes");
                System.out.println("3. Servir");
             
                try {
             
                	System.out.println("Seleccione la accion que desea realizar con el robot");
                            opcion = sc.nextInt();
                            sc.nextLine();
             
                            switch (opcion) {
                                case 1: 
                                	if(robotsel == 1) {
                                		cortar = R1.prepeararIngredientes();
                                	} else if(robotsel == 2){
                                		cortar = R2.prepeararIngredientes();
                                	} else if(robotsel == 3){
                                		cortar = R3.prepeararIngredientes();
                                	}
                                	break;
                                case 2:
                                	if(robotsel == 1) {
                                		cocinar = R1.cocinar();
                                	} else if(robotsel == 2){
                                		cocinar = R2.cocinar();
                                	} else if(robotsel == 3){
                                		cocinar = R3.cocinar();
                                	}
                                	break;
                                case 3:
                                	if(robotsel == 1) {
                                		servir = R1.servir();
                                		salir = true;
                                	} else if(robotsel == 2){
                                		servir = R2.servir();
                                		salir = true;
                                	} else if(robotsel == 3){
                                		servir = R3.servir();
                                		salir = true;
                                	}
                                	break;
                                default:
                                    System.out.println("Seleccione una de las opciones validas");
                            } 
                        } catch (InputMismatchException  f) {
                            System.out.println("Debes insertar un número");
                            sc.next();
                        
                        }
                 
                    
                
            } catch (InputMismatchException  f) {
                System.out.println("Debes insertar un número");
                sc.next();
            
            }
            
		}
		if((cortar!=1)||(cocinar!=1)||(servir!=1)) {
			System.out.println("oh no el platillo fue un desastre!!");
		}else {
			System.out.println("¡Hurra! El plato estaba delicioso");
		}
		if(cortar==0) {
			System.out.println("No cortaron los ingredientes");
		}
		if(cortar==2) {
			System.out.println("Cortaron los ingredientes mal");
		}
		if(cocinar==0) {
			System.out.println("No cocinaron los ingredientes");
		}
		if(cocinar==2) {
			System.out.println("Cocinaron mal los ingredientes");
		}
		if(servir==2) {
			System.out.println("Sirvieron mal el platillo");
		}
        sc.close();
	}

}
