package chainofresponsability;

public class exampleOneTest {

	public static void main(String[] args) {

		//Instancio os Handlers
		LogInfoHandler logInfoHandler = new LogInfoHandler();
		LogWarningHandler logWarningHandler = new LogWarningHandler();
		LogErrorHandler logErrorHandler = new LogErrorHandler();
		/*
		 * iniciando a sequencia de processamentos
		 */
		logInfoHandler.next(logWarningHandler);
		logWarningHandler.next(logErrorHandler);
		
		
		String response = logInfoHandler.handle("error");
		System.out.println(response);
	}

}
