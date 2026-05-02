public class Loja {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public Loja(String marca, String modelo, double preco, int quantidade) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void adicionarEstoque(int valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
        this.quantidade += valor;
    }

    public void vender(int valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
        if (valor > this.quantidade) throw new IllegalArgumentException("Estoque insuficiente");
        this.quantidade -= valor;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {throw new IllegalArgumentException("marca inexistente");
        this.marca = marca;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo inexistente");
        this.modelo = modelo;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco < 0) throw new IllegalArgumentException("preco invalido");
        this.preco = preco;
    }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("quantia inexistente");
        }
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Loja [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}