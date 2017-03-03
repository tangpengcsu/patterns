package bridge;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Pad extends Computer {
    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public String type() {
        return "平板";
    }
}
