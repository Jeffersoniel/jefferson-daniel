import java.time.LocalDate;

public class Carro {

	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private double preco;
	private LocalDate dataDeAquecicao;
	
	public Carro(String marca, String modelo, String placa, String ano, double preco, LocalDate dataDeAquecicao) {
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setAno(ano);
		setPreco(preco);
		setDataDeAquecicao(dataDeAquecicao);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca inválido");
		}
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido");
	}
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if (placa == null || placa.isBlank()) {
			throw new IllegalArgumentException("Placa inválida");
	}
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno (int ano) {
		if (ano == 1800 || ano>= LocalDate.now().getYear()) {
			throw new IllegalArgumentException("Ano inválido");
	}
		this.ano = ano;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");	
	}
		this.preco = preco;
	}
	public LocalDate getDataDeAquecicao() {
		return dataDeAquecicao;
	}
	public void setDataDeAquecicao(LocalDate dataDeAquecicao) {
		{
			if (dataDeAquecicao == null || dataDeAquecicao.isAfter(LocalDate.now())) {
				throw new IllegalArgumentException("Data inválida");
			}
	}
		this.dataDeAquecicao = dataDeAquecicao;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", preco=" + preco
				+ ", dataDeAquecicao=" + dataDeAquecicao + "]";
	}
}