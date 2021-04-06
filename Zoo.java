import java.util.Scanner;

public class Zoo {
Animal[] listaanimales;

	public Zoo() {
		listaanimales = new Animal[100];
	}

	public void agregar(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la opcion del animal que desea agregar: ");
		System.out.println("1. Perro");
		System.out.println("2. Gato");
		System.out.println("3. Leon");
		System.out.println("4. Cocodrilo");
		System.out.println("5. Elefante");
		System.out.println("6. Jirafa");
		System.out.println("7. Gorilla");
		System.out.println("8. Aguila");
		System.out.println("9. Otroanilmal");
		
		int opcion;
		opcion = sc.nextInt();
        sc.nextLine();
        
        while((opcion > 9)||(opcion < 1)) {
        	System.out.println("Ingrese una opcion valida: ");
        	opcion = sc.nextInt();
            sc.nextLine();
        }
		
        if(opcion == 1) {
        	perro perro = new perro();
        	System.out.println("Ingrese el nombre del perro: ");
        	perro.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del perro: ");
        	perro.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El perro esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		perro.setVacunado(true);
        	} else {
        		perro.setVacunado(false);
        	}
        	System.out.println("Como es la salud del perro? ");
        	perro.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la raza del perro: ");
        	perro.setRaza(sc.nextLine());
        	sc.nextLine();
        	listaanimales[i] = perro;
        } else if(opcion == 2) {
        	gato gato = new gato();
        	System.out.println("Ingrese el nombre del gato: ");
        	gato.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del gato: ");
        	gato.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El gato esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		gato.setVacunado(true);
        	} else {
        		gato.setVacunado(false);
        	}
        	System.out.println("Como es la salud del gato? ");
        	gato.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese el color del gato");
        	gato.setColor(sc.nextLine());
        	sc.nextLine();
        	listaanimales[i] = gato;
        } else if(opcion == 3) {
        	leon leon = new leon();
        	System.out.println("Ingrese el nombre del leon: ");
        	leon.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del leon: ");
        	leon.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El leon esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		leon.setVacunado(true);
        	} else {
        		leon.setVacunado(false);
        	}
        	System.out.println("Como es la salud del leon? ");
        	leon.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("El leon es agresivo?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		leon.setAgresivo(true);
        	} else {
        		leon.setAgresivo(false);
        	}
        	listaanimales[i] = leon;
        } else if(opcion == 4) {
        	cocodrilo cocodrilo = new cocodrilo();
        	System.out.println("Ingrese el nombre del cocodrilo: ");
        	cocodrilo.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del cocodrilo: ");
        	cocodrilo.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El cocodrilo esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		cocodrilo.setVacunado(true);
        	} else {
        		cocodrilo.setVacunado(false);
        	}
        	System.out.println("Como es la salud del cocodrilo? ");
        	cocodrilo.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese el largo del cocodrilo en metros: ");
        	cocodrilo.setLargo(sc.nextFloat());
        	sc.nextLine();
        	listaanimales[i] = cocodrilo;
        } else if(opcion == 5) {
        	elefante elefante = new elefante();
        	System.out.println("Ingrese el nombre del elefante: ");
        	elefante.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del elefante: ");
        	elefante.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El elefante esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		elefante.setVacunado(true);
        	} else {
        		elefante.setVacunado(false);
        	}
        	System.out.println("Como es la salud del elefante? ");
        	elefante.setSalud(sc.nextLine());
        	sc.nextLine();
        	listaanimales[i] = elefante;
        } else if(opcion == 6) {
        	jirafa jirafa = new jirafa();
        	System.out.println("Ingrese el nombre de la jirafa: ");
        	jirafa.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad de la jirafa: ");
        	jirafa.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("La jirafa esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		jirafa.setVacunado(true);
        	} else {
        		jirafa.setVacunado(false);
        	}
        	System.out.println("Como es la salud de la jirafa? ");
        	jirafa.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la altura de la jirafa en metros: ");
        	jirafa.setAltura(sc.nextFloat());
        	sc.nextLine();
        	listaanimales[i] = jirafa;
        } else if(opcion == 7) {
        	gorilla gorilla = new gorilla();
        	System.out.println("Ingrese el nombre del gorilla: ");
        	gorilla.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del gorilla: ");
        	gorilla.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El gorilla esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		gorilla.setVacunado(true);
        	} else {
        		gorilla.setVacunado(false);
        	}
        	System.out.println("Como es la salud del gorilla? ");
        	gorilla.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese el peso del gorilla en kilogramos: ");
        	gorilla.setPeso(sc.nextFloat());
        	sc.nextLine();
        	System.out.println("Ingrese la altura del gorilla en metros: ");
        	gorilla.setAltura(sc.nextFloat());
        	sc.nextLine();
        	listaanimales[i] = gorilla;
        } else if(opcion == 8) {
        	aguila aguila = new aguila();
        	System.out.println("Ingrese el nombre del aguila: ");
        	aguila.setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del aguila: ");
        	aguila.setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El aguila esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		aguila.setVacunado(true);
        	} else {
        		aguila.setVacunado(false);
        	}
        	System.out.println("Como es la salud del aguila? ");
        	aguila.setSalud(sc.nextLine());
        	sc.nextLine();
        	System.out.println("La longitud del aguilal en metros: ");
        	aguila.setLongitud(sc.nextFloat());
        	sc.nextLine();
        	listaanimales[i] = aguila;
        } else {
        	listaanimales[i] = new Animal();
        	System.out.println("Ingrese el nombre del animal: ");
        	listaanimales[i].setNombre(sc.nextLine());
        	sc.nextLine();
        	System.out.println("Ingrese la edad del animal: ");
        	listaanimales[i].setEdad(sc.nextInt());
        	sc.nextLine();
        	System.out.println("El animal esta vacunado?");
        	System.out.println("1. Si");
        	System.out.println("2. No");
        	if(sc.nextInt() == 1) {
        		listaanimales[i].setVacunado(true);
        	} else {
        		listaanimales[i].setVacunado(false);
        	}
        	System.out.println("Como es la salud del animal? ");
        	listaanimales[i].setSalud(sc.nextLine());
        	sc.nextLine();
        }
	}
	
	public void eliminar(int i, int j) {
		for(int l=j;l<(i-1);l++) {
			listaanimales[l] = listaanimales[l+1];
		}
	}
	
	public void mostrar(int i) {
		for(int j = 0; j < i ; j++) {
			System.out.println((j+1)+". Nombre: " +listaanimales[j].getNombre() +"\n	Edad: "+listaanimales[j].getEdad()+ "\n		Especie: "+listaanimales[j].especie());
		}
	}

	public Animal getListaanimales(int i) {
		return listaanimales[i];
	}
	
	public void vacunar(int i) {
		listaanimales[i].vacunado = true;
	}

	public void tratamiento(int i) {
		listaanimales[i].salud = "buena";
	}
}
