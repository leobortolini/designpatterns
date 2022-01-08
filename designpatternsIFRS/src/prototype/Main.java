package prototype;

public class Main {

	public static void main(String[] args) {
		Person pessoa_1 = new Person("Nome", "Ficticio");
		Person pessoa_2 = pessoa_1.clone();
		Person pessoa_3 = pessoa_1.clone();
		
		pessoa_2.setFirstName("Usuario");
		pessoa_3.setFirstName("Outro usuario");
		
		System.out.println(pessoa_1.toString());
		System.out.println(pessoa_2.toString());
		System.out.println(pessoa_3.toString());
	}
}
