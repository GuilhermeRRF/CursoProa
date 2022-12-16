package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner  entrada = new Scanner(System.in);
		
		double soma = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			double num = entrada.nextDouble();
			
			soma += num;
		}
		
		System.out.printf("Soma dos n�meros informados: %.2f", soma);
		entrada.close();
	}

}
