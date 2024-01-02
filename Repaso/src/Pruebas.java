import java.util.Scanner;

public class Pruebas {
 
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		 
		 String nombre;
		 
		 int [] edad = new int [2];
		 String [] nombres = new String [3];
		 
		 System.out.print("Introduce tu nombre --> ");
		 nombres[0] = s.next();
		 
		 System.out.print("Introduce tu apellido --> ");
		 nombres[1] = s.next();
		 
		 System.out.print("Introduce tu edad --> ");
		 edad [0] = s.nextInt();
		 
		 System.out.print("Introduce tu ciudad --> ");
		 nombres [2] = s.next();
		 
		 System.out.print("Introduce tu CP --> ");
		 edad [1] = s.nextInt();
		 
		 System.out.print("Tu nombre completo es "+ nombres[0]+ " "+nombres[1]+" con una edad de "+edad[0]+" y vives en "
		 		+nombres[2]+" con CP: "+edad[1]);
		
		
	}
 
}
