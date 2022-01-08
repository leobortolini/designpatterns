package mediator;
public class Atc implements IAtc {
	public Boolean disponivel;
	
	@Override
	public void registrarVoo(Voo voo) {
	}
	
	@Override
	public void registrarPista(Pista pista) {
	}
	
	@Override
	public void setDisponibilidade(Boolean status) {
		this.disponivel = status;
	}
	
	@Override
	public Boolean estaDisponivel() {

		return disponivel;
	}
	
	}
