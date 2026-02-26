import java.util.Scanner;

public class exerMetodo1 {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Insira o número da estação: ");
	int estacao = input.nextInt();
	
	switch (estacao) {
	case 1 -> imprimeVerao();
	case 2 -> imprimeInverno();
	case 3 -> imprimeOutono();
	case 4 -> imprimePrimavera();
	}
	
	}
	
	public static void imprimeVerao() {
		System.out.println("é verão");
		System.out.println("e está quente");
	}
	public static void imprimeInverno() {
		System.out.println("é inverno");
		System.out.println("e está frio");
	}
	public static void imprimeOutono() {
		System.out.println("é outono");
		System.out.println("e as folhas caem");
	}
	public static void imprimePrimavera() {
		System.out.println("é primavera");
		System.out.println("e as folhas florecem");
	}	
}
