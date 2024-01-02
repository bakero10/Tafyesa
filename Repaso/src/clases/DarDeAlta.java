package clases;

import java.util.Scanner;

public class DarDeAlta {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		Persona p = new Persona ("Ana","Bolea","Bernal","Huesca",23);
		
		System.out.println("La primera persona es "+p.toString());
		
	}
}
