package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = teclado.nextInt();
		
		if(idade >= 18 && idade <= 65) {
			System.out.println("Eleitor obrigat�rio!");
		}else if(idade >= 16 || idade > 65) {
			System.out.println("Eleitor facultativo!");
		}else {
			System.out.println("N�o eleitor!");
		}
		
		teclado.close();

	}

}
