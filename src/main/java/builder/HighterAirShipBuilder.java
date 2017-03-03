package builder;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class HighterAirShipBuilder implements AirShipbuilder{
    private AirShip airShip = new AirShip();

    public void builtEngine() {
        System.out.println("\t\t构造高端引擎");
        airShip.setEngine(new Engine("高端 - 引擎"));
    }

    public void builtEscapeTower() {
        System.out.println("\t\t构造高端逃逸塔");
        airShip.setEscapeTower(new EscapeTower("高端 - 逃逸塔"));
    }

    public void builtOrbitalModule() {
        System.out.println("\t\t构造高端轨道舱");
        airShip.setOrbitalModule(new OrbitalModule("高端 - 轨道舱"));
    }

    public AirShip getResult() {
        return airShip;
    }
}
