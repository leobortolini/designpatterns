package memento;

public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento generateMemento(){
      return new Memento(state);
   }

   public void setStateFromMemento(Memento memento){
	   this.setState(memento.getState());
   }
}