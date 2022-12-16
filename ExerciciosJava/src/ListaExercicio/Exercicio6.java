package ListaExercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				Scanner teclado = new Scanner (System.in);
				
				int number;
				
				System.out.println("Digite um número: ");
				number = teclado.nextInt();
				
				int numberAdd = number + 1;
				int numberSub = number - 1 ;
				
				System.out.println("Número: " + number);
				System.out.println("Número anterior: " + numberSub);
				System.out.println("Número sucessor: " + numberAdd);
				teclado.close();
			}

		}
	