package chainofresponsability;

public interface HandlerInterface {
	//Recebe o pr�ximo objeto
	public HandlerInterface next(HandlerInterface next);
	
	//Trata a requisi��o
	public String handle(String request);
}
