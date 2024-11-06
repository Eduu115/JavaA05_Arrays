package ejecutables;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		String frase = "En un lugar de la mancha de cuyo nombre no quiero acordarme";
		
		// Procesar cada palabra
		
		String [] palabras = frase.split(" "); // Crea un Array cuyos espacios estan ocupados cada uno por una palabra de la frase.
		
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
	}	
}
