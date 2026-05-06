public class Produto {
    
    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String marca, String modelo, double preco, int quantidadeEstoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            setQuantidadeEstoque(getQuantidadeEstoque() + quantidade);
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= getQuantidadeEstoque()) {
            setQuantidadeEstoque(getQuantidadeEstoque() - quantidade);
            System.out.println(quantidade);
        } else {
            System.out.println("Erro: Quantidade inválida");
        } 
    } 
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
}