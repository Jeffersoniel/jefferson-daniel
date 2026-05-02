public class AlunoObjeto {

	private String aluno;
	private int idade;
	private double media;
	private String matricula;

	public String getAluno() {
		return aluno;
	}

	public AlunoObjeto(String aluno, int idade, double media, String matricula) {

		setAluno(aluno);
		setIdade(idade);
		setMedia(media);
		setMatricula(matricula);

	}

	public void setAluno(String aluno) {
		if (aluno == null || aluno.isBlank()) {
			throw new IllegalArgumentException("Aluno inexistente");
		}
		this.aluno = aluno;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0 || idade > 100) {
			throw new IllegalArgumentException("idade inválida");
		}
		this.idade = idade;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		if (media < 5 || media > 10) {
			throw new IllegalArgumentException("media invalida");
		}
		this.media = media;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula == null || matricula.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "AlunoObjeto [aluno=" + aluno + ", idade=" + idade + ", media=" + media + ", matricula=" + matricula
				+ "]";
	}
}
