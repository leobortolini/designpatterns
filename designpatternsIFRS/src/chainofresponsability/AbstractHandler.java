package chainofresponsability;

public abstract class AbstractHandler implements HandlerInterface{

	private HandlerInterface next;
	
	
	@Override
	public HandlerInterface next(HandlerInterface handler) {
		this.next = handler;
		return handler;
	}

	//Na implementa��o cl�ssica deseja-se que o m�todo handle() n�o possa ser modificado por classes filhas
	@Override
	final public String handle(String request) { 
		String result = this.process(request);
		
		if ((result == null || result.isEmpty()) && this.next!=null) {
			System.out.println("Requisi��o negada: Passando para o pr�ximo handler...");
			result = this.next.handle(request);
		}
		
		return result;
	}
	
	abstract protected String process(String request);
	
}
