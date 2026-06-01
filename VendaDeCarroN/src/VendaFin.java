
public class VendaFin {

public static void main(String[] args) {
		
		CarroFin c1 = new CarroFin("Honda Bros 160",18500.00);
		CarroFin c2 = new CarroFin("Honda XRE 300", 29000.00);
		
		Garagem garagem = new Garagem();
		garagem.adicionarCarro(c1);
		garagem.adicionarCarro(c2);

		System.out.println(garagem.obterCarroMaisCaro());
	}
}
