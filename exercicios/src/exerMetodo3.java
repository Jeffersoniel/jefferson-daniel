import java.util.Scanner;

public class exerMetodo3 
{

	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numero = input.nextInt();
		
		exibirNumeros(numero);
	}
	
	public static void exibirNumeros(int numInicial)
	{
	    for (int i = numInicial; i <= numInicial + 20; i++)
	    {
	    	System.out.print(i +" ");
	    }
	}
	
}
