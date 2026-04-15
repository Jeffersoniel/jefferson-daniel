package velocidade;

public class Ex9{
	public static void main(String[] args) {
        Carro carro = new Carro(10);

        try {
            carro.acelerar(10);
            System.out.println("Velocidade: " + carro.getVelocidade());

            carro.reduzir(5);
            System.out.println("Velocidade: " + carro.getVelocidade());

            carro.acelerar(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}