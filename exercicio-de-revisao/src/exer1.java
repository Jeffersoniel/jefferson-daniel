import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Insira seu Nome : ");
	String nome = input.next();
	
	System.out.println("Insira seu número de Matrícula : ");
	String matricula = input.next();
		
	System.out.println("insira quanto ganha por horas : ");
	double valorhora = input.nextDouble();
	
	System.out.println("insira quantas horas trabalhadas : ");
	double horas = input.nextDouble();	
		
	double valortotal = ( horas * valorhora) /20;
	
	System.out.println("O Funcionario "+nome+" N° de Matricula : "+matricula+" \n"+"Ira receber : "+valortotal);
	
	}
}
