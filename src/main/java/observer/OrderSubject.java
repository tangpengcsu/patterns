package observer;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class OrderSubject extends Subject {
    private String state;

    @Override
    protected void notifyObservers() {
       for(Observer observer : observers){
           observer.update(this);
       }
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }
}
