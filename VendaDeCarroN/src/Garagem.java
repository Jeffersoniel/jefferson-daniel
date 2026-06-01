
import java.util.ArrayList;
import java.util.List;

public class Garagem {

	private List<CarroFin> listaCarros;

	public Garagem() {
		listaCarros = new ArrayList<CarroFin>();
	}

	public void adicionarCarro(CarroFin carro) {
		listaCarros.add(carro);
	}

	public CarroFin obterCarroMaisCaro() {
		CarroFin carroMaisCaro = null;
		double maiorPreco = 0.0;

		for (CarroFin c : listaCarros) {
			if (c.getPrecoVista() > maiorPreco) {
				maiorPreco = c.getPrecoVista();
				carroMaisCaro = c;
			}
		}

		return carroMaisCaro;
	}
}
