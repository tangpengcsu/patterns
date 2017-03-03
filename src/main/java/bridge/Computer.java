package bridge;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public abstract class Computer {
    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public abstract String type();
    public void sale(){
        System.out.println("我们卖的是<" + brand.brand() + this.type() + ">电脑");
    }
}
