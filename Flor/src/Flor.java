
public class Flor {

	private String flor;
	private double valor;
	private String nome;

	public Flor(String flor, double valor, String nome) {
		setFlor(flor);
		setNome(nome);
		setValor(valor);
	}

	public String getFlor() {
		return flor;
	}

	public void setFlor(String flor) {
		if (flor == null || flor.isBlank()) {
			throw new IllegalArgumentException("Flor inválida");
		}
		this.flor = flor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Flor [flor=" + flor + ", valor=" + valor + ", nome=" + nome + "]\n";
	}

}
