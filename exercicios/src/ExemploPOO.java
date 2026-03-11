
public class ExemploPOO {

	public static void main(String[] args) {
		
		veiculo v1 = new veiculo();
		veiculo v2 = new veiculo();
		
		v1.modelo = "Honda City";
		v1.comprimento = 4.5;
		v1.passageiros = 5;
		v1.velMax = 200;
		v1.cor = "preto";
		
		v2.modelo = "Fusca";
		v2.comprimento = 3.0;
		v2.passageiros = 2;
		v2.velMax = 500;
		v2.cor = "preto";
		
		if (v1.velMax > v2.velMax) {
			System.out.println("O"+v1.modelo+" é mais rápido");
		} else {
			System.out.println("O "+v2.modelo+" é mais rápido");
		}
	}

}
