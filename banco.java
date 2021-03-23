package practica5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class banco {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		cuenta[] clientes = new cuenta[100];
		
		
		boolean salir = false;
        int opcion;
        int opcion2;
        
        int i;
        int PIN;
        double cantidad;
        int acceso = 0;
        
        boolean pinduplicado = false;
        boolean verificador = false;
        
        int numerodecuentas = 0;
 
        while (!salir) {
 
            System.out.println("1. Crear cuenta");
            System.out.println("2. Acceder a cuenta existente");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
                sc.nextLine();
 
                switch (opcion) {
                    case 1: 
                    	System.out.println("Ha selecciona crear cuenta");
                    	clientes[numerodecuentas] = new cuenta();
                    	System.out.println("Ingrese su nombre: ");
                    	clientes[numerodecuentas].setNombre(sc.nextLine());
                    	sc.nextLine();
                    	System.out.println("Creé un PIN que servira para ingresar a su cuenta: ");
                    	PIN = sc.nextInt();
                    	sc.nextLine();
                    	if(numerodecuentas != 0) {
                    		do {
                    			pinduplicado = false;
                    			for(i=0;i<numerodecuentas;i++) {
                    				
                    				if(PIN == clientes[i].getPIN()) {
                    					pinduplicado = true;
                    				}
                    				
                    			}
                    			if(pinduplicado == true) {
                    				System.out.println("Ingrese otro PIN: ");
                    				PIN = sc.nextInt();
                    				sc.nextLine();
                    			}
                    			
                    		}while(pinduplicado == true);
                    	}
                    	clientes[numerodecuentas].setPIN(PIN);
                    	System.out.println("La cuenta fue creada con exito. ");
                    	System.out.println("Ingrese la cantidad que desea depositar: ");
                    	clientes[numerodecuentas].setSaldo(sc.nextDouble());
                    	sc.nextLine();
                    	System.out.println("La cantidad de "+ clientes[numerodecuentas].getSaldo()+"m.n. ha sido ingresada con exito.");
                    	System.out.println("Gracias por usar nuestro servicio. \n Regresando al menu...");
                    	numerodecuentas++;
                    	break;
                    case 2:
                    	System.out.println("Ha selecciona acceder a cuenta existente");
                    	System.out.println("Ingrese su PIN: ");
                    	PIN = sc.nextInt();
                    	for(i=0;i<numerodecuentas;i++) {
            				if(PIN == clientes[i].getPIN()) {
            					verificador = true;
            					acceso = i;
            				}
            					
            			}
                    	if(verificador == true) {
                    		System.out.println("Bienvenido "+clientes[acceso].getNombre());
                    		System.out.println("Su saldo actual es de "+clientes[acceso].getSaldo());
                    		try {
                    			System.out.println("1. Retiro");
                    			System.out.println("2. Deposito");
                    			System.out.println("3. salir");
                                System.out.println("Escribe una de las opciones");
                                opcion2 = sc.nextInt();
                                sc.nextLine();
                 
                                switch (opcion2) {
                                    case 1:
                                    	System.out.println("Ingrese la cantidad que desea retirar");
                                        cantidad = sc.nextDouble();
                                        sc.nextLine();
                                        while((cantidad > clientes[acceso].getSaldo())||(cantidad<0)) {
                                        	System.out.println("La cantidad que desea retirar no es valida.\nIngrese una cantidad que desee retirar valida: ");
                                            cantidad = sc.nextDouble();
                                            sc.nextLine();
                                        }
                                        clientes[acceso].setSaldo(clientes[acceso].getSaldo()-cantidad);
                                        System.out.println("Ha retirado la cantidad de "+cantidad+"\nSaldo restante en la cuenta: "+clientes[acceso].getSaldo()+"m.n");
                                    	break;
                                    case 2:
                                    	System.out.println("Ingrese la cantidad que desea depositar");
                                        cantidad = sc.nextDouble();
                                        sc.nextLine();
                                        while(cantidad<0) {
                                        	System.out.println("No puede ingresar un numero negativo\nIngrese una cantidad que desee depositar valida: ");
                                            cantidad = sc.nextDouble();
                                            sc.nextLine();
                                        }
                                        clientes[acceso].setSaldo(clientes[acceso].getSaldo()+cantidad);
                                        System.out.println("Ha depositado la cantidad de "+cantidad+"\nSaldo actual en la cuenta: "+clientes[acceso].getSaldo()+"m.n");
                                    	break;
                                    default:
                                    	break;
                                } 
                            } catch (InputMismatchException  f) {
                                System.out.println("Debes insertar un número");
                                sc.next();
                            
                            }
                    	}
                    	else {
                    		System.out.println("No se encontro una cuenta que coincida con el PIN ingresado.");
                    	}
                    	break;
                    default:
                    	salir = true;
                } 
            } catch (InputMismatchException  f) {
                System.out.println("Debes insertar un número");
                sc.next();
            
            }
            
        }
        sc.close();
	}

}
