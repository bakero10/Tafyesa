package clases;

import java.util.HashMap;

public class Pistas {

	//Declaramos el HashMap
	private HashMap<String, String> mapaDePistas;
	
	public Pistas() {
		mapaDePistas = new HashMap<>();
	}
	
	public void agregarPista(String palabra, String pista) {
		mapaDePistas.put(palabra, pista);
	}
	
	public String obtenerPista(String palabra) {
		return mapaDePistas.getOrDefault(palabra, "Palabra no encontrada");
	}
}
