
public class cocodrilo extends Animal {
	float largo;

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	@Override
	public String especie(){
		return "Cocodrilo";
	}
}
