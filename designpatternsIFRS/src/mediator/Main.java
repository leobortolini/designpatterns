package mediator;
public class Main {
	public static void main(String[] args) {
		
		IAtc atcMediator = new Atc();
		
		Pista pista = new Pista(atcMediator);
		
		Voo voo1 = new Voo(atcMediator);
		//Voo voo2 = new Voo(atcMediator);

		
		atcMediator.registrarVoo(voo1);
		atcMediator.registrarPista(pista);
		
		voo1.prontoParaPousar();
		//pista.pouso();
		//voo1.pouso();
		
		//voo2.pouso();
		
		voo1.estacionado();
		
		//voo2.pouso();
		
	}
}
