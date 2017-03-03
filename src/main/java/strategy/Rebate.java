package strategy;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Rebate implements Strategy {
    private double cashState;
    private double cashReturn;

    public Rebate(double cashState, double cashReturn) {
        this.cashState = cashState;
        this.cashReturn = cashReturn;
    }

    public double acceptCash(double money) {
        if (money > cashState) {
            money -= Math.floor(money / cashState) * cashReturn;
        }
        return money;
    }
}
