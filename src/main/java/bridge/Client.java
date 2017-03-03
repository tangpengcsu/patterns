package bridge;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Client {
    @Test
    public void test(){
        Computer computer = new Desktop(new Dell());
        computer.sale();
    }
}
