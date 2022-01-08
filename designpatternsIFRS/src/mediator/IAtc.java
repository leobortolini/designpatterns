package mediator;

public interface IAtc {
	public void registrarVoo(Voo voo);
	public void registrarPista(Pista pista);
	public void setDisponibilidade(Boolean status);
	public Boolean estaDisponivel();
}


