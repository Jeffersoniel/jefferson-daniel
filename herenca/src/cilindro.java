public class cilindro extends circulo {

	private double altura;

	public cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}

	public double calcularVolume() {
		return calcularArea() * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}