package exemplo;

import java.util.Scanner;

public class AtiviadeScanner {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	double precoProduto1 = 1.99;
	double precoProduto2 = 2.00;
	
	double valorFinal = precoProduto1 + precoProduto2;
	
	System.out.println("Você deve pagar : R$ "+ valorFinal);
	}
}
