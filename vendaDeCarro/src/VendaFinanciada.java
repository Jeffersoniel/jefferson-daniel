public class VendaFinanciada {

	public static void main(String[] args) {

 
        CarroFinanciado carro = new CarroFinanciado("Chevrolet Onix", 65000.00);

        
        double taxaJurosMes = 1.5; 
        int prazoMeses = 12;       
       
        double valorTotalFinanciado = carro.calcularMontanteFinanciado(taxaJurosMes, prazoMeses);
        double valorJurosApenas = valorTotalFinanciado - carro.getPrecoVista();
        double valorParcela = valorTotalFinanciado / prazoMeses;

        
        System.out.println("====== PROPOSTA DE VENDA (JUROS COMPOSTOS) ======");
        System.out.printf("Veículo negociado: %s%n", carro.getModelo());
        System.out.printf("Preço à vista: R$ %.2f%n", carro.getPrecoVista());
        System.out.printf("Taxa de juros aplicada: %.2f%% a.m.%n", taxaJurosMes);
        System.out.printf("Prazo do financiamento: %d meses%n", prazoMeses);
        System.out.println("-------------------------------------------------");
        System.out.printf("Valor total ao final: R$ %.2f%n", valorTotalFinanciado);
        System.out.printf("Total pago apenas em juros: R$ %.2f%n", valorJurosApenas);
        System.out.printf("Valor de cada parcela (%dx): R$ %.2f%n", prazoMeses, valorParcela);
        System.out.println("=================================================");
}
}
