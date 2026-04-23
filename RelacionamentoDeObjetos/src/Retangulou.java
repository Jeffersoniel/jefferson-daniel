
public class Retangulou {
private double altura;
private double largura;

public Retangulou(double altura, double largura) {
	setLargura(largura);
	setAltura(altura);
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	if(altura<=0) {
		throw new IllegalArgumentException("Erro: A altura deve ser um valor maior que zero.");
	}
	this.altura = altura;
}
public double getLargura(){
	return largura;
}
public void setLargura(double largura) {
	if (largura<=0) {
        throw new IllegalArgumentException("Erro: A largura deve ser um valor maior que zero.");
	}
	this.largura=largura;
}
public double calcularArea() {
	return this.altura * this.largura;
}

public double calcularPerimetro() {
    return 2 * (this.altura + this.largura);
}

@Override
public String toString() {
    return String.format("Retângulo [Altura=%.2f, Largura=%.2f, Área=%.2f, Perímetro=%.2f]", altura, largura, calcularArea(), calcularPerimetro());
}
}