import java.time.LocalDate;

public class Livraria {

	private String titulo; 
	private String autor;
	private String id;
	private LocalDate publi;
	private double preco;
	private LocalDate emprestimo;
	
	public Livraria(String titulo, String autor, String id, LocalDate publi,Double preco, LocalDate emprestimo) {
		setTitulo(titulo);
		setAutor(autor);
		setId(id);
		setPubli(publi);
		setEmprestimo(emprestimo);
	}
	
	
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("Titulo inválido");
		}
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null || autor.isBlank()) {
			throw new IllegalArgumentException("Autor inválido");
		}
		this.autor = autor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id == null || id.isBlank()) {
			throw new IllegalArgumentException("id inexistente");
		}
		this.id = id;
	}

	public LocalDate getPubli() {
		return publi;
	}

	public void setPubli(LocalDate publi) {
		if (publi.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de publicação inválida");
		}
		this.publi = publi;
	}

	public LocalDate getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(LocalDate emprestimo) {
		if (emprestimo ==null || emprestimo.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de publicação inválida");
		}
	/**Não ta certo(multa diaria)
		LocalDate emprestimo = dias - LocalDate.now().getEmprestimo();
		
		double taxa = definirMulta();
		
		return preco * Math.pow(1 + taxa,emprestimo);
	}
	private double definirMulta() {

		if (emprestimo >= LocalDateTime) {
			return 0.01;
		}
**/
	}

	@Override
	public String toString() {
		return "Livraria [titulo=" + titulo + ", autor=" + autor + ", id=" + id + ", publi=" + publi + ", preco="
				+ preco + ", emprestimo=" + emprestimo + "]";
	}
	
}
