package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerCSV {

	public static String[] leer() {
		String[] data = null;
		File csvFile = new File("practica9.csv");
		if (csvFile.isFile()) {
			BufferedReader csvReader = null;
			try {
				FileReader fileReader = new FileReader(csvFile);
				csvReader = new BufferedReader(fileReader);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String row;
			try {
				while ((row = csvReader.readLine()) != null) {
				    data = row.split(",");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				csvReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;

		
		
	}
}