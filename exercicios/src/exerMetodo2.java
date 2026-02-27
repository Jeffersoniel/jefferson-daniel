import java.util.Scanner;

public class exerMetodo2 {

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
	
	
	public static void amigoJoao() {
		System.out.println("é verão");
		System.out.println("e está quente");
	}
	public static void amigaMaria() {
		System.out.println("é inverno");
		System.out.println("e está frio");
	}
}
