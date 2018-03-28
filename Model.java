package Car;

public class Model {

    private String name;
    private String productionPeriod;
    private Type type;

    public Model() {
    }

    public Model(String name, String productionPeriod, Type type) {
        this.name = name;
        this.productionPeriod = productionPeriod;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getProductionPeriod() {
        return productionPeriod;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "model.Model{" +
                "name='" + name + '\'' +
                ", productionPeriod='" + productionPeriod + '\'' +
                ", type=" + type +
                '}';
    }

    public enum Type {
        CABRIOLET, SEDAN, UNIVERSAL, COUPE
    }
}
