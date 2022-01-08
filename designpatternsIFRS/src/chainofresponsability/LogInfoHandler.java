package chainofresponsability;

public class LogInfoHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisi��o");
		String result = null;
		
		if(request=="info") {
			result = "Requisi��o aceita:Tratando requisi��o de log de INFO.";
			/* Aqui poderia ser usada qualquer l�gica, como por exemplo 
			   gravar o valor em um arquivo, mandar por e-mail, gravar no banco, etc.. 
			 */
		}
		return result;
	}

}
