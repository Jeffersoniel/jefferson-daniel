public class Gato extends Animal {
    private boolean castrado;

    public Gato(String especie, double peso, boolean castrado) {
        super(especie, peso);
        this.castrado = castrado;
    }
    @Override
    public String emitirSom() {
        return "Miau!";
    }
	public Gato(String especie, double peso) {
		super(especie, peso);
	}
}