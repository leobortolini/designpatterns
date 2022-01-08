package mediator;
public class Voo implements Comando {
	private IAtc atcMediator;
	Voo (IAtc atcMediator){
		this.atcMediator = atcMediator;
	}
	
	@Override
	public void pouso() {
		if(atcMediator.estaDisponivel()) {
			System.out.println("Pouso realizado com sucesso!");
			atcMediator.setDisponibilidade(false); //a pista est� ocupada
		}
		else {	
			System.out.println("Aguarde pista dispon�vel");
		}	
		
	}
	public void  prontoParaPousar() {
		System.out.println("Pouso iniciado");
		
	}
	public void estacionado() {
		System.out.println("Voo estacionado.");
		atcMediator.setDisponibilidade(true);//a pista est� dispon�vel
	}
}
