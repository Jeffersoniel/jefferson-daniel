package exemplo;

import java.util.Scanner;

class AtividadeScanner2 {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Insira usa idade : ");
	int idade = input.nextInt();
	
	System.out.println("Insira sua altura : ");
	double altura = input.nextDouble();
	
	System.out.println("Seu nome : ");
	String nome = input.next();
	
	System.out.println("Voce tem "+idade+" vc tem "+altura+" de altura e seu nome é "+nome);
}
}
