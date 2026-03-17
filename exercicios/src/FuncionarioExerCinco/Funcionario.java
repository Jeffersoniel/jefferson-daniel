package FuncionarioExerCinco;

public class Funcionario {

	String identificacao;
	String nome;
	String sobrenome;
	double salario;
	
	public void salFinal(double aumento) {
	
		double porcentagem = aumento /100;
		double salFinal = salario + (salario*porcentagem);
		salario = salFinal;
	}
	public double salAnual() {
		return salario * 12;
		
	}
}
