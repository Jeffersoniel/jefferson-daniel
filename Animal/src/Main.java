public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Canino", 12.5, "Labrador");
        Gato gato = new Gato("Felino", 4.2, true);

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }
}