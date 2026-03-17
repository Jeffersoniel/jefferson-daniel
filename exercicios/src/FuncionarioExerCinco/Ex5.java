package FuncionarioExerCinco;

public class Ex5 {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		fun1.identificacao = "1543";
		fun1.nome = "Guilherme";
		fun1.sobrenome = "Paredes";
		fun1.salario = 100.00;
		
		System.out.println("O funcionario "+fun1.nome+" "+fun1.sobrenome+" com ID : "+fun1.identificacao+" tem o salario de : "+fun1.salario);
		System.out.println("E vai receber um aumento de Ficando com um salario de : " + fun1.salario);
		System.out.println("Salario anual de : "+fun1.salAnual());
		fun1.salFinal(100);
		System.out.println("Novo salário ; R$"+fun1.salario);
	}
}
