package chainofresponsability;

public class LogErrorHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogErrorHandle - Tentanto tratar requisi��o");
		String result = null;
		
		if(request=="error") {
			result = "Requisi��o aceita: Tratando requisi��o de log de ERRO.";
			/* Aqui poderia ser usada qualquer l�gica, como por exemplo 
			   gravar o valor em um arquivo, mandar por e-mail, gravar no banco, etc.. 
			 */
		}
		return result;
	}

}
