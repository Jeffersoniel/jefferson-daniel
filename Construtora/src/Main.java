import java.util.List;

public class Main {
    public static void main(String[] args) {
        MateriaisConstrucao loja = new MateriaisConstrucao();

        Produto p1 = new Produto("Contrucolor", "Cano PVC 100mm", 45.90, 50);
        Produto p2 = new Produto("Joao", "Grelha Redonda", 15.50, 100);
        Produto p3 = new Produto("Votoran", "Cimento CP II 50kg", 38.00, 200);
        Produto p4 = new Produto("Tigre", "Torneira de Parede", 120.00, 10);

        loja.cadastrarProduto(p1);
        loja.cadastrarProduto(p2);
        loja.cadastrarProduto(p3);
        loja.cadastrarProduto(p4);

        System.out.println("Estoque inicial do Cano: " + p1.getQuantidadeEstoque());
        
        p3.adicionarEstoque(50); 
        System.out.println("Estoque após adição: " + p1.getQuantidadeEstoque());

        p3.vender(10);
        System.out.println("Estoque final do Cano: " + p1.getQuantidadeEstoque());
       
        Produto maisCaro = loja.obterMaisCaroDaMarca("Votoran");
        if (maisCaro != null) {
            System.out.println("O produto mais caro é: " + maisCaro.getModelo() + " custando R$ " + maisCaro.getPreco());
        }
   
        System.out.println("\nProdutos entre R$ 10.00 e R$ 50.00:");
        List<Produto> filtro = loja.obterProdutosPorMarcaEPreco("Votoran", 10.00, 100.00);
        for (Produto prod : filtro) {
            System.out.println("- " + prod.getModelo() + " | Preço: R$ " + prod.getPreco());
        }
    }
}