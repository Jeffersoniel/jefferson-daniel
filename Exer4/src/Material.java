import java.util.ArrayList;
import java.util.List;

public class Material {
	private List<Loja> lista;

	public Material() {
		this.lista = new ArrayList<>();
	}

	public void cadastrar(Loja p) {
		this.lista.add(p);
	}

	public Loja obterMaisCaroDaMarca(String marca) {
		Loja maisCaro = null;
		for (Loja p : lista) {
			if (p.getMarca().equalsIgnoreCase(marca)) {
				if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
					maisCaro = p;
				}
			}
		}
		return maisCaro;
	}

	public List<Loja> filtrarPorPreco(String marca, double x, double y) {
		List<Loja> resultado = new ArrayList<>();
		for (Loja p : lista) {
			if (p.getMarca().equalsIgnoreCase(marca) && p.getPreco() >= x && p.getPreco() <= y) {
				resultado.add(p);
			}
		}
		return resultado;
	}
}