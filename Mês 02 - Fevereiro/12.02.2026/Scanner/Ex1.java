import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner input = new Scanner(System.in);

		System.out.println("Insira a primeira idade");
		int idade1 = input.nextInt();

		System.out.println("Insira a segunda idade");
		int idade2 = input.nextInt();

		int somaIdades = idade1 + idade2;

		System.out.println("A soma das idades é de: " + somaIdades);

	}

}
