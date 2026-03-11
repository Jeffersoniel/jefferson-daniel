package POO;

public class definicao {

	public static void main(String[] args) {
		
		pessoa p1= new pessoa();
		pessoa p2= new pessoa();

		p1.sexo = 'M';
		p1.data = "12/12/2000";
		p1.estadoCivil = "Solteiro";
		
		p2.sexo = 'F';
		p2.data = "01/01/2000";
		p2.estadoCivil = "Solteira";
		
		System.out.println("Sexo , Data de nascimento e estado civil da 1° pessoa: "+ p1.sexo+" ,"+p1.data+" e está "+p1.estadoCivil+"\nSexo , Data de nascimento e estado civil da 2° pessoa: "+ p2.sexo+" ,"+p2.data+" e está "+p2.estadoCivil);
		
		
	}

}
