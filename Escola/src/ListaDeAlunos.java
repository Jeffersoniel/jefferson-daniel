import java.util.ArrayList;
import java.util.List;

public class ListaDeAlunos {

	private List<AlunoObjeto> listaAlunos;

	public ListaDeAlunos() {
		listaAlunos = new ArrayList<>();
	}

	public void adicionar(AlunoObjeto aluno) {
		this.listaAlunos.add(aluno);
	}

	public List<AlunoObjeto> obterAlunoObjetos() {
		return listaAlunos;
	}

	public List<AlunoObjeto> ObterListaDeAlunos(String aluno) {
		List<AlunoObjeto> resultado = new ArrayList<>();
		for (AlunoObjeto a : listaAlunos) {
			if (a.getAluno().equals(aluno)) {
				resultado.add(a);
			}
		}

		return resultado;
	}
}
