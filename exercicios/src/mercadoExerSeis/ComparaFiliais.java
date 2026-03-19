package mercadoExerSeis;

public class ComparaFiliais {

	public static void main(String[] args) {

		mercado bnu = new mercado();
		mercado join = new mercado();
		mercado floripa = new mercado();

		bnu.nome = "Bistek";
		bnu.macaAno = 12000;
		bnu.precoMaca = 12.00;
		bnu.laranjaAno = 12000;
		bnu.precoLaranja = 12.50;

		join.nome = "Angeloni";
		join.macaAno = 13000;
		join.precoMaca = 13.00;
		join.laranjaAno = 13000;
		join.precoLaranja = 13.50;

		floripa.nome = "Fort";
		floripa.macaAno = 14000;
		floripa.precoMaca = 14.00;
		floripa.laranjaAno = 14000;
		floripa.precoLaranja = 14.50;

		mercado listaMercados[] = { bnu, join, floripa };

		double maiorReceitaMaca = 0;
		mercado mercadoMaiorReceitaMacas =  listaMercados[0];

		for (int i = 0; i < listaMercados.length; i++) {
			
			if (listaMercados[i].obterReceitaMacas() > maiorReceitaMaca) {
				maiorReceitaMaca = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
				
			}
		}
		System.out.println(mercadoMaiorReceitaMacas.nome);
		
		double menorReceitaLaranja = Double.MAX_VALUE;
		mercado mercadoMenorReceitaLaranja= listaMercados[0];
		
		for (int i=0; i <listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaLaranja() > menorReceitaLaranja) {
				menorReceitaLaranja = listaMercados[i].obterReceitaLaranja();
				 mercadoMenorReceitaLaranja = listaMercados[i];
				
		}
		}
		System.out.println(mercadoMenorReceitaLaranja.nome);
	}	
}

