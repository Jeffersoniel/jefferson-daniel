package Retangulo;

public class ColetaneoDeRetagulo {

	private List<Retangulo> listaRetangulos;
	
	public ColetaneoDeRetangulo() {
		listaRetangulos = new Arraylist<>();
	}
	
	public void adicionarRetangulo(Retangulo r) {
		listaRetangulos.add(r);
	}
	
	public list<Retangulo> obterLista(){
		return listaRetangulos;
	}
	
	public Retangulo obterRetanguloMaiorPerimetro() {
		double maiorPerimetro = Double.MIN_VALUE;
		
		for(Retangulo r : listaRetangulos) {
			if(r.obterPerimetro()> maiorPerimetro) {
				maiorPerimetro = r.obterPerimetro();
				retMaiorPerimetro = r;
			}
		}
		return retMaiorPerimetro;
	}
	
	public Retangulo obterRetanguloMaiorArea() {
		double  maiorArea = Double.MIN_VALUE;
		
		for(Retangulo r : listaRetangulos) {
			if (r.obterArea()>maiorArea) {
				maiorArea = r.obterArea();
				retMaiorArea = r;
			}
	}
		return retMaiorArea;
}
}
