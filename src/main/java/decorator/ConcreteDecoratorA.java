package decorator;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("功能A");

    }
}
