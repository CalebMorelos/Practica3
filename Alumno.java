package Main;

public class Alumno {

	private String nombre;
	private int matricula;
	private int[] calificaciones = new int[7];
	private float promedio;
	
	public Alumno(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
	}

	public void setCalificaciones(int calificacion, int index) {
		calificaciones[index] = calificacion;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public int getCalificacion(int index) {
		return calificaciones[index];
	}
	
	
	
}
