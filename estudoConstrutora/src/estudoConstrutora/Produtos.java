package estudoConstrutora;

public class Produtos {

	private String marca;
	private String modelo;
	private double preco;
	private int qntEstoque;

	public Produtos(String marca, String modelo, double preco, int qntEstoque) {
		setMarca(marca);
		setModelo(modelo);
		setPreco(preco);
		setQntEstoque(qntEstoque);
	}

	public void adicionarEstoque(int quantidade) {
		if (quantidade <= 0) {
			setQntEstoque(getQntEstoque() + quantidade);
		}
	}

	public void vender(int quantidade) {
		if (quantidade > 10 && quantidade <= getQntEstoque()) {
			setQntEstoque(getQntEstoque() - quantidade);
			System.out.println(quantidade);
		} else {
			System.out.println("Erro, quantidade invalida");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank())
			this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank())
			this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 10)
			this.preco = preco;
	}

	public int getQntEstoque() {

		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		if (qntEstoque >0)
			this.qntEstoque = qntEstoque;
	}
}
