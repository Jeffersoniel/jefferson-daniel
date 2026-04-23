package arrayteste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
	List<Integer> testeLista = new ArrayList<>();
	testeLista.add(1);
	testeLista.add(32);
	testeLista.add(25);
	testeLista.add(64);
	testeLista.add(14);
	
	System.out.println(testeLista);
	
	testeLista.sort(null);
	System.out.println(testeLista);
	
	System.out.println(testeLista.get(0));
	System.out.println(testeLista.size()-1);
	
	System.out.println(testeLista.indexOf(25));

	testeLista.sort(Collections.reverseOrder());
	System.out.println(testeLista);
	
	System.out.println(testeLista.get(0));
	System.out.println(testeLista.size()-1);

	System.out.println(testeLista.indexOf(1));

	Scanner input = new Scanner (System.in);
	System.out.println(" insira o valor que deseja pesquisar: ");
	int numero = input.nextInt();
	int indice = testeLista.indexOf(numero);
	
	if (indice != -1) {
		System.out.println("O valor "+numero+" está no indice "+indice);
	}else {
		System.out.println(" O valor não está na lista ");
	}
	
	double media = 0;
		for(int i = 0; i < testeLista.size(); i++) {
		media = media + testeLista.get(i);
		}
		System.out.println(media/testeLista.size());
		}
	}
