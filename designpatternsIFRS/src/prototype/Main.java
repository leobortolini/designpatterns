package prototype;

public class Main {

	public static void main(String[] args) {
		//instanciando a pessoa1
		Person pessoa_1 = new Person("Nome", "Ficticio");
		
		//clonando a pessoa1 e atribuindo para outras 2 pessoas
		Person pessoa_2 = pessoa_1.clone();
		Person pessoa_3 = pessoa_1.clone();
		
		//trocando atributos das outras 2 pessoas
		pessoa_2.setFirstName("Usuario");
		pessoa_3.setFirstName("Outro usuario");
		
		//printando atributos das 3 pessoas
		System.out.println(pessoa_1.toString());
		System.out.println(pessoa_2.toString());
		System.out.println(pessoa_3.toString());
	}
}
