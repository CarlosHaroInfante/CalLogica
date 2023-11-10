package edu.CalculadoraLogica.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	public short menu(Scanner numerin2)
	{
		short numElegido;
		
		System.out.println("------------------");
		System.out.println("[0] - Cerrar Menú");
		System.out.println("[1] - Igualdad");
		System.out.println("[2] - Desigualdad");
		System.out.println("------------------");
		System.out.println("Elige un numero");
		System.out.println("------------------");
		numElegido = numerin2.nextShort();
		return numElegido;
	}
}
