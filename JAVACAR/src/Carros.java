import java.time.LocalDate;

public class Carros {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro ("Volkswagen","Gol","FTX2A45","2010",21000, LocalDate.of(2024,3,14));
		Carro c2 = new Carro ("Chevrolet","Onix","JKM9B12","2015",38000, LocalDate.of(2024,11,29));
		Carro c3 = new Carro ("Honda","Civic","LPR4C67","2010",34000, LocalDate.of(2023,6,7));
		Carro c4 = new Carro ("Chevrolet","Cruze","QWE7D89","2019",75000,LocalDate.of(2025,1,18));
		Carro c5 = new Carro ("Volkswagen","Polo","ZTR1F23","2019",58000, LocalDate.of(2024,8,25));
		
		Sistema a1 = new Sistema();
		
		a1.adicionarSistema(c1); 
		a1.adicionarSistema(c2); 
		a1.adicionarSistema(c3); 
		a1.adicionarSistema(c4);
		a1.adicionarSistema(c5);
		System.out.println(a1.obterCarroCerto());
	
		}
	
	}