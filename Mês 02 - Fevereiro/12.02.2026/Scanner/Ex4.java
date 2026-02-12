import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		// Criando um objeto Scanner para ler a entrada do usuário
		// Atualização arquivo
		Scanner input = new Scanner(System.in);

		System.out.println("Informe seu primeiro nome");
		String nome = input.next();

		System.out.println("Informe o seu sobrenome");
		String sobrenome = input.next();

		String nomeCompleto = nome + " " + sobrenome;

		System.out.println("Seu nome é: " + nomeCompleto);

	}

}
