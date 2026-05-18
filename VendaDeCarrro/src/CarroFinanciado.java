public class CarroFinanciado {

	private String modelo;
	private double precoVista;

	public CarroFinanciado(String modelo, double precoVista) {
		setModelo(modelo);
		setPrecoVista(precoVista);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.trim().isEmpty()) {
			throw new IllegalArgumentException("O modelo do carro nao pode ser vazio.");
		}
		this.modelo = modelo;
	}

	public double getPrecoVista() {
		return precoVista;
	}

	public void setPrecoVista(double precoVista) {
		if (precoVista <= 0) {
			throw new IllegalArgumentException("O preco a vista deve ser maior que zero.");
		}
		this.precoVista = precoVista;
	}

	public double calcularMontanteFinanciado(double taxaMensal, int meses) {
		if (taxaMensal < 0) {
			throw new IllegalArgumentException("A taxa de juros nao pode ser negativa.");
		}
		if (meses <= 0) {
			throw new IllegalArgumentException("O prazo do financiamento deve ser de pelo menos 1 mes.");
		}

		double capital = this.precoVista;
		double taxaDecimal = taxaMensal / 100;

		double FatorCrescimento = 1.0;
		for (int m = 1; m <= meses; m++) {
			FatorCrescimento = FatorCrescimento * (1 + taxaDecimal);
		}

		return capital * FatorCrescimento;
	}

	@Override
	public String toString() {
		return "CarroFinanciado [modelo=" + modelo + ", precoVista=" + precoVista + "]";
	}
}
