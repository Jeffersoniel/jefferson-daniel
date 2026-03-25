package exer7;

public class aeronave {
		
	String Nave;
	int Passageiros;
	double VelocidadeMax;
	double CombustivelMax;
	double QueimaPorMin;
	
	public aeronave (String Nave,int Passageiros,double VelocidadeMax,double CombustivelMax,double QueimaPorMin) {
		super();
		this.Nave=Nave;
		this.Passageiros=Passageiros;
		this.VelocidadeMax=VelocidadeMax;
		this.CombustivelMax=CombustivelMax;
		this.QueimaPorMin=QueimaPorMin;
	}
	public double calcularAutonomia() {
		return CombustivelMax / QueimaPorMin;
	}
	public double calcularDistancia(){
		return VelocidadeMax * calcularAutonomia();
	}
	
	@Override
	public String toString() {
		return "aeronave [Nave=" + Nave + ", Passageiros=" + Passageiros + ", VelocidadeMax=" + VelocidadeMax
				+ ", CombustivelMax=" + CombustivelMax + ", QueimaPorMin=" + QueimaPorMin + "]";
	}

}
