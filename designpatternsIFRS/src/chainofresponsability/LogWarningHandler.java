package chainofresponsability;

/*
 * implementação do handler de warningerror
 */
public class LogWarningHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisição");
		String result = null;
		
		if(request=="warning") {
			result = "Requisição aceita:Tratando requisição de log de WARNING.";
			/* Aqui poderia ser usada qualquer lógica, como por exemplo 
			   gravar o valor em um arquivo, mandar por e-mail, gravar no banco, etc.. 
			 */
		}
		return result;
	}

}
