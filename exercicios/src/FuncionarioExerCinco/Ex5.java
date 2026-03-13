package FuncionarioExerCinco;

public class Ex5 {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
	
		fun1.identificacao = "1543";
		fun1.nome = "Guilherme";
		fun1.sobrenome = "Paredes";
		fun1.salario = 100.00;
		fun1.porcentagem = 20;
		
		
		System.out.println("O funcionario"+fun1.nome+fun1.sobrenome+"com ID : "+fun1.identificacao+" tem o salario de "+fun1.salario);
		fun1.salAumento();
		System.out.println("E vai receber um aumento de "+fun1.porcentagem+"%"+ ". Ficando com um salario de :"+fun1.salario);
	}
}
