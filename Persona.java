import java.util.Scanner;

public class Persona {
String nombre;
String apellidoP;
String apellidoM;
String Sexo;
String CURP;
String RFC;
	
	public static void main(String[] args) {
		Persona p1 = new Persona(); 
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Ingrese el nombre: ");
		p1.nombre = sc.nextLine();
			System.out.println("Ingrese el apellido paterno: ");
		p1.apellidoP = sc.nextLine();
			System.out.println("Ingrese el apellido materno: ");
		p1.apellidoM = sc.nextLine();	
			System.out.println("Ingrese el sexo M o F: ");
		p1.Sexo = sc.nextLine();
			System.out.println("Ingrese la entidad federativa de nacimiento abreviada con dos siglas: ");
		String EF = sc.nextLine();
			
		System.out.println("Ingrese el dia de nacimiento: ");
		int dia = sc.nextInt();
		System.out.println("Ingrese el mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.println("Ingrese el año de nacimiento: ");
		int año = sc.nextInt();
				
		p1.CURP = String.valueOf(p1.apellidoP.charAt(0));
		
		for(int i=1; i< p1.apellidoP.length(); i++) {
			if((p1.apellidoP.charAt(i) == 'a')|(p1.apellidoP.charAt(i) == 'e')|(p1.apellidoP.charAt(i) == 'i')|(p1.apellidoP.charAt(i) == 'o')|(p1.apellidoP.charAt(i) == 'u')) {
				p1.CURP = p1.CURP + String.valueOf(p1.apellidoP.charAt(i));
				i = p1.apellidoP.length();
			}
		}
		
		p1.CURP = p1.CURP + String.valueOf(p1.apellidoM.charAt(0));
		
		String remplazo = p1.CURP;
		
		p1.CURP = p1.CURP + String.valueOf(p1.nombre.charAt(0));
		
		p1.CURP = p1.CURP.toUpperCase();
		
		if((p1.CURP=="BUEI”)||(p1.CURP==“KOGE”)||(p1.CURP==“BUEY”)||(p1.CURP==“CACA”)||(p1.CURP==“KOJO”)||(p1.CURP==“KAKA”)||(p1.CURP==“CACO”)||(p1.CURP==“KULO”)||(p1.CURP==“CAGA”)||(p1.CURP==“MAME”)||(p1.CURP==“CAGO”)||(p1.CURP==“MAMO”)||(p1.CURP==“CAKA”)||(p1.CURP==“MEAR”)||(p1.CURP==“COGE”)||(p1.CURP==“MEON”)||(p1.CURP==“COJA”)||(p1.CURP==“MION”)||(p1.CURP==“COJE”)||(p1.CURP==“MOCO”)||(p1.CURP==“COJI”)||(p1.CURP==“MULA”)||(p1.CURP==“COJO”)||(p1.CURP==“PEDA”)||(p1.CURP==“CULO”)||(p1.CURP==“PEDO”)||(p1.CURP==“FETO”)||(p1.CURP==“PENE”)||(p1.CURP==“GUEY”)||(p1.CURP==“PUTA”)||(p1.CURP==“JOTO”)||(p1.CURP==“PUTO”)||(p1.CURP==“KACA”)||(p1.CURP==“QULO”)||(p1.CURP==“KACO”)||(p1.CURP==“RATA”)||(p1.CURP==“KAGA”)||(p1.CURP==“RUIN”)||(p1.CURP==“KAGO")) {
			p1.CURP = remplazo + "x";
		}
		
		p1.RFC=p1.CURP;
		
		if(año > 2000) {
			año = año - 2000;
			if(año < 10) {
				p1.CURP = p1.CURP + String.valueOf(0) + String.valueOf(año);
			}
			else {
				p1.CURP = p1.CURP + String.valueOf(año);
			}
		}
		else if(año==2000) {
			p1.CURP = p1.CURP + String.valueOf(0) + String.valueOf(0);
		}
		else {
			p1.CURP = p1.CURP + String.valueOf(año-1900);
		}
		
		if(mes < 10) {
			p1.CURP = p1.CURP + String.valueOf(0) + String.valueOf(mes);
		}
		else {
			p1.CURP = p1.CURP + String.valueOf(mes);
		}
		
		if(dia < 10) {
			p1.CURP = p1.CURP + String.valueOf(0) + String.valueOf(dia);
		}
		else {
			p1.CURP = p1.CURP + String.valueOf(dia);
		}
		
		p1.CURP = p1.CURP + p1.Sexo;
		
		p1.CURP = p1.CURP + EF;
		
		for(int i=1; i< p1.apellidoP.length(); i++) {
			if((p1.apellidoP.charAt(i) != 'a')&(p1.apellidoP.charAt(i) != 'e')&(p1.apellidoP.charAt(i) != 'i')&(p1.apellidoP.charAt(i) != 'o')&(p1.apellidoP.charAt(i) != 'u')) {
				p1.CURP = p1.CURP + String.valueOf(p1.apellidoP.charAt(i));
				i = p1.apellidoP.length();
			}
		}
		
		for(int i=1; i< p1.apellidoM.length(); i++) {
			if((p1.apellidoM.charAt(i) != 'a')&(p1.apellidoM.charAt(i) != 'e')&(p1.apellidoM.charAt(i) != 'i')&(p1.apellidoM.charAt(i) != 'o')&(p1.apellidoM.charAt(i) != 'u')) {
				p1.CURP = p1.CURP + String.valueOf(p1.apellidoM.charAt(i));
				i = p1.apellidoM.length();
			}
		}
		
		for(int i=1; i< p1.nombre.length(); i++) {
			if((p1.nombre.charAt(i) != 'a')&(p1.nombre.charAt(i) != 'e')&(p1.nombre.charAt(i) != 'i')&(p1.nombre.charAt(i) != 'o')&(p1.nombre.charAt(i) != 'u')) {
				p1.CURP = p1.CURP + String.valueOf(p1.nombre.charAt(i));
				i = p1.nombre.length();
			}
		}
		
		p1.CURP = p1.CURP.toUpperCase();
		
		p1.RFC = p1.RFC+"-";
		if(año > 2000) {
			año = año - 2000;
			if(año < 10) {
				p1.RFC = p1.RFC + String.valueOf(0) + String.valueOf(año);
			}
			else {
				p1.RFC = p1.RFC + String.valueOf(año);
			}
		}
		else if(año==2000) {
			p1.RFC = p1.RFC + String.valueOf(0) + String.valueOf(0);
		}
		else {
			p1.RFC = p1.RFC + String.valueOf(año-1900);
		}
		
		if(mes < 10) {
			p1.RFC = p1.RFC + String.valueOf(0) + String.valueOf(mes);
		}
		else {
			p1.RFC = p1.RFC + String.valueOf(mes);
		}
		
		if(dia < 10) {
			p1.RFC = p1.RFC + String.valueOf(0) + String.valueOf(dia);
		}
		else {
			p1.RFC = p1.RFC + String.valueOf(dia);
		}
		
		System.out.println("Nombre: "+p1.apellidoP + " "+p1.apellidoM + " "+p1.nombre+"\nCURP:"+p1.CURP+"\nRFC: "+p1.RFC);
		
		sc.close();
	}
}
