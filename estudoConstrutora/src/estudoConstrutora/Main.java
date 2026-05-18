package estudoConstrutora;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		MaterialConstrucao loja = new MaterialConstrucao();

		Produtos p1 = new Produtos("Constucolor", "Cano", 45, 50);
		Produtos p2 = new Produtos("Tigre", "Ferro", 42, 60);
		Produtos p3 = new Produtos("Votorantin", "Prego", 20, 100);

		loja.cadastrarProduto(p1);
		loja.cadastrarProduto(p2);
		loja.cadastrarProduto(p3);

		System.out.println("Estoque inicial do Cano: " + p1.getQntEstoque());

		p3.adicionarEstoque(50);
		System.out.println("Estoque após adição: " + p1.getQntEstoque());

		p3.vender(10);
		System.out.println("Estoque final do Cano: " + p1.getQntEstoque());

		Produtos maisCaro = loja.obterMaisCaroDaMarca("Tigre");
		if (maisCaro != null) {
			System.out
					.println("O produto mais caro é: " + maisCaro.getModelo() + " custando R$ " + maisCaro.getPreco());
		}

		System.out.println("\nProdutos entre R$ 10.00 e R$ 50.00:");
		List<Produtos> filtro = loja.obterProdutosPorMarcaEPreco("Tigre", 10.00, 100.00);
		for (Produtos prod : filtro) {
			System.out.println("- " + prod.getModelo() + " | Preço: R$ " + prod.getPreco());
		}
	}
}
