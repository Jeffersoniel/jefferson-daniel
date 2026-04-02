package exer8;

public class cal {

	public static void main(String[] args) {

		pessoa c1 = new pessoa("Joãozinho", "11111111111", "SC", 2000);
		pessoa c2 = new pessoa("Maria", "11111111111", "SC", 5000);
		pessoa c3 = new pessoa("Ana", "11111111111", "SC", 10000);
		pessoa c4 = new pessoa("Jobson", "11111111111", "SC", 27000);
		pessoa c5 = new pessoa("Roberto", "11111111111", "SC", 50000);

		pessoa vetorContribuintes[] = { c1, c2, c3, c4, c5 };

		double maiorImpostoAPagar = 0;
		pessoa contribuinteMaiorImposto = null;

		for (int i = 0; i < vetorContribuintes.length; i++) {
			if (vetorContribuintes[i].calcularImposto() > maiorImpostoAPagar) {
				maiorImpostoAPagar = vetorContribuintes[i].calcularImposto();
				contribuinteMaiorImposto = vetorContribuintes[i];
			}
		}

		System.out.println(contribuinteMaiorImposto);

		double totalImpostoArrecadado = 0;

		for (int i = 0; i < vetorContribuintes.length; i++) {
			totalImpostoArrecadado += vetorContribuintes[i].calcularImposto();
		}

		System.out.println(totalImpostoArrecadado);

	}
	
}
