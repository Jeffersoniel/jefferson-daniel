public class Main {
	
	public static void main(String[]args) {
		
		ListaDeAlunos sistema = new ListaDeAlunos ();
		
		AlunoObjeto a1 = new AlunoObjeto("Jefferson" , 21 , 6 ,"1");
		AlunoObjeto a2 = new AlunoObjeto("Guilherme" , 20 , 7 ,"3");
		AlunoObjeto a3 = new AlunoObjeto("Henrique" , 22 , 5 ,"2");
		
		sistema.adicionar(a1);
		sistema.adicionar(a2);
		sistema.adicionar(a3);
		
		System.out.println(sistema.ObterListaDeAlunos("Henrique"));
	}
		
}

