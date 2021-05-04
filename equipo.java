package main;

public class equipo {
	
	private String nombre;
	private String division;
	private String NombreDelEstrenador;
	private int torneosConParticion = 1;
	private int torneosGanados = 0;
	private int torneosPerdidos = 0;
	private int cont = 0;
	private Jugador[] jugadores = new Jugador[10];
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getNombreDelEstrenador() {
		return NombreDelEstrenador;
	}
	public void setNombreDelEstrenador(String nombreDelEstrenador) {
		NombreDelEstrenador = nombreDelEstrenador;
	}
	public int getTorneosConParticion() {
		return torneosConParticion;
	}
	public void setTorneosConParticion(int torneosConParticion) {
		this.torneosConParticion = torneosConParticion;
	}
	public int getTorneosGanados() {
		return torneosGanados;
	}
	public void setTorneosGanados(int torneosGanados) {
		this.torneosGanados = torneosGanados;
	}
	public int getTorneosPerdidos() {
		return torneosPerdidos;
	}
	public void setTorneosPerdidos(int torneosPerdidos) {
		this.torneosPerdidos = torneosPerdidos;
	}
	public String getJugador(int i) {
		return jugadores[i].getNombre();
	}
	
	public boolean agregarjugador(String n, String p, float estatura) {
		if(cont >= 10) {
			System.out.println("El equipo ya esta completo.");
			return false;
		}
		for(int i = 0;i<cont;i++) {
			if(jugadores[i].getNombre()==n) {
				System.out.println("El equipo ya tiene a este integrante.");
				return false;
			}
		}
		jugadores[cont] = new Jugador();
		
		jugadores[cont].setNombre(n);
		jugadores[cont].setNumero(cont+1);
		jugadores[cont].setPosision(p);
		jugadores[cont].setEstatura(estatura);
		
		cont++;
		
		return true;
	}
	
	public void agregaranotacionesaljugador(int i, int j) {
		jugadores[i].agregarPuntosAnotados(j);
	}
	
	public int devolverCantidadDeJugadores() {
		return cont;
	}
	
	public int devolverCantidadDePuntosAnotadosPorJugadores() {
		int suma = 0;
		for(int i = 0; i <=cont; i++) {
			suma = suma + jugadores[i].getPuntosAnotados();
		}
		return suma;
	}
}
