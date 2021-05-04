package main;

public class Jugador {
	int numero;
	String nombre;
	int puntosAnotados;
	String posision;
	float estatura;
	
	
	
	public Jugador() {
		this.numero = 0;
		this.nombre = "";
		this.puntosAnotados = 0;
		this.posision = "";
		this.estatura = 0;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosAnotados() {
		return puntosAnotados;
	}
	public void agregarPuntosAnotados(int puntosAnotados) {
		this.puntosAnotados =+ puntosAnotados;
	}
	public String getPosision() {
		return posision;
	}
	public void setPosision(String posision) {
		this.posision = posision;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	
}
