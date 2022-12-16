package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = teclado.nextInt();
		
		if(numero % 10 == 0 && numero % 5 == 0 && numero % 2 == 0) {
			System.out.println("Ele � divis�vel por 10, 5, 2!");
		}else if(numero % 5 == 0 ) {
			System.out.println("Ele � divis�vel por 5!");
		}else if(numero % 2 == 0) {
			System.out.println("Ele � divis�vel por 2!");
		}else {
			System.out.println("N�o � divisivel por nenhum deles!");
		}
		
		teclado.close();
	}

}
