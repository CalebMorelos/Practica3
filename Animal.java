
public class Animal {
	String nombre;
	int edad;
	boolean vacunado;
	String salud;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	public String getSalud() {
		return salud;
	}
	public void setSalud(String salud) {
		this.salud = salud;
	}
	
	
	public String especie(){
		return "Animal";
	}
	
}
