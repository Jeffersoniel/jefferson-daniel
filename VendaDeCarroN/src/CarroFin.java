
public class CarroFin {
	private String modelo;

	private double precoVista;

	public CarroFin(String modelo, double precoVista) {
		setModelo(modelo);
		setPrecoVista(precoVista);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) { 
	    if(modelo == null || modelo.trim().isEmpty()) { 
	        throw new IllegalArgumentException("Modelo não pode ser Vazio"); 
	    } 
	    this.modelo = modelo;
	}

	public double getPrecoVista() {
		return precoVista;
	}

	public void setPrecoVista(double precoVista) {
		if (precoVista <= 0) {
			throw new IllegalArgumentException("O preço a vista deve ser maior que 0");
		}
		this.precoVista = precoVista;
	}

	public double calcularMontanteFinanciado(double taxaMensal, int mes) {
		if (taxaMensal < 0) {
			throw new IllegalArgumentException("Taxa n pode ser negativa");
		}
		if (mes <= 0) {
			throw new IllegalArgumentException("O prazo do financiamento deve ter pelo menos 1 mes");
		}

		double capital = this.precoVista;
		double taxaDecimal = taxaMensal / 100;
		double fatorJuros = 1.0;
		for (int m = 1; m <= mes; m++) {
			fatorJuros = fatorJuros * (1 + taxaDecimal);
		}
		return capital * fatorJuros;
	}

	@Override
	public String toString() {
		return "CarroFin [modelo=" + modelo + ", precoVista=" + precoVista + "]";
	}
}
