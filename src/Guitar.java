public class Guitar {
    private String serialNumber;
    private double price;
    private String builder;
    private String type;
    private String backWood;
    private String model;
    private String topWood;

    public Guitar(String serialNumber, double price, String builder, String type, String backWood, String model, String topWood) {
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

    public String getBuilder() {
        return builder;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getModel() {
        return model;
    }

    public String getTopWood() {
        return topWood;
    }
}
