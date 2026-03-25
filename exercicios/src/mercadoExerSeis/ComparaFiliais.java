package mercadoExerSeis;

public class ComparaFiliais {

	public static void main(String[] args) {

		mercado bnu = new mercado ("Giassi", 500, 87, 400, 925);
		mercado join = new mercado ("Angeloni", 450, 81, 425, 825);
		mercado floripa = new mercado ("Bistek", 550, 83, 450, 725);

		mercado listaMercados[] = { bnu, join, floripa };

		double maiorReceitaMaca = 0;
		mercado mercadoMaiorReceitaMacas = listaMercados[0];

		for (int i = 0; i < listaMercados.length; i++) {

			if (listaMercados[i].obterReceitaMacas() > maiorReceitaMaca) {
				maiorReceitaMaca = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];

			}
		}
		System.out.println(mercadoMaiorReceitaMacas);

		double menorReceitaLaranja = Double.MAX_VALUE;
		mercado mercadoMenorReceitaLaranja = listaMercados[0];

		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaLaranja() > menorReceitaLaranja) {
				menorReceitaLaranja = listaMercados[i].obterReceitaLaranja();
				mercadoMenorReceitaLaranja = listaMercados[i];

			}
		}
		System.out.println(mercadoMenorReceitaLaranja);
		
		
		}
	
}
	

