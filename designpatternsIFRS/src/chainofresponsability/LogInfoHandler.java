package chainofresponsability;

/*
 * implementação do handler de loginfo
 */
public class LogInfoHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogInfoHandle - Tentanto tratar requisição");
		String result = null;
		
		if(request=="info") {
			result = "Requisição aceita: Tratando requisição de log de INFO.";
			/* Aqui poderia ser usada qualquer lógica, como por exemplo 
			   gravar o valor em um arquivo, mandar por e-mail, gravar no banco, etc.. 
			 */
		}
		return result;
	}

}
