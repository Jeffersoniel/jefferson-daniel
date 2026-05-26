import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Carro> listaCarros;

	public Sistema() {
		listaCarros = new ArrayList<Carro>();
	}

	public void adicionarSistema(Carro c) {
		listaCarros.add(c);	
}
	/*public List<Carro> obterCareza{

		for (Carro a : listaCarros) {
			if (a.getPreco().preco > caro (preco) && a.getPreco()>=60000){
				obterCareza.add(a);
			}
		}
		
	}*/
	public Carro obterCarroCerto() {

		Carro cAnoC = null;
		LocalDate anoquerinte = LocalDate.now();

		for (Carro c : listaCarros) {
			if (c.getDataDeAquecicao().isBefore(anoquerinte)) {
				anoquerinte = c.getDataDeAquecicao();
				cAnoC = c;
			}
	
		}
		
		return cAnoC;
}
}

