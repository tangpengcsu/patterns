package proxy;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class Client {
    @Test
    public void Client() {
        Star star = new StaticProxy(new RealStar());
        star.signContract();
        star.singSong();
        star.collectMoney();
    }
}
