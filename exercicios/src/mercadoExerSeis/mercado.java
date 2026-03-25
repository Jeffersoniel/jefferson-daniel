package mercadoExerSeis;

public class mercado {
	
	String nome;
	int macaAno;
	double precoMaca;
	int laranjaAno;
	double precoLaranja;
	

public mercado(String nome, int macaAno, double precoMaca, int laranjaAno, double precoLaranja) {
	super();
	this.nome = nome;
	this.macaAno = macaAno;
	this.precoMaca = precoMaca;
	this.laranjaAno = laranjaAno;
	this.precoLaranja = precoLaranja;

	}
	@Override
public String toString() {
	return "mercado [nome=" + nome + ", macaAno=" + macaAno + ", precoMaca=" + precoMaca + ", laranjaAno=" + laranjaAno
			+ ", precoLaranja=" + precoLaranja + "]";
}
	public double obterReceitaMacas() {
		return macaAno *  precoMaca;
	}
	public double obterReceitaLaranja() {
		return laranjaAno *  precoLaranja;
	}
	public double obterReceitaAll() {
		return obterReceitaMacas() * obterReceitaLaranja();
	    
}
