public class Main {
	
	public static void main(String[]args) {
		
		ListaDeAlunos sistema = new ListaDeAlunos() ();
		
		AlunoObjeto a1 = new AlunoObjeto("Jefferson" , 20 , 6 ,"1");
		AlunoObjeto a2 = new AlunoObjeto("Guilherme" , 20 , 7 ,"1");
		AlunoObjeto a3 = new AlunoObjeto("Henrique" , 20 , 5 ,"1");
		
		sistema.atualizaAlunos(a1);
		sistema.atualizaAlunos(a2);
		sistema.atualizaAlunos(a3);
		
		System.out.println(sistema.ObterListaDeAlunos("Jefferson"));
	}
		
}

