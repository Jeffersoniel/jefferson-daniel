package exemplo;

import java.util.Scanner;

public class ExemploClasse {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = input.next();
		
		System.out.println("Insira sua idade");
		int idade = input.nextInt();
		
	System.out.println("Seu nome é"+ nome+" e vc tem"+idade+"anos");
	}
}
