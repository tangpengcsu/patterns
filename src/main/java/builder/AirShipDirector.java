package builder;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class AirShipDirector {
    public static void construct(AirShipbuilder builder) {
        builder.builtEngine();
        builder.builtEscapeTower();
        builder.builtOrbitalModule();
    }
}
