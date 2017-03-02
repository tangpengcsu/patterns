package adapter;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
