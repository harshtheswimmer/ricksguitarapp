import enums.Builder;
import enums.Type;
import enums.Wood;

public class Guitar {
    private String serialNumber;
    private double price;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private String model;
    private Wood topWood;

    public Guitar(String serialNumber, double price, Builder builder, Type type, Wood backWood, String model, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.model = model;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public String getModel() {
        return model;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
