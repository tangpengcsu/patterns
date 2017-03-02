package decorator;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class ConcreteComponent implements Component {
    public void doSomething() {
        System.out.println("具体对象：" + this.toString());
    }
}
