package memento;

public class Main {
	public static void main(String[] args) {
		//instanciando objeto de exemplo
		Originator originador = new Originator();
		// objeto para armazenar os estados
	    History armazenador = new History();
	    
	    //setando o estado1 do objeto
	    originador.setState("State #1");
	    
	    //setando o estado2 do objeto
	    originador.setState("State #2");
	    
	    //gerando imagem (memento) do objeto e salvando no armazenador
	    armazenador.saveState(originador.generateMemento());
	    
	    //setando estado3 do objeto
	    originador.setState("State #3");
	  //gerando imagem (memento) do objeto e salvando no armazenador
	    armazenador.saveState(originador.generateMemento());
	    
	    //setando estado4 do objeto
	    originador.setState("State #4");
	    //printando estado atual na tela
	    System.out.println("Current State: " + originador.getState());		
	    
	    //setando o primeiro estado armazenado no armazenador no objeto
	    originador.setStateFromMemento(armazenador.getState(0));
	    //printando o objeto após setar o seu primeiro memento
	    System.out.println("First saved State ----- " + originador.getState());
	    
	    //setando o segundo estado armazenado no armazenador no objeto
	    originador.setStateFromMemento(armazenador.getState(1));
	    //printando o estado do objeto após setar o seu segundo memento como valor
	    System.out.println("Second saved State ----- " + originador.getState());
	}
}