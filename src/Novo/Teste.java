package Novo;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Testando");
		Estudantes al = new Estudantes();
		
		al.nome = "Rafael";
		al.idade = 25;
		System.out.println(al.nome + " " + al.idade);
		System.out.println("Editei aqui via web!");
	}

}
