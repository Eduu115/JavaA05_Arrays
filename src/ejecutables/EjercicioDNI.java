package ejecutables;

import java.util.Scanner;

public class EjercicioDNI {

	public static void main(String[] args) {
		
		// Solicitamos por consola el DNI sin letra y devolver la letra
		// Dividir un numero entre 23 solo tienes 23 restos, el resto corresponde a una letra del abecedario
		
		//letraDniV1();
		//letraDniV2();
		dniComporbacion();
	}

	public static void letraDniV1() {
		
		// Definimos
		Scanner leer = new Scanner(System.in);
		char[] abecedario = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		int numeroDni = 0;		
		// Pregunta
		System.out.println("Introdice tu numero de DNI");
		numeroDni = leer.nextInt();
		// Resultado
		System.out.println("La letra es : " + abecedario[numeroDni%23]);
		System.out.println("El DNI COMPLETO SERIA : " + numeroDni + abecedario[numeroDni%23]);
		
	}

	public static void letraDniV2() { // Con string preguntamos y luego lo convertimos, para evitar problemas con los 0
		
		// Definimos
		Scanner sc = new Scanner(System.in);
		char[] abecedario = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		// Pregunta
		System.out.println("Introdice tu numero de DNI");
		String numeroDni = sc.next();
		
		// Resultado
		if (numeroDni.length() == 8) {
			int dniNumerico = Integer.parseInt(numeroDni);
			int indice = dniNumerico%23;
			System.out.println("La letra es : " + abecedario[indice]);
			System.out.println("El DNI COMPLETO SERIA : " + dniNumerico + abecedario [indice]);
		}
		System.out.println("Vuelve a introducir, numero de caracteres incorrecto");
		
	}

	public static void dniComporbacion() {
		
		// Nos dan un DNI por consola completo con letra y comprobamos que la letra sea correcta
		
		// La idea es separar [12345678] [X] de [12345678X] y usar cada uno por un lado
		
		// Definimos
		
		Scanner sc = new Scanner(System.in);
		
		// Algoritmo
		
		System.out.println("Introduce tu DNI con letra incluida, CON LA LETRA EN MAYUSCULA");
		String dniIntroducido = sc.next();
		
		char letra = dniIntroducido.charAt((dniIntroducido.length()-1)); // decimos que la letra es dniIntroducido en la posicion 8 
		String numeros = dniIntroducido.substring(0,8);
		
		
		System.out.println("Tu letra es " + letra);
		System.out.println("tus numeros son "+ numeros);
		
		// Comprobacion
		
		char[] abecedario = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		// calculo 		
		int dniNumerico = Integer.parseInt(numeros);
		int indice = dniNumerico%23;
		
		// comprobacion
		
		if (letra == abecedario[indice]) {
			
			System.out.println("Tu letra es correcta");
		}else 
			System.out.println("Tu letra no es correcta, prueba a introducir la letra en mayuscula");
		
		
	}

	
}

