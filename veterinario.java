public class veterinario {
	public void consulta(Animal paciente){
		if(paciente.isVacunado()) {
    		System.out.println("El/la "+paciente.especie()+" "+paciente.getNombre()+" esta vacunado y se encuentra con una salud "+paciente.getSalud());
    	} else {
    		System.out.println("El/la "+paciente.especie()+" "+paciente.getNombre()+" no esta vacunado y se encuentra con una salud "+paciente.getSalud());
    	}
		
		
		
	}
	
	public void vacunar(Animal paciente) {
		System.out.println("El/la "+paciente.especie()+" "+paciente.getNombre()+" fue vacunad@");
	}
	
	public void tratamiento(Animal paciente) {
		System.out.println("El/la "+paciente.especie()+" "+paciente.getNombre()+" recibio un tratamiento para mejorar su salud.");
	}
}
