import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Flor> listaVendas;

	public Venda() {
		listaVendas = new ArrayList<>();
	}

	public void adicionarVenda(Flor r) {
		listaVendas.add(r);
	}

	public List<Flor> obterFlor() {
		return listaVendas;
	}

	public List<Flor> obterListaDeFlor(String flor) {
		List<Flor> resultado = new ArrayList<>();
		for (Flor f : listaVendas) {
			if (f.getNome().equalsIgnoreCase(flor)) {
				resultado.add(f);
			}
		}
		return resultado;
	}
}
