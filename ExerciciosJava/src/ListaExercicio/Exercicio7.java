package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double n1 = 8;
		double n2 = 9;
		double n3 = 7;
		double n4 = 4;
		double n5 = 5;
		double n6 = 6;
		
		double valor = (n1 + n2 + n3) / 3;
		double valor2 = (n4 + n5 + n6) / 3;
		
		double media = valor + valor2;
		
		System.out.println("Soma das médias: " + media);
		
	    teclado.close();

	}

}
