package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			double num = sc.nextDouble();
			
			if(num > 8) {
				qtdNumeros += 1;
			}
		}
		
		System.out.println("\nS�o " + qtdNumeros + " n�meros maiores que 8!");
		
		sc.close();
	}

}
