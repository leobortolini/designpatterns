package mediator;
public class Main {
	public static void main(String[] args) {
		// instanciando o mediator
		IAtc atcMediator = new Atc();
		
		//instanciando a pista
		Pista pista = new Pista(atcMediator);
		
		//instanciando os 2 voos
		Voo voo1 = new Voo(atcMediator);
		Voo voo2 = new Voo(atcMediator);

		//registrando os objetos no mediator
		atcMediator.registrarVoo(voo1);
		atcMediator.registrarPista(pista);
		
		//sinalizando intenção de pouso
		voo1.prontoParaPousar();
		//abrindo pista para pouso
		pista.pouso();
		//realizando pouso
		voo1.pouso();
		//tentando pousar propositalmente, resultando em erro, pois o mediator ainda nao liberou a pista
		voo2.pouso();
		//sinalizando estacionamento do voo1, liberado a pista
		voo1.estacionado();
		//agora sim, pouso com sucesso, pois a pista foi liberada
		voo2.pouso();
		
	}
}
