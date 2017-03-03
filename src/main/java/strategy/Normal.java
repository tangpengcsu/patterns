package strategy;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Normal implements Strategy {
    public double acceptCash(double money) {
        return money;
    }
}
