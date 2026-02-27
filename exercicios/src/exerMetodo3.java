import java.util.Scanner;

public class exerMetodo3 
{

	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int numInicial = input.nextInt();
		
		exibirNumeros(numInicial);
	}
	
	public static void exibirNumeros (int numero)
	{
		System.out.println("Número inicial: " + numero);
	    System.out.println("Os 20 números seguintes são:");
	   
	    for (int i = 0; i <= 20; i++)	{
	    System.out.print((numero + i) + " ");
	    }
	}
}

