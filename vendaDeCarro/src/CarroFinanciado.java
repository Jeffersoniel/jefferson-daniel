public class CarroFinanciado {

	private String modelo;
    private double precoVista;

    public CarroFinanciado(String modelo, double precoVista) {
        this.modelo = modelo;
        this.precoVista = precoVista;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoVista() {
        return precoVista;
    }

    public double calcularMontanteFinanciado(double taxaMensal, int meses) {
        double capital = this.precoVista;
        double taxaDecimal = taxaMensal / 100; 
         
        double fatorCrescimento = 1.0;
        for (int m = 1; m <= meses; m++) {
            fatorCrescimento = fatorCrescimento * (1 + taxaDecimal);
        }

        double montanteFinal = capital * fatorCrescimento;
        return montanteFinal;
    }
}
