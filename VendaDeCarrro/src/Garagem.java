
import java.util.ArrayList;
import java.util.List;


public class Garagem {

   
    private List<CarroFinanciado> listaCarros;

   
    public Garagem() {
        listaCarros = new ArrayList<CarroFinanciado>();
    }

  
    public void adicionarCarro(CarroFinanciado carro) {
        listaCarros.add(carro);
    }

 
    public CarroFinanciado obterCarroMaisCaro() {
        CarroFinanciado carroMaisCaro = null;
        double maiorPreco = 0.0;

        for (CarroFinanciado c : listaCarros) {
            if (c.getPrecoVista() > maiorPreco) {
                maiorPreco = c.getPrecoVista();
                carroMaisCaro = c;
            }
        }

        return carroMaisCaro;
    }
}