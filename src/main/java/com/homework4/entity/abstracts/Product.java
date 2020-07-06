package main.java.com.homework4.entity.abstracts;

import main.java.com.homework4.execeptions.ProductException;
import main.java.com.homework4.entity.enums.AgeRestriction;
import main.java.com.homework4.interfaces.Buyable;

public abstract class Product implements Buyable {
    private String name;
    private double price;
    private double quantity;
    private AgeRestriction ageRestriction;

    public Product(String name, double price, double quantity, AgeRestriction ageRestriction) throws ProductException {
        if (name == null || !name.isBlank()) {
            throw new ProductException("Name cannot be empty");
        }
        if (price < 0) {
            throw new ProductException("Price not valid");
        }
        if (quantity < 0) {
            throw new ProductException("Quantity not valid");
        }
        if (ageRestriction == null) {
            throw new ProductException("AgeRestriction not valid");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    protected Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ProductException {
        if (name == null || !name.isBlank()) {
            throw new ProductException("Name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws ProductException {
        if (price < 0) {
            throw new ProductException("Price not valid");
        }
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) throws ProductException {
        if (quantity < 0) {
            throw new ProductException("Quantity not valid");
        }
        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) throws ProductException {
        if (ageRestriction == null) {
            throw new ProductException("AgeRestriction not valid");
        }
        this.ageRestriction = ageRestriction;
    }
}
