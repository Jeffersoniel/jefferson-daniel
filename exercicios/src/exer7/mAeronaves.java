package exer7;

public class mAeronaves {
	
	public static void main(String[] args) {
	
	aeronave a1 = new aeronave("nave1",101,1014,1015,1016);
	
	aeronave a2 = new aeronave("nave2",109,1010,1011,1012);
	
	aeronave a3 = new aeronave("nave3",100,2000,3000,4000);
	
	aeronave listaAeronaves[] = { a1, a2, a3 };
	
	int maiorPassageiros = 0;
	aeronave aeronaveMaisPassageiros = null;
	
	for (int i = 0; i < listaAeronaves.length; i++) {
		if (listaAeronaves[i].Passageiros > maiorPassageiros) {
			maiorPassageiros = listaAeronaves[i].Passageiros;
			aeronaveMaisPassageiros = listaAeronaves[i];
		}
	}
			System.out.println(aeronaveMaisPassageiros);	

}
}
	
