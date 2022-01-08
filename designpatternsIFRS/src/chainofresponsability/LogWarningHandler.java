package chainofresponsability;

public class LogWarningHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisi��o");
		String result = null;
		
		if(request=="warning") {
			result = "Requisi��o aceita:Tratando requisi��o de log de WARNING.";
			/* Aqui poderia ser usada qualquer l�gica, como por exemplo 
			   gravar o valor em um arquivo, mandar por e-mail, gravar no banco, etc.. 
			 */
		}
		return result;
	}

}
