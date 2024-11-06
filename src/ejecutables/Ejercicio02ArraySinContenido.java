package ejecutables;

public class Ejercicio02ArraySinContenido {

	public static void main(String[] args) {
		
		String [] nombres = new String[5];
		
		nombres[0] = "Cipote";
		nombres[1] = "Cipote";
		
		for (String nombre: nombres) //Para recorrer el contenido sin importar la posicion
			if (nombre != null)
				System.out.println(nombre.toUpperCase());
		
	}
	
}
