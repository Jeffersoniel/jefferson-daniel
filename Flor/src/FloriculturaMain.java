public class FloriculturaMain {
	public static void main(String[] args) {

		Venda sistema = new Venda();

		Flor f1 = new Flor("Ice", 10.0, "Paredez");
		Flor f2 = new Flor("Cubana", 15.0, "Henricoptero");
		Flor f3 = new Flor("Pacifa", 12.0, "Paredez");

		sistema.adicionarVenda(f1);
		sistema.adicionarVenda(f2);
		sistema.adicionarVenda(f3);

		System.out.println(sistema.obterListaDeFlor("Paredez"));
		
	}

}
