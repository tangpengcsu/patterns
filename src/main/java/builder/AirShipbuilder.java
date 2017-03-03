package builder;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public interface AirShipbuilder {
    void builtEngine();

    void builtEscapeTower();

    void builtOrbitalModule();

    AirShip getResult();
}
