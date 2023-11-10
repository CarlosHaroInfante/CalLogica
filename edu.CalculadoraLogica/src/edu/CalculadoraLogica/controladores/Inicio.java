package edu.CalculadoraLogica.controladores;

import java.util.Scanner;

import edu.CalculadoraLogica.servicios.MenuImplementacion;
import edu.CalculadoraLogica.servicios.MenuInterfaz;


public class Inicio {

	public static void main(String[] args) {

		short opcion;
		boolean cerrarMenu = false;
		Scanner numerin = new Scanner (System.in);
		MenuInterfaz m1 = new MenuImplementacion();
		
		
		while (!cerrarMenu)
		{
			opcion = m1.menu(numerin);
			String pal1;
			String pal2;
		
		switch (opcion)	
		{
			case 0:
				System.out.println("[INFO] - Se cerrará el menú");
				cerrarMenu = true;
				break;
			
			case 1:
				System.out.println("[INFO] - Se Igualará");
				System.out.println("Escoge una palabra");
				pal1 = numerin.next(); 
				System.out.println("Escoge otra palabra");
				pal2 = numerin.next(); 
				System.out.println(pal1.equalsIgnoreCase(pal2));
				break;
			case 2:
				System.out.println("[INFO] - Se Desigualará");
				System.out.println("Escoge una palabra");
				pal1 = numerin.next(); 
				System.out.println("Escoge otra palabra");
				pal2 = numerin.next(); 
				System.out.println(!pal1.equalsIgnoreCase(pal2));
				
				break;
			default:
				System.out.println("[INFO] - Ninguna opción seleccionada disponible");
				break;
			
		}
		}
	}

}
