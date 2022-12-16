package ListaExercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int calorias = 0;
		
		System.out.println("Informe a op��o de prato que deseja: 1)Vegetariano 2)Peixe 3)Frango 4)Carne");
		int prato = teclado.nextInt();
		
		switch(prato){
		case 1:
			calorias += 180;
			break;
		case 2:
			calorias += 230;
			break;
		case 3:
			calorias += 250;
			break;
		case 4:
			calorias += 350;
			break;
		default:
			System.out.println("Op��o Inv�lida!");
		}
		
		System.out.println("Informe a op��o de sobremesa: 1)Abacaxi 2)Sorvete diet 3)Mousse diet 4)Mousse de Cholate");
		int sobremesa = teclado.nextInt();
		
		switch(sobremesa){
		case 1:
			calorias += 75;
			break;
		case 2:
			calorias += 110;
			break;
		case 3:
			calorias += 170;
			break;
		case 4:
			calorias += 200;
			break;
		default:
			System.out.println("Op��o Inv�lida!");
		}

		System.out.println("Informe a op��o de suco: 1)Ch� 2)Suco de laranja 3)Suco de mel�o 4)Refrigerante diet");
		int suco = teclado.nextInt();
		
		switch(suco){
		case 1:
			calorias += 20;
			break;
		case 2:
			calorias += 70;
			break;
		case 3:
			calorias += 100;
			break;
		case 4:
			calorias += 65;
			break;
		default:
			System.out.println("Op��o Inv�lida!");
		}
		
		System.out.println("\nTotal de calorias da refei��o: " + calorias);
		
		teclado.close();
	}

}
