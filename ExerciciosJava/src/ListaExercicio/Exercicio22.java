package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdNum = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			int num = sc.nextInt();
			
			if(num > 0 && num < 100) {
				qtdNum += 1;
			}
		}
		
		System.out.println("\nS�o " + qtdNum + " n�meros digitados que est�o entre 0 e 100!");
		
		sc.close();
	}

}
