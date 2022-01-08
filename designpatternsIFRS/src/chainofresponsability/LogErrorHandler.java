package chainofresponsability;

/*
 * implementação do handler de logerror
 */

public class LogErrorHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogErrorHandle - Tentanto tratar requisição");
		String result = null;
		
		if(request=="error") {
			result = "Requisição aceita: Tratando requisição de log de ERRO.";
			/* Aqui poderia ser usada qualquer lógica, como por exemplo 
			   gravar o valor em um arquivo, mandar por e-mail, gravar no banco, etc.. 
			 */
		}
		return result;
	}

}
