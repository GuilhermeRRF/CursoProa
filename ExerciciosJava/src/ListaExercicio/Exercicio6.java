package ListaExercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				Scanner teclado = new Scanner (System.in);
				
				int number;
				
				System.out.println("Digite um n�mero: ");
				number = teclado.nextInt();
				
				int numberAdd = number + 1;
				int numberSub = number - 1 ;
				
				System.out.println("N�mero: " + number);
				System.out.println("N�mero anterior: " + numberSub);
				System.out.println("N�mero sucessor: " + numberAdd);
				teclado.close();
			}

		}
	