package ejecutables;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		String [] dias = {"lunes","martes","miercoles","jueves","viernes"};
		int diasLeidos[] = {1,2,3,4,5,6,0}; 
		
		for (int diaLeido : diasLeidos) {
			
			switch(diaLeido){
			
			case 1:
				System.out.println("El dia es : " +dias[diaLeido-1]);
				break;
			case 2:
				System.out.println("El dia es : " +dias[diaLeido-1]);
				break;
			case 3:
				System.out.println("El dia es : " +dias[diaLeido-1]);
				break;
			case 4:
				System.out.println("El dia es : " +dias[diaLeido-1]);
				break;
			case 5:
				System.out.println("El dia es : " +dias[diaLeido-1]);
				break;
			default:
				System.out.println("ERROR EN EL DIA ESCOGIDO");
		
			
			}		
		}
	
	}
	
}
