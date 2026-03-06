import java.util.Scanner;

public class exerMetodoReturn2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor:");
		double primeiroValor = input.nextDouble();
		
		System.out.println("Insira o segundo valor:");
		double segundoValor = input.nextDouble();
		
		System.out.println("Insira o terceiro valor:");
		double terceiroValor = input.nextDouble();
		
		double media = calcularMedia (primeiroValor,segundoValor, terceiroValor);
		
		System.out.println("A média é: " + media);
	}
	public static double calcularMedia(double primeiroValor, double segundoValor, double terceiroValor) {
        double media = (primeiroValor+segundoValor+terceiroValor) / 3;
        return media;
	}
}
