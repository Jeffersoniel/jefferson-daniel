package FuncionarioExerCinco;

public class Funcionario {

	String identificacao;
	String nome;
	String sobrenome;
	double salario;
	double porcentagem;
	
public void salAumento(){
	
	salario = salario + (salario*porcentagem)/100;
	
	}
}
