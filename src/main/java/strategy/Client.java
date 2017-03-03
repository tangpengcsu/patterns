package strategy;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Client {
    @Test
    public void client() {
        double money = 1000;
        Context context = new Context();
        context.setStrategy(Context.Type.NORMAL);
        System.out.println("原价: [" + context.getResult(money) + "]");


        context.setStrategy(Context.Type.REBATE, 100, 20);
        System.out.println("满100返20: [" + context.getResult(money) + "]");

        context.setStrategy(Context.Type.DISCOUNT, 0.8);
        System.out.println("6折优惠: [" + context.getResult(money) + "]");
    }
}
