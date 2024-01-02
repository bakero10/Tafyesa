package clases;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		ArrayList<Palabra> lista = new ArrayList<Palabra>();
		Random rand = new Random();
		String resultado;
		
		Palabra palabra1 = new Palabra ("enough","bastante");
		Palabra palabra2 = new Palabra ("who","quien");
		Palabra palabra3 = new Palabra ("recently","recientemente");
		Palabra palabra4 = new Palabra ("until","hasta");
		Palabra palabra5 = new Palabra ("being","en");
		Palabra palabra6 = new Palabra ("sunbathing","tomarElSol");
		Palabra palabra7 = new Palabra ("somebody","alguien");
		Palabra palabra8 = new Palabra ("trouble","problema");
		Palabra palabra9 = new Palabra ("wayUpHigh","muyAlto");
		Palabra palabra10 = new Palabra ("land","tierra");
		Palabra palabra11 = new Palabra ("dare","atreverse");
		Palabra palabra12 = new Palabra ("above","encima");
		Palabra palabra13 = new Palabra ("away","lejos");
		Palabra palabra14 = new Palabra ("lullaby","cuna");
		Palabra palabra15 = new Palabra ("wish","deseo");
		Palabra palabra16 = new Palabra ("asWellAs","asiComo");
		Palabra palabra17 = new Palabra ("melt","derretir");
		Palabra palabra18 = new Palabra ("drops","gotas");
		Palabra palabra19 = new Palabra ("mice","raton");
		
		lista.add(palabra1);
		lista.add(palabra2);
		lista.add(palabra3);
		lista.add(palabra4);
		lista.add(palabra5);
		lista.add(palabra6);
		lista.add(palabra7);
		lista.add(palabra8);
		lista.add(palabra9);
		lista.add(palabra10);
		lista.add(palabra11);
		lista.add(palabra12);
		lista.add(palabra13);
		lista.add(palabra14);
		lista.add(palabra15);
		lista.add(palabra16);
		lista.add(palabra17);
		lista.add(palabra18);
		lista.add(palabra19);
		
		System.out.println("Ejercicio para aprender palabras en Ingles");

		int marcador = 0;
		
		while(marcador >= 0) {
			// Seleccionar una palabra aleatoria de la lista
			Palabra palabraAleatoria = lista.get(rand.nextInt(lista.size()));
			
			System.out.print(palabraAleatoria.getIngles()+" --> ");
			resultado = s.next();
		
			if(resultado.equalsIgnoreCase(palabraAleatoria.getCastellano())) {
				marcador++;
			}
			else {
				System.out.println("Error, la palabra correcta es: "+palabraAleatoria.getCastellano());
				System.out.println("Tu marcador es: "+marcador);
				marcador = -1;
			}
		}
		
		s.close();
	}
}