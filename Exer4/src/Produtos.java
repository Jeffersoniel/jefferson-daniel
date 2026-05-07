import java.util.List;

public class Produtos {
    public static void main(String[] args) {

        Material gerenciador = new Material();

        Loja p1 = new Loja("Tigre", "Cano PVC", 25.0, 100);
        Loja p2 = new Loja("Tigre", "Joelheira", 10.0, 50);
        Loja p3 = new Loja("Vonder", "Martelo", 45.0, 10);
        
        gerenciador.cadastrar(p1);
        gerenciador.cadastrar(p2);
        gerenciador.cadastrar(p3);

        System.out.println("--- BUSCA POR MARCA ---");
        System.out.println("Mais caro da Tigre: " + gerenciador.obterMaisCaroDaMarca("Tigre"));

        System.out.println("\n--- FILTRADOS (Tigre entre 5 e 15) ---");
        List<Loja> filtrados = gerenciador.filtrarPorPreco("Tigre", 5.0, 15.0);
        for (Loja p : filtrados) {
            System.out.println(p);
        }

        System.out.println("\n--- TESTE DE ESTOQUE ---");
        System.out.println("Estoque inicial: " + p1.getQuantidade());
        p1.vender(20);
        System.out.println("Estoque após venda de 20: " + p1.getQuantidade());
    }
}