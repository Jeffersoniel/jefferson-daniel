public abstract class Animal {
    protected String especie;
    protected double peso;

    public Animal(String especie, double peso) {
        this.especie = especie;
        this.peso = peso;
    }
    public String emitirSom() {
        return "Som genérico";
    }
}
