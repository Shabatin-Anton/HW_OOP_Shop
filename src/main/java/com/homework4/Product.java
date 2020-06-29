package main.java.com.homework4;

import main.java.com.homework4.interfaces.Bayable;

public abstract class Product implements Bayable {

    private String name;
    private double price;
    protected int quantity;
    private AgeRestriction ageRestriction;

    public enum  AgeRestriction {
        NONE(0), TEENAGER(17), ADULT(18);

        private int value = 0;

        AgeRestriction(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int getAgeRestrictionValue() {
            AgeRestriction ageRestriction = AgeRestriction.NONE;
            return ageRestriction.getValue();
        }
    }

    public Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product " + "name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", ageRestriction=" + ageRestriction;
    }
}
