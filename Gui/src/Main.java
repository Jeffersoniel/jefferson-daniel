import java.util.ArrayList;
	import java.util.Scanner;	
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        ArrayList<Ponto> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nome = sc.nextLine().trim();
            int residuos = Integer.parseInt(sc.nextLine().trim());
            lista.add(new Ponto(nome, residuos));
        }

        lista.sort((p1, p2) -> p1.residuos != p2.residuos
                ? Integer.compare(p2.residuos, p1.residuos)
                : p1.nome.compareTo(p2.nome));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " - " + lista.get(i).nome);
        }
    }
}

