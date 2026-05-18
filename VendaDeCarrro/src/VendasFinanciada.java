public class VendasFinanciada {

	public static void main(String[] args) {

		CarroFinanciado c1 = new CarroFinanciado("Honda Bros 160", 18500.00);
		CarroFinanciado c2 = new CarroFinanciado("Honda XRE 300", 29000.00);
		CarroFinanciado c3 = new CarroFinanciado("Chevrolet Onix", 65000.00);
		CarroFinanciado c4 = new CarroFinanciado("Fiat Uno", 12000.00);

		Garagem garagem = new Garagem();

		garagem.adicionarCarro(c1);
		garagem.adicionarCarro(c2);
		garagem.adicionarCarro(c3);
		garagem.adicionarCarro(c4);

		System.out.println("--- Carro mais caro do estoque ---");
		System.out.println(garagem.obterCarroMaisCaro());
	}
}
