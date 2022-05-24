package org.example.model;

public class Guitar {
    private String serialNumber, builder, model, type, backWood, topWood;
    private double price;

    public Guitar(
        String serialNumber, double price, String builder, String model,
        String type, String backWood, String topWood
    ) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model =  model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getTopWood() {
        return topWood;
    }

    public String getType() {
        return type;
    }
}
