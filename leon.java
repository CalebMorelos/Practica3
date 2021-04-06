
public class leon extends Animal {
	boolean agresivo;

	public boolean isAgresivo() {
		return agresivo;
	}

	public void setAgresivo(boolean agresivo) {
		this.agresivo = agresivo;
	}
	
	@Override
	public String especie(){
		return "Leon";
	}
}
