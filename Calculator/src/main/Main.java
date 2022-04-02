package main;
import java.util.Scanner;
import java.util.List;

import calc.Calc;

public class Main {

	public static void main(String[] args) {

		Calc calc = new Calc();

		int operator;
		double valueOne = 0, valueTwo=0;

		do {
			try{

				Thread.sleep(1000);
			}catch(InterruptedException ex){
				//do stuff
			}
			System.out.println("---Escolha o operador: 1 para soma || 2 para subtracao || 3 para divisao ||"
					+"4 para multiplicacao ||5 - sair e informar ultimas operacoes---");
			Scanner sc3 = new Scanner(System.in);
			operator = sc3.nextInt();	

			//if op = 5, go to next step and dont ask numbers value
			if(operator !=5) {
			System.out.printf("\nDigite o primeiro valor: ");
			Scanner sc = new Scanner(System.in);
			valueOne = sc.nextDouble();
			Scanner sc2 = new Scanner(System.in);
			System.out.printf("\nDigite o segundo valor: ");
			valueTwo = sc2.nextDouble();
			}


			switch(operator){
			case 1:
				System.out.printf("Soma: %2.2f + %2.2f = ",valueOne, valueTwo);
				System.out.println("" + calc.sum(valueOne, valueTwo));
				break;
			case 2:
				System.out.printf("Sub: %2.2f - %2.2f = ",valueOne, valueTwo);
				System.out.println("" + calc.sub(valueOne, valueTwo));
				break;
			case 3:
				System.out.printf("Div: %2.2f / %2.2f = ",valueOne, valueTwo);
				System.out.println("" + calc.div(valueOne, valueTwo));
				break;
			case 4:
				System.out.printf("Mult: %2.2f * %2.2f = ",valueOne, valueTwo);
				System.out.println("" + calc.mult(valueOne, valueTwo));
				break;
			case 5: 
				System.out.println("Saindo do programa...");
				List<String> operations = calc.getLastOperations();
				System.out.println("---Operações realizadas---");
				for (String operation : operations) {
					System.out.println(operation);
					break;
				}

			} 
		}while(operator  !=5); //While op !=5, will repeat the process, end when =5 and show last operations
	}
}
