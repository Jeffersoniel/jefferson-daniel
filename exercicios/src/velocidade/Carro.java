package velocidade;

public class Carro {

	private int velocidade;

	public Carro(int velocidade) {
		setVelocidade(velocidade);
		}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade < 0) {
			throw new IllegalArgumentException("Velocidade invalida");
		}
		this.velocidade = velocidade;
	}

	public void acelerar(int valor) {
		if (valor < 0 || valor > 20) {
			throw new IllegalArgumentException("Valor inválido para acelerar (0 a 19)");
		}
		setVelocidade(this.velocidade + valor);
	}

	public void reduzir(int valor) {
		if (valor < 0 || valor > 30) {
			throw new IllegalArgumentException("Valor inválido para reduzir (0 a 29)");
		}
		setVelocidade(this.velocidade - valor);
	}
}
