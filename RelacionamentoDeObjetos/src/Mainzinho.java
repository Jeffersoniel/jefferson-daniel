public class Mainzinho {
    public static void main(String[] args) {
        CalculoRetangulou gerenciador = new CalculoRetangulou();

        try {
            
            gerenciador.adicionarRetangulo(new Retangulou(10.0, 5.0)); 
            gerenciador.adicionarRetangulo(new Retangulou(2.0, 20.0)); 
            gerenciador.adicionarRetangulo(new Retangulou(7.0, 8.0));  

         
            Retangulou rMaiorArea = gerenciador.obterMaiorArea();
            Retangulou rMaiorPerimetro = gerenciador.obterMaiorPerimet
          
            Retangulou invalido = new Retangulou(-5.0, 10.0); 

        } catch (IllegalArgumentException | IllegalStateException e) {
            
            System.err.println(e.getMessage());
        }
    }
}
