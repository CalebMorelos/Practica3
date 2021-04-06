
public class gato extends Animal {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String especie(){
		return "Gato";
	}
}
