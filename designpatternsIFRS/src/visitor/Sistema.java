package visitor;

public class Sistema {

	public static void main(String[] args) {
		ElementoConcreto elementoConcreto = new ElementoConcreto();
		VisitorConcreto visitorConcreto = new VisitorConcreto();
		elementoConcreto.accept(visitorConcreto);
	}

}