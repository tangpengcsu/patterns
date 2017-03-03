package builder;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-2
 */
public class OrbitalModule {
   private String description;

    public OrbitalModule(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrbitalModule{" +
                "description='" + description + '\'' +
                '}';
    }
}
