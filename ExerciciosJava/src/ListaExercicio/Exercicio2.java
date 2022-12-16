package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = teclado.nextInt();
		
		if(numero % 10 == 0 && numero % 5 == 0 && numero % 2 == 0) {
			System.out.println("Ele é divisível por 10, 5, 2!");
		}else if(numero % 5 == 0 ) {
			System.out.println("Ele é divisível por 5!");
		}else if(numero % 2 == 0) {
			System.out.println("Ele é divisível por 2!");
		}else {
			System.out.println("Não é divisivel por nenhum deles!");
		}
		
		teclado.close();
	}

}
