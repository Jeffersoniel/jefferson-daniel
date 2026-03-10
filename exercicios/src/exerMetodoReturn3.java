
import java.util.Scanner;

public class exerMetodoReturn3 {

	    public static boolean Par(int numero) {
	        return numero % 2 == 0 ;
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int num = input.nextInt();

	        if (Par(num)) {
	            System.out.println("O número é par");
	        } else {
	            System.out.println("O número é ímpar");
	        }
	}
}

