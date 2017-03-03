package observer;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class WareHouseObserver implements Observer {
    private String orderState;
    public void update(Subject subject) {
        orderState = subject.getState();
        System.out.println("库存系统接收到消息 [" + orderState + "], 减少库存");
    }
}
