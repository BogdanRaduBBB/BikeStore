package ro.itschool.pojo;

import java.util.UUID;

public abstract class Motorcycle {
    protected int id;
    protected int price;
    protected String model;
    protected String manufacturer;
    protected int fabricationYear;

    public Motorcycle() {
    }

    public Motorcycle(int id, int price, String model, String manufacturer, int fabricationYear) {
        this.id = id;
        this.price = price;
        this.model = model;
        this.manufacturer = manufacturer;
        this.fabricationYear = fabricationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
       if(id==0)
        this.id = id;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", fabricationYear=" + fabricationYear +
                ';';
    }
}
