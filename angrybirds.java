
public class angrybirds {

	public static void main(String[] args) {
		
		red p1 = new red();
		chuck p2 = new chuck();
		hal p3 = new hal();
		
		pajaro[] birds = new pajaro[3];
		
		birds[0] = p1;
		birds[1] = p2;
		birds[2] = p3;
		
		p1.setColor("rojo");
		p2.setColor("amarillo");
		p3.setColor("verde");
		
		ataque(p1.getColor(), "nada", p1.getPoder());
		ataque(p2.getColor(), p2.getHabilidad(), p2.getPoder());
		ataque(p3.getColor(), p3.getHabilidad(), p3.getPoder());
	}
	
	public static void ataque(String c, String h, String d) {
		if(h == "nada") {
			System.out.println("se ha lanzado el pajaro de color " +c +" y ha ocacionado un daño "+d);
		}
		else {
			System.out.println("se ha lanzado el pajaro de color "+c +", ha usado su habilidad "+h +" y ha ocacionado un daño "+d);
		}
		
	}

}