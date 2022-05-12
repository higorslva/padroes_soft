import java.util.List;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    Life life = new Life();
    List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();


    life.set("1000");
    savedTimes.add(life.saveToMemento());

    life.set("2000");
    savedTimes.add(life.saveToMemento());

    life.set("3000");
    savedTimes.add(life.saveToMemento());

    life.set("4000");
    savedTimes.add(life.saveToMemento());

    life.restoreFromMemento(savedTimes.get(0));
  }
}
