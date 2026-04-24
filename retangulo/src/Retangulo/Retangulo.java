package Retangulo;

public class Retangulo {

	private double largura;
	private double altura;

	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}

	public double obterArea() {
		return largura * altura;
	}

	public double obterPerimetro() {
		return (largura + altura) * 2;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura <= 0) {
			throw new IllegalArgumentException("Altura inválida");
		}
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("Largura inválida");
		}
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
	}
}
