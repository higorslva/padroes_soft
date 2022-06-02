import java.util.Iterator;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
    public Iterator<Observer> iterator() {
        return null;
    }
}