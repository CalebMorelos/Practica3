
public class jirafa extends Animal {
	float altura;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public String especie(){
		return "Jirafa";
	}
}
