package observer;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class PayObserver implements Observer {
    private String orderState;
    public void update(Subject subject) {
        orderState = subject.getState();
        System.out.println("支付系统接收到消息 [" + orderState + "], 正在收钱");
    }
}
