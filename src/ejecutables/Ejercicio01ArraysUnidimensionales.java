package ejecutables;

public class Ejercicio01ArraysUnidimensionales {

	public static void main(String[] args) {
		
		int [] numeros = {2,3,6,9,11,22};
		String [] diasSemana = {"lunes", "martes", "miercoles", "jueves",null};
		double [] salarios = {9999, 100000, 19999,20000,20001};
		
		System.out.println("La longitud es : "+ numeros.length);
		
		// Normal
		
		for(int i = 0; i < diasSemana.length; i++) {
			
			System.out.println("En posicion "+ (i+1) + " esta el dia : " + diasSemana[i]);
			
		}
		
		// Optimizado/For each (CUANDO NO HACE FALTA LA POSICION)
		
		for (String dia: diasSemana){
			
			if (dia != null) {
			
				System.out.println("El dia de la semana es : " + dia);
			
			}
		}
		
	}
	
}
