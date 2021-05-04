package main;

import java.util.Scanner;

public class Torneo {

	static String nombre;
	static String region;
	static int equiposParticipantes = 5;
	static int partidosJugados=0;
	static int partidosPendientes = 10;
	static int cont = 0;
	static equipo[] equipos = new equipo[equiposParticipantes];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del torneo: ");
		nombre = sc.nextLine();
		sc.nextLine();
		System.out.println("Ingrese la region del torneo: ");
		region = sc.nextLine();
		sc.nextLine();
		
		for(int i = 0; i < equiposParticipantes;i++) {
			System.out.println("Registre el equipo numero "+(cont+1));
			agregarEquipo();
		}
		
		System.out.println("El torneo va a empezar\nParticipantes del torneo:");
		actualizarestado();
		
		int par1 = 1;
		int par2 = 2;
		int vic1 = 0;
		int vic2 = 0;
		int vic3 = 0;
		int vic4 = 0;
		int vic5 = 0;
		int apollo = 0;
		while(partidosPendientes !=0) {
			System.out.println("Registre el resultado del partido del equipo "+equipos[par1-1].getNombre()+" contra el equipo "+equipos[par2-1]+".");
			System.out.println("Si el equipo "+equipos[par1].getNombre()+" gano ingrese 1, de lo contrario ingrese 0.");
			apollo = sc.nextInt();
			sc.nextLine();
			if(apollo == 1) {
				switch(par1) {
					case 1:
						vic1++;
						break;
					case 2:
						vic2++;
						break;
					case 3:
						vic3++;
						break;
					case 4:
						vic4++;
						break;
					case 5:
						vic5++;
						break;
				}
			}else {
				switch(par2) {
					case 1:
						vic1++;
						break;
					case 2:
						vic2++;
						break;
					case 3:
						vic3++;
						break;
					case 4:
						vic4++;
						break;
					case 5:
						vic5++;
						break;
				}
			}
			System.out.println("Ingrese las anotaciones por jugador.");
			for(int g = 0; g<2;g++) {
				if(g == 0) {
					System.out.println("Equipo "+equipos[par1].getNombre());
					for(int h = 0; h<=equipos[par1].devolverCantidadDeJugadores();h++) {
						System.out.println("Ingrese las anotaciones del jugador "+equipos[par1].getJugador(h));
						equipos[par1].agregaranotacionesaljugador(h, sc.nextInt());
					}
					
				} else {
					System.out.println("Equipo "+equipos[par2].getNombre());
					for(int h = 0; h<=equipos[par2].devolverCantidadDeJugadores();h++) {
						System.out.println("Ingrese las anotaciones del jugador "+equipos[par2].getJugador(h));
						equipos[par2].agregaranotacionesaljugador(h, sc.nextInt());
					}
				}
			}
			if(par1 == 5) {
				par1 = 1;
			} else {
				par1++;
			}
			if(par2 == 5) {
				par2 = 1;
			} else {
				par2++;
			}
			partidosPendientes--;
			partidosJugados++;
			actualizarestado();
		}
		
		System.out.println("El ganador del torneo es el equipo ");
		
		if((vic1 > vic2)&&(vic1 > vic3)&&(vic1 > vic4)&&(vic1 > vic5)) {
			System.out.print(equipos[0].getNombre()+"con "+vic1+" victorias");
		} else if((vic2> vic3)&&(vic2 > vic4)&&(vic2 > vic5)) {
			System.out.print(equipos[1].getNombre()+"con "+vic2+" victorias");
		} else if((vic3 > vic4)&&(vic3 > vic5)) {
			System.out.print(equipos[2].getNombre()+"con "+vic3+" victorias");
		} else if(vic4>vic5) {
			System.out.print(equipos[3].getNombre()+"con "+vic4+" victorias");
		}else {
			System.out.print(equipos[4].getNombre()+"con "+vic5+" victorias");
		}
		
		
		sc.close();
	}
	
	public static boolean agregarEquipo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del equipo: ");
		String n = sc.nextLine();
		sc.nextLine();
		System.out.println("Ingrese la division del equipo");
		String d = sc.nextLine();
		sc.nextLine();
		System.out.println("Ingrese el nombre de el entrenador del equipo");
		String e = sc.nextLine();
		sc.nextLine();
		
		if(cont >= 5) {
			System.out.println("Ya no hay campo para mas equipos.");
			
			return false;
		}
		for(int i = 0;i<cont;i++) {
			if(equipos[i].getNombre()==n) {
				System.out.println("Este equipo ya esta registrado");
				
				return false;
			}
			for(int j = 0; j<10;j++) {
				if(equipos[i].getJugador(j)==n) {
					System.out.println("Este este jugador ya esta registrado en otro equipo.");
					
					return false;
				}
			}
		}
		equipos[cont] = new equipo();
		
		equipos[cont].setNombre(n);
		equipos[cont].setDivision(d);
		equipos[cont].setNombreDelEstrenador(e);
		
		while(equipos[cont].devolverCantidadDeJugadores() <= 10) {
			System.out.println("Registre al jugador numero "+(equipos[cont].devolverCantidadDeJugadores()+1));
			agregarJugador();
		}
		
		cont++;

		return true;
	}
	
	public static void agregarJugador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre de el jugador: ");
		String n = sc.nextLine();
		sc.nextLine();
		System.out.println("Ingrese la posicion de el jugador");
		String p = sc.nextLine();
		System.out.println("Ingrese la estatura de el jugador");
		float e = sc.nextFloat(); 
		if(equipos[cont].agregarjugador(n, p, e)) {
			System.out.println("Jugador registrado con exito.");
		}else {
			System.out.println("El Jugador no se pudo registrar.");
		}

	}
	
	public static void actualizarestado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Torneo "+nombre+"\nRegion:"+region+"\n"+equiposParticipantes+" equipos participantes\nPartidos Jugados: "+partidosJugados+"\nPartidos pendientes: "+partidosPendientes);
		for(int j = 0; j<equiposParticipantes;j++) {
			System.out.println("Equipo: "+equipos[j].getNombre()+"--Division: "+equipos[j].getDivision());
			System.out.println("Puntos totales anotados por los jugadores: "+equipos[j].devolverCantidadDePuntosAnotadosPorJugadores());
			for(int k = 0; k<equipos[j].devolverCantidadDeJugadores();k++) {
				System.out.println("	"+(k+1)+" "+equipos[j].getJugador(k));
			}
		}

	}
}
