 package circuloExerQuatro;

public class circulos {

	public static void main(String[] args) {
		
		infoCirculo c1 = new infoCirculo();
		infoCirculo c2 = new infoCirculo();
		infoCirculo c3 = new infoCirculo();
		infoCirculo c4 = new infoCirculo();
		
		c1.raio = 4.0;
		c2.raio = 5.0;
		c3.raio = 6.0;
		c4.raio = 7.0;
		
		System.out.println("Área do c1: "+c1.calcularArea());
		System.out.println("Área do c2: "+c2.calcularArea());
		System.out.println("Área do c3: "+c3.calcularArea());
		System.out.println("Área do c4: "+c4.calcularArea());
	}
}
