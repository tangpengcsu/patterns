package proxy;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class StaticProxy implements Star {
    private Star star;

    public StaticProxy(Star star) {
        this.star = star;
    }

    public void signContract() {
        System.out.println("代理签约");
    }

    public void singSong() {
        star.singSong();
    }

    public void collectMoney() {
        System.out.println("代理收钱");
    }
}
