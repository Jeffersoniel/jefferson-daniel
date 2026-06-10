public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String especie, double peso, String raca) {
        super(especie, peso);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Au Au!";
    }
}