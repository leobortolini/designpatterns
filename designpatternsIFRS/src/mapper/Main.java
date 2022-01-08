package mapper;

public class Main {
	public static void main(String[] args) {
		
		Originator originador = new Originator();
	    History armazenador = new History();
	    
	    
	    originador.setState("State #1");
	    
	    
	    originador.setState("State #2");
	    armazenador.saveState(originador.generateMemento());
	    
	    
	    originador.setState("State #3");
	    armazenador.saveState(originador.generateMemento());
	    
	    
	    originador.setState("State #4");
	    System.out.println("Current State: " + originador.getState());		
	    
	    originador.setStateFromMemento(armazenador.getState(0));
	    System.out.println("First saved State ----- " + originador.getState());
	    
	    originador.setStateFromMemento(armazenador.getState(1));
	    System.out.println("Second saved State ----- " + originador.getState());
	}
}