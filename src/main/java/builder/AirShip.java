package builder;



/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class AirShip {
    private Engine engine;
    private EscapeTower escapeTower;
    private OrbitalModule orbitalModule;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public EscapeTower getEscapeTower() {

        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    @Override
    public String toString() {
        return "AirShip{" +
                "engine=" + engine +
                ", escapeTower=" + escapeTower +
                ", orbitalModule=" + orbitalModule +
                '}';
    }
}
