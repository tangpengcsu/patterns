package observer;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Client {
    @Test
    public void Client(){
        Subject subject = new OrderSubject();

        Observer payObserver = new PayObserver();
        Observer relationObserver = new RelationObserver();
        Observer wareHouseObserver = new WareHouseObserver();

        subject.attach(payObserver);
        subject.attach(relationObserver);
        subject.attach(wareHouseObserver);

        subject.setState("已付款");

        System.out.println("-------------");
        // 付钱、发货完成
        subject.detach(payObserver);
        subject.detach(wareHouseObserver);

        subject.setState("取消订单");
    }
}
