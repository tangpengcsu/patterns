package facade;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class XiHuApartment {
    private String location;
    private double price;
    private int status;

    public XiHuApartment(String location, double price, int status) {
        this.location = location;
        this.price = price;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
