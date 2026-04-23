import java.util.ArrayList;

public class CalculoRetangulou {
 
    private ArrayList<Retangulou> listaDeRetangulos;

    
    public CalculoRetangulou() {
        this.listaDeRetangulos = new ArrayList<>();
    }

    
    public void adicionarRetangulo(Retangulou r) {
        if (r == null) {
            throw new IllegalArgumentException("Erro: O retângulo não pode ser nulo.");
        }
        this.listaDeRetangulos.add(r);
    }

  
    public Retangulou obterMaiorArea() {
        if (listaDeRetangulos.isEmpty()) {
            throw new IllegalStateException("Erro: A lista de retângulos está vazia.");
        }

        Retangulou maiorArea = listaDeRetangulos.get(0);

        for (Retangulou r : listaDeRetangulos) {
            if (r.calcularArea() > maiorArea.calcularArea()) {
                maiorArea = r;
            }
        }
        return maiorArea;
    }

    public Retangulou obterMaiorPerimetro() {
        if (listaDeRetangulos.isEmpty()) {
            throw new IllegalStateException("Erro: A lista de retângulos está vazia.");
        }

        Retangulou maiorPerimetro = listaDeRetangulos.get(0);

        for (Retangulou r : listaDeRetangulos) {
            if (r.calcularPerimetro() > maiorPerimetro.calcularPerimetro()) {
                maiorPerimetro = r;
            }
        }
        return maiorPerimetro;
    }
    
  
    public ArrayList<Retangulou> getListaDeRetangulos() {
        return listaDeRetangulos;
    }
}