import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucao {
    private List<Produto> produtos;

    public MateriaisConstrucao() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }

    public Produto obterMaisCaroDaMarca(String marca) {
        Produto maisCaro = null;

        for (Produto p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    public List<Produto> obterProdutosPorMarcaEPreco(String marca, double x, double y) {
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca) && p.getPreco() >= x && p.getPreco() <= y) {
                produtosFiltrados.add(p);
            }
        }
        return produtosFiltrados;
    }
}