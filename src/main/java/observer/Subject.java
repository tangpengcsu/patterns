package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public abstract class Subject {

    protected List<Observer> observers = new LinkedList();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected abstract void notifyObservers();

    public abstract String getState();

    public abstract void setState(String state);
}
