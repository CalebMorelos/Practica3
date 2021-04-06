
public class perro extends Animal {
	String raza;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public String especie(){
		return "Perro";
	}
}
