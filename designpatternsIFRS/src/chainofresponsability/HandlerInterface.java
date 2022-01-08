package chainofresponsability;

public interface HandlerInterface {
	//Recebe o próximo objeto
	public HandlerInterface next(HandlerInterface next);
	
	//Trata a requisião
	public String handle(String request);
}
