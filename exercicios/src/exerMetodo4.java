
public class exerMetodo4 {

	public static void main(String[] args) {

		int vetor[] = { 8, 14, 2, 16, -5, 0 };

		System.out.print("O maior valor é: ");
		obterMaiorValor(vetor);
		System.out.print("O menor valor é: ");
		obterMenorValor(vetor);
		System.out.print("A média é: ");
		obterMedia(vetor);
	}

	public static void obterMaiorValor(int vetor[]) {

		int maiorValor = Integer.MIN_VALUE;


		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		System.out.println(maiorValor);

	}

	public static void obterMenorValor(int vetor[]) {

		int menorValor = Integer.MAX_VALUE;


		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}

		System.out.println(menorValor);

	}

	public static void obterMedia(int vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / vetor.length;

		System.out.println(media);

	}

}


