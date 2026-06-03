import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livraria>listaLivro;
	
	public Biblioteca() {
		listaLivro = new ArrayList<Livraria>();
	}
	
	public Livraria obterLivroMaisCaroAno(LocalDate publi) {

		Livraria LivroMaisCaro = null;
		double maisCaro = 0;

		for (Livraria l : listaLivro) {
			if (l.getPubli() == publi && l.getPreco() > maisCaro) {
				maisCaro = l.getPreco();
				LivroMaisCaro = l;
			}

		}

		return LivroMaisCaro;
	}
	
	public List<Livraria> listarCarrosMarcaEPreco(String autor, double precoMinimo, double precoMaximo) {

		List<Livraria> listaLivroPorAutorEPreco = new ArrayList<Livraria>();

		for (Livraria l : listaLivro) {
			if (l.getAutor().equals(autor) && (l.getPreco() >= precoMinimo && l.getPreco() <= precoMaximo)) {
				listaLivroPorAutorEPreco.add(l);
			}
		}

		return listaLivroPorAutorEPreco;
	}
	
	public Livraria obterCarroPorPlaca(String id) {
		if (id == null){
			throw new IllegalArgumentException("ID não existe");
		}

		for (Livraria l : listaLivro) {
			if (l.getId().equals(id)) {
				return l;
			}
		}

		return null;
	}
}
