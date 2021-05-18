package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class practica9 {
	
	private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	public static void main(String[] args) {

		String[] calif = leerCSV.leer();
		
		alumnos.add(new Alumno("Caleb", 1270770));
		alumnos.add(new Alumno("Juan", 98765432));
		alumnos.add(new Alumno("Pedro", 67208734));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				String califEscrita = calif[j +(7*i)];
				califEscrita = califEscrita.replace("﻿", "");
				int calificacion = Integer.parseInt(califEscrita);
				alumnos.get(i).setCalificaciones(calificacion,j);
			}
		}
		
		float promedio;
		
		for (int i = 0; i < 3; i++) {
			promedio = 0;
			System.out.println("Nombre: "+alumnos.get(i).getNombre()+"	Matricula: "+alumnos.get(i).getMatricula());
			System.out.println("Calificaciones: ");
			for (int j = 0; j < 7; j++) {
				promedio += alumnos.get(i).getCalificacion(j);
				System.out.print(alumnos.get(i).getCalificacion(j)+", ");
			}
			promedio = (float) (promedio/7.0);
			alumnos.get(i).setPromedio(promedio);
			System.out.println("Promedio: "+ alumnos.get(i).getPromedio());
		}
		
		try {
            String ruta = "Calificaciones.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < 3; i++) {
    			promedio = 0;
    			bw.write("\nNombre: "+alumnos.get(i).getNombre()+"	Matricula: "+alumnos.get(i).getMatricula()+"\nCalificaciones: ");
    			for (int j = 0; j < 7; j++) {
    				promedio += alumnos.get(i).getCalificacion(j);
    				bw.write(alumnos.get(i).getCalificacion(j)+", ");
    			}
    			promedio = (float) (promedio/7.0);
    			alumnos.get(i).setPromedio(promedio);
    			bw.write("\nPromedio: "+ alumnos.get(i).getPromedio());
    		}
            
            System.out.println("Archivo creado con exito");
            
            
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
