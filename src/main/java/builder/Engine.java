package builder;

/**
 * @DESCRIPTION ${DESCRIPTION}
 * @Author TangPeng
 * @Date 2017-3-3
 */
public class Engine {
    private String description;

    public Engine(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "description='" + description + '\'' +
                '}';
    }
}
