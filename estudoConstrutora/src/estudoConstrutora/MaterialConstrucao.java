package estudoConstrutora;
import java.util.ArrayList;
import java.util.List;

public class MaterialConstrucao {
    private List<Produtos> produtos;

    public MaterialConstrucao() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produtos p) {
        produtos.add(p);
    }

    public Produtos obterMaisCaroDaMarca(String marca) {
        Produtos maisCaro = null;

        for (Produtos p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    public List<Produtos> obterProdutosPorMarcaEPreco(String marca, double x, double y) {
        List<Produtos> produtosFiltrados = new ArrayList<>();

        for (Produtos p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca) && p.getPreco() >= x && p.getPreco() <= y) {
                produtosFiltrados.add(p);
            }
        }
        return produtosFiltrados;
    }
}