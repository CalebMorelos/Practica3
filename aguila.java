
public class aguila extends Animal {
	float longitud;
	
	public void chillar() {
		System.out.println(nombre +" el aguila realizo un chillido.");
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	@Override
	public String especie(){
		return "Aguila";
	}
}
