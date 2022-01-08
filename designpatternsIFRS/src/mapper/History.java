package mapper;

import java.util.ArrayList;

public class History {
   private ArrayList<Memento> mementoList = new ArrayList<Memento>();

   public void saveState(Memento state){
      mementoList.add(state);
   }

   public Memento getState(int index){
      return mementoList.get(index);
   }
}