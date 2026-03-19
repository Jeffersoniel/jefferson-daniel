package mercadoExerSeis;

public class mercado {
	
	String nome;
	int macaAno;
	double precoMaca;
	int laranjaAno;
	double precoLaranja;
	double total;

	public double obterReceitaMacas() {
		return macaAno *  precoMaca;
	}
	public double obterReceitaLaranja() {
		return laranjaAno *  precoLaranja;
	}
	public double obterReceitaAll() {
		return obterReceitaMacas() * obterReceitaLaranja();
	}
}
