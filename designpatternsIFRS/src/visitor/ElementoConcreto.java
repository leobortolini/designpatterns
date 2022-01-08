package visitor;

public class ElementoConcreto extends Elemento {
	
	public void accept (Visitor visitor) {
		visitor.visit(this);
		super.accept(visitor);
	}

}