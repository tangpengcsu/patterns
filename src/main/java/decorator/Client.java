package decorator;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class Client {
    @Test
    public void Client() {
        //具体构件  
        Component component = new ConcreteComponent();

        // 具体装饰者装饰具体构件  
        Component decorator = new ConcreteDecoratorA(component);
        decorator.doSomething();

        // 具体装饰者可以装饰具体装饰者（实际上它并不知道）  
        Component decorator2 = new ConcreteDecoratorB(decorator);

        decorator2.doSomething();
    }
}
