package Retangulo;

public class Exer1 {

	public static void main(String[] args) {

		
	Retangulo r1 = new Retangulo(4, 5);
	Retangulo r2 = new Retangulo(2, 6);
	Retangulo r3 = new Retangulo(3, 8);
	Retangulo r4 = new Retangulo(1, 23);

		
	ColetaneoDeRetangulo c1 = new ColetaneoDeRetangulo();

	
	c1.adicionarRetangulo(r1);
	c1.adicionarRetangulo(r2);
	c1.adicionarRetangulo(r3);
	c1.adicionarRetangulo(r4);


	System.out.println(c1.obterRetanguloMaiorArea());

	
	System.out.println(c1.obterRetanguloMaiorPerimetro());
	}

}

