package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double saldo = teclado.nextDouble();
		
		saldo *= 1.5;
		
		System.out.printf("Saldo com reajuste: %.2f", saldo);
	    teclado.close();
	    

	}

}
