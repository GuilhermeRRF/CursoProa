package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor em d�lar $: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Qual a cota��o do d�lar em R$? ");
		double cotacao = sc.nextDouble();
		
		double conversao = dolar * cotacao;
		
		System.out.printf("\nValor convertido em R$: %.2f", conversao);
		
		sc.close();

	}

}
