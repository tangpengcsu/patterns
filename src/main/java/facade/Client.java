package facade;

import org.junit.Test;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Client {
    @Test
    public void client(){
        MediumFacade facade = new MediumFacade();
        facade.rentingHouse(900);
    }
}
