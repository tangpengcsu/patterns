package strategy;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Discount implements Strategy{
    private double rate;
    public Discount(double rate) {
        if (rate > 1.0) {
            throw new RuntimeException("折扣力度怎么能大于1.0?");
        }
        this.rate = rate;
    }
    public double acceptCash(double money) {
        return money * rate;
    }
}
