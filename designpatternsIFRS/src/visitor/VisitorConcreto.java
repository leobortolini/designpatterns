package visitor;

public class VisitorConcreto implements Visitor {
	
	public void visit (ElementoConcreto elementoConcreto) {
		
		System.out.println ("Estou visitando: " +
			elementoConcreto.getClass().getName());
	}

}