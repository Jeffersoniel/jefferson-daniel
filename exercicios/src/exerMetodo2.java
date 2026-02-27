import java.util.Scanner;

public class exerMetodo2 
{

public static void main(String[] args) 
{
	
	Scanner input = new Scanner(System.in);
	System.out.println("Insira o Nome do(a) colega: ");
	String nome = input.next();
	
		if (nome.equalsIgnoreCase("João")) {
			amigoJoao();	}
		
		else if (nome.equalsIgnoreCase("Maria")) {
			amigaMaria();	}
}
	
	
	public static void amigoJoao() 
	{
		System.out.println("O nome dele é João");
		System.out.println("Tem 20 anos");
		System.out.println("É estudante de Desenvolvimento de sistemas");
	}
	public static void amigaMaria() 
	{
		System.out.println("O nome dela é Maria");
		System.out.println("Tem 20 anos");
		System.out.println("É estudante de Desenvolvimento de sistemas");
	}
}
