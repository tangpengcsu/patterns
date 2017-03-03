package builder;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Client {
    @Test
    public void Client() {
        AirShipbuilder lowBuilder = new LowerAirShipBuilder();

        AirShipDirector.construct(lowBuilder);
        AirShip lowShip = lowBuilder.getResult();
        System.out.println(lowShip);

        AirShipbuilder highBuilder = new HighterAirShipBuilder();

        AirShipDirector.construct(highBuilder);
        AirShip highShip = highBuilder.getResult();
        System.out.println(highShip);
    }
}
