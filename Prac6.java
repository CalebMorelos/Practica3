import java.util.Scanner;

public class Prac6 {

	public static void main(String[] args) {
		Zoo zologico = new Zoo();
		veterinario doc = new veterinario();
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		int i=0;
		int eliminar;
		boolean salir = false;
		boolean salir2 = false;
		int opcion2;
		int paciente;
        while (!salir) {
        	System.out.println("Ingrese una opcion"); 
            System.out.println("1. Agregar animal");
            System.out.println("2. Eliminar animal");
            System.out.println("3. Mostrar animales");
            System.out.println("4. opciones de veterinario");
            System.out.println("5. salir");
            opcion = sc.nextInt();
            while((opcion > 5)||(opcion < 1)) {
        	System.out.println("Ingrese una opcion valida: ");
        	opcion = sc.nextInt();
            sc.nextLine();
            }
            if(opcion == 1) {
            	zologico.agregar(i);
            	i++;
            } else if(opcion == 2) {
            	System.out.println("Ingrese el numero del animal que desea eliminar: ");
            	eliminar = sc.nextInt();
                sc.nextLine();
            	zologico.eliminar(i, eliminar-1);
            	i--;
            } else if(opcion == 3) {
            	zologico.mostrar(i);
            } else if(opcion == 4){
            	
            	while(!salir2) {
        			System.out.println("Ingrese el numero del animal que desea llevar con el veterinario ");
        			paciente = sc.nextInt();
        	        sc.nextLine();
        	        while((paciente > i)||(paciente < 1)) {
        	        	System.out.println("Ingrese una opcion valida: ");
        	        	opcion2 = sc.nextInt();
        	            sc.nextLine();
        	        }
        			System.out.println("Ingrese la opcion que desea realizar con el veterinario: ");
        			System.out.println("1. Revisar la salud del animal");
        			System.out.println("2. Vacunar");
        			System.out.println("3. Tratamiento para mejorar salud");
        			System.out.println("4. Salir");
        			
        			opcion2 = sc.nextInt();
        	        sc.nextLine();
        	        
        	        while((opcion2 > 4)||(opcion2 < 1)) {
        	        	System.out.println("Ingrese una opcion valida: ");
        	        	opcion2 = sc.nextInt();
        	            sc.nextLine();
        	        }
        	        
        	        	
        	        if(opcion2 == 1) {
        	        	doc.consulta(zologico.getListaanimales(paciente-1));
        	        } else if(opcion2 == 2) {
        	        	zologico.vacunar(paciente-1);
        	        	doc.vacunar(zologico.getListaanimales(paciente-1));
        	        } else if(opcion2 == 3) {
        	        	zologico.tratamiento(paciente-1);
        	        	doc.tratamiento(zologico.getListaanimales(paciente-1));
        	        }else {
        	        	salir2 = true;
        	        }
            	}
            } else {
            	salir = true;
            }
        }
        sc.close();
	}

}
